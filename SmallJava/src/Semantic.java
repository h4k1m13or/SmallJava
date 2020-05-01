import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedList;

public class Semantic extends Small_JavaBaseListener {
    private static final int DECLARED = 1;
    private static final int UNDECLARED = 2;
    private static final int IMPORT = 4;
    private static final int STRING = 3;
    private static final int FLOAT = 2;
    private static final int INT = 1;
    public static boolean lexerErrorFound = false;
    private TS table = new TS();
    private LinkedList<String> errors = new LinkedList<String>();
    private HashMap<ParserRuleContext, Integer> types = new HashMap();


    @Override
    public void exitProgram(Small_JavaParser.ProgramContext ctx) {

        if (errors.size() == 0) { // no errors
            System.out.println("program compiled without errors!");
            System.out.println("symbols table: ");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("|      var           |     Type      |     Declared     |   Defined    |");
            System.out.println("------------------------------------------------------------------------");
            for (int i = 0; i < table.getSize(); i++) {
                System.out.println(table.getElement(i).toString());
                System.out.println("------------------------------------------------------------------------");
            }
        } else {
            System.out.println("program compiled with the following errors");
            int i=1;
            for (String error : errors) {
                System.out.println("\u001B[31m"+"Error N° "+i+" : "+error+"\u001B[0m");
                i++;
            }
        }


    }

    @Override
    public void exitImp(Small_JavaParser.ImpContext ctx) {
        String bib = ctx.LIB().getText();
        if (table.containsElement(bib)) {

            errors.add("Double import of : " + bib);
        } else {
            table.addElement(new TS.Element(bib, DECLARED, IMPORT, 1,1));
        }

    }


    @Override
    public void exitDeclaration(Small_JavaParser.DeclarationContext ctx) {
        int type = 0;
        String t = ctx.type().getText();
        if (t.equals("int_SJ")) {
            type = INT;
        } else if (t.equals("float_SJ"))
            type = FLOAT;
        else if (t.equals("string_SJ")) type = STRING;


        Small_JavaParser.VarsContext vars = ctx.vars();

        for (; ; vars = vars.vars()) // loop over vars
        {
            String varName = vars.getChild(0).getText();
            if (table.containsElement(varName)) {
                errors.add("Double declaration of variable: " + varName);
            } else
                table.addElement(new TS.Element(varName, DECLARED, type, 1,0));
            if (vars.vars() == null)
                return;
        }
    }

    @Override
    public void exitType(Small_JavaParser.TypeContext ctx) {
    }

    @Override
    public void exitVars(Small_JavaParser.VarsContext ctx) {
    }

    @Override
    public void exitIdf(Small_JavaParser.IdfContext ctx) {
        // check if ID has been declared
        if (!table.containsElement(ctx.ID().getText())) {
            errors.add("variable " + ctx.ID().getText() + " has not been declared");
            table.addElement(new TS.Element(ctx.ID().getText(), UNDECLARED, INT | FLOAT | STRING, 1,0));
            // adding non declared variable in order to not generate same error again
        }
    }

    @Override
    public void exitValue(Small_JavaParser.ValueContext ctx) {
        int type = 0;
        if (ctx.INTVAL() != null)
            addCtxType(ctx, INT);
        else if (ctx.FLOATVAL() != null)
            addCtxType(ctx, FLOAT);
        else if (ctx.STRVAL() != null)
            addCtxType(ctx, STRING);

    }

    @Override
    public void exitInstructions(Small_JavaParser.InstructionsContext ctx) {
    }

    @Override
    public void exitInst(Small_JavaParser.InstContext ctx) {
    }

    @Override
    public void exitAffect(Small_JavaParser.AffectContext ctx) {
        if(table.containsElement(ctx.idf().getText())){

            if (!isCompatible(getCtxType(ctx.exp()), table.getElement(ctx.idf().getText()).type)) {
            errors.add("incompatible types in affectation " + ctx.getText());
            types.clear();
            }
        }else
        {
            errors.add("variable " + ctx.idf().getText() + " has not been declared");

        }


    }

    @Override
    public void exitExp(Small_JavaParser.ExpContext ctx) {
        if (ctx.exp() == null)
            addCtxType(ctx, getCtxType(ctx.op2()));
        else {
            if (isCompatible(getCtxType(ctx.op2()), getCtxType(ctx.exp())))
                addCtxType(ctx, getResultType(getCtxType(ctx.op2()), getCtxType(ctx.exp())));
            else {
                addCtxType(ctx, 0);
                System.out.println("incompatible type between " + ctx.op2().getText() + " and " + ctx.exp().getText());
                System.out.println(ctx.op2().getText() + " type: " + getCtxType(ctx.op2()) + " and " + ctx.exp().getText() + " type: " + getCtxType(ctx.exp()));
            }

        }
    }

    @Override
    public void exitOp2(Small_JavaParser.Op2Context ctx) {
        if (ctx.op2() == null)
            addCtxType(ctx, getCtxType(ctx.op3()));
        else {
            if (isCompatible(getCtxType(ctx.op2()), getCtxType(ctx.op3())))
                addCtxType(ctx, getResultType(getCtxType(ctx.op2()), getCtxType(ctx.op3())));
            else {
                addCtxType(ctx, 0); // type 0 will always generate error
                System.out.println("incompatible type between " + ctx.op2().getText() + " and " + ctx.op3().getText());
                System.out.println(ctx.op2().getText() + " type: " + getCtxType(ctx.op2()) + " and " + ctx.op3().getText() + " type: " + getCtxType(ctx.op3()));
            }

        }
    }

    @Override
    public void exitOp3(Small_JavaParser.Op3Context ctx) {
        addCtxType(ctx, getCtxType(ctx.op4()));

    }

    @Override
    public void exitOp4(Small_JavaParser.Op4Context ctx) {
        if (ctx.op4() == null)
            addCtxType(ctx, getCtxType(ctx.op5()));
        else {
            if (isCompatible(getCtxType(ctx.op5()), getCtxType(ctx.op4())))
                addCtxType(ctx, getResultType(getCtxType(ctx.op5()), getCtxType(ctx.op4())));
            else {
                addCtxType(ctx, 0);
                System.out.println("incompatible type between " + ctx.op5().getText() + " and " + ctx.op4().getText());
                System.out.println(ctx.op5().getText() + " type: " + getCtxType(ctx.op5()) + " and " + ctx.op4().getText() + " type: " + getCtxType(ctx.op4()));
            }

        }
    }

    @Override
    public void exitOp5(Small_JavaParser.Op5Context ctx) {
        if (ctx.op5() == null)
            addCtxType(ctx, getCtxType(ctx.op6()));
        else {
            if (isCompatible(getCtxType(ctx.op5()), getCtxType(ctx.op6())))
                addCtxType(ctx, getResultType(getCtxType(ctx.op5()), getCtxType(ctx.op6())));
            else {
                addCtxType(ctx, 0); // type 0 will always generate error
                System.out.println("incompatible type between " + ctx.op5().getText() + " and " + ctx.op6().getText());
                System.out.println(ctx.op5().getText() + " type: " + getCtxType(ctx.op5()) + " and " + ctx.op6().getText() + " type: " + getCtxType(ctx.op6()));
            }

        }
    }

    @Override
    public void exitOp6(Small_JavaParser.Op6Context ctx) {
        if (ctx.op6() == null)
            addCtxType(ctx, getCtxType(ctx.op7()));
        else {
            if (isCompatible(getCtxType(ctx.op6()), getCtxType(ctx.op7())))
                addCtxType(ctx, getResultType(getCtxType(ctx.op6()), getCtxType(ctx.op7())));
            else {
                addCtxType(ctx, 0); // type 0 will always generate error
                System.out.println("incompatible type between " + ctx.op6().getText() + " and " + ctx.op7().getText());

                System.out.println(ctx.op6().getText() + " type: " + getCtxType(ctx.op6()) + " and " + ctx.op7().getText() + " type: " + getCtxType(ctx.op7()));
            }

        }
    }

    @Override
    public void exitOp7(Small_JavaParser.Op7Context ctx) {
        if (ctx.terme() != null) {
            addCtxType(ctx, getCtxType(ctx.terme()));

        } else {

            if (ctx.exp() != null) {
                addCtxType(ctx, getCtxType(ctx.exp()));
            }
        }
    }

    @Override
    public void exitTerme(Small_JavaParser.TermeContext ctx) {

        if (ctx.idf() != null) {
            String varName = ctx.idf().getText();
            if (table.containsElement(varName)) {
                addCtxType(ctx, table.getElement(varName).type);
                table.getElement(ctx.idf().getText()).setDefined(1);

            } else{
                errors.add("variable " + ctx.idf().getText() + " has not been declared");
                table.addElement(new TS.Element(ctx.idf().getText(), UNDECLARED, INT | FLOAT | STRING, 1,0));
            }

        } else if (ctx.value().STRVAL() == null)
            if (ctx.value().FLOATVAL() == null)
                addCtxType(ctx, INT);

            else
                addCtxType(ctx, FLOAT);
        else if (ctx.value().FLOATVAL() == null)
            if (ctx.value().STRVAL() == null)
                addCtxType(ctx, INT);
            else addCtxType(ctx, STRING);
        else
            if(ctx.value().FLOATVAL()==null)
                addCtxType(ctx,STRING);
            else addCtxType(ctx,FLOAT);


    }

    @Override
    public void exitIfinst(Small_JavaParser.IfinstContext ctx) {

    }

    @Override
    public void exitEl(Small_JavaParser.ElContext ctx) {
    }

    @Override
    public void exitComp(Small_JavaParser.CompContext ctx) {
        int typeLeft = getCtxType((ParserRuleContext) ctx.getChild(0));
        int typeRight = getCtxType((ParserRuleContext) ctx.getChild(2));

        if (!isCompatible(typeLeft, typeRight))
            System.out.println("Types de conditions incompatible " + ctx.getText());
    }

    @Override
    public void exitOp(Small_JavaParser.OpContext ctx) {

    }
    @Override
    public void exitRead(Small_JavaParser.ReadContext ctx)
    {
        if(table.containsElement(" Small_Java.io"))
        {
            int typesigne;
            typesigne=ctx.signe().INTS()==null?ctx.signe().FLOATS()==null?3:2:1;
            if(!(table.getElement(ctx.idf().getText()).type==typesigne))
                errors.add("Incompatible types in "+ctx.getText());
        }
        else {
            errors.add("Library Small_Java.io is missing  "+ctx.getText());
        }
    }
    public void exitWrite(Small_JavaParser.WriteContext ctx)
    {
        if(table.containsElement(" Small_Java.io"))
        {
            int typesigne;
            String signe=ctx.STRVAL().getText().substring(ctx.STRVAL().getText().length()-2,ctx.STRVAL().getText().length());
            if (signe.equals("%d"))
                typesigne=1;
            if(signe.equals("%f"))
                typesigne=2;
            else typesigne=3;
            if(!(table.getElement(ctx.idf().getText()).type==typesigne))
                errors.add("Incompatible types in "+ctx.getText());
        }
        else {
            errors.add("Library Small_Java.io is missing  "+ctx.getText());
        }
    }

    @Override
    public void exitListID(Small_JavaParser.ListIDContext ctx) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode node) {
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        lexerErrorFound = true;
    }

    public LinkedList<String> getErrors() {
        return errors;
    }

    private void addCtxType(ParserRuleContext ctx, int type) {
        types.put(ctx, type);
    }

    private int getCtxType(ParserRuleContext ctx) {
        return types.get(ctx);

    }

    private boolean isCompatible(int a, int b) {
        if (a == b)
            return true;
        else if (a < 3 && b < 3) {
            return true;
        }
        return false;
    }

    private int getResultType(int a, int b) {
        if (a == INT && b == INT)
            return INT;
        else return FLOAT;
    }

}