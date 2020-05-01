import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class QuadsGenerator extends Small_JavaBaseListener {
    Quads tabQuad = new Quads();
    Pile pile = new Pile();
    private int compteurTEMPS = 0;
    private int sauv_condition;
    private int sauv_conditionDeb = 0;
    public void displayQuadruple() {
        tabQuad.DisplayQuad();
    }
    @Override
    public void exitProgram(Small_JavaParser.ProgramContext ctx) {
        tabQuad.addQuad(new Quad("END", "" + (tabQuad.size() + 1), " ", " "));
        if (!Semantic.lexerErrorFound) {
             displayQuadruple();

            Code_obj code_obj = new Code_obj(tabQuad);
            code_obj.Display_Code_Obj();
        }
    }

    @Override
    public void exitImp(Small_JavaParser.ImpContext ctx) {

    }


    @Override
    public void exitDeclaration(Small_JavaParser.DeclarationContext ctx) {


    }

    @Override
    public void exitType(Small_JavaParser.TypeContext ctx) {
    }

    @Override
    public void exitVars(Small_JavaParser.VarsContext ctx) {
    }

    @Override
    public void exitIdf(Small_JavaParser.IdfContext ctx) {

    }

    @Override
    public void exitValue(Small_JavaParser.ValueContext ctx) {


    }

    @Override
    public void exitInstructions(Small_JavaParser.InstructionsContext ctx) {
    }

    @Override
    public void exitInst(Small_JavaParser.InstContext ctx) {
    }

    @Override
    public void exitAffect(Small_JavaParser.AffectContext ctx) {
        String idf = ctx.getChild(0).getText();
        String resultatAFF = pile.depiler();
        tabQuad.addQuad(new Quad(":=", "", resultatAFF, idf));

        pile.ViderPile();

    }

    @Override
    public void exitExp(Small_JavaParser.ExpContext ctx) {
        if(ctx.exp()!=null){
            String temp = "Temp" + (++compteurTEMPS);

            String expVal = pile.depiler();
            String exp1Val = pile.depiler();

            tabQuad.addQuad(new Quad(ctx.op2().getText(), expVal, exp1Val, temp));
            pile.empiler(temp);
        }

    }

    @Override
    public void exitOp2(Small_JavaParser.Op2Context ctx) {
        if(ctx.op2()!=null){
            String temp = "Temp" + (++compteurTEMPS);

            String expVal = pile.depiler();
            String exp1Val = pile.depiler();

            tabQuad.addQuad(new Quad(ctx.op3().getText(), expVal, exp1Val, temp));
            pile.empiler(temp);
        }

    }


    @Override
    public void exitOp3(Small_JavaParser.Op3Context ctx) {


    }

    @Override
    public void exitOp4(Small_JavaParser.Op4Context ctx) {
        if(ctx.op4()!=null){
            String temp = "Temp" + (++compteurTEMPS);

            String expVal = pile.depiler();
            String exp1Val = pile.depiler();

            String op=ctx.comp().getText();
            tabQuad.addQuad(new Quad(op, expVal, exp1Val, temp));
            pile.empiler(temp);
        }

    }


    @Override
    public void exitOp5(Small_JavaParser.Op5Context ctx) {
        if(ctx.op5()!=null){
            String temp = "Temp" + (++compteurTEMPS);

            String expVal = pile.depiler();
            String exp1Val = pile.depiler();
            String op = ctx.MNS()==null?ctx.PLS().getText():ctx.MNS().getText();

            tabQuad.addQuad(new Quad(op, expVal, exp1Val, temp));
            pile.empiler(temp);
        }

    }


    @Override
    public void exitOp6(Small_JavaParser.Op6Context ctx) {
        if(ctx.op6()!=null){
            String temp = "Temp" + (++compteurTEMPS);

            String expVal = pile.depiler();
            String exp1Val = pile.depiler();
            String op = ctx.DIV()==null?ctx.MUL().getText():ctx.DIV().getText();
            tabQuad.addQuad(new Quad(op, expVal, exp1Val, temp));
            pile.empiler(temp);
        }

    }


    @Override
    public void exitOp7(Small_JavaParser.Op7Context ctx) {
        if (ctx.terme() != null) {
            pile.empiler(ctx.terme().getText());
        } else {
            if (ctx.exp() != null) {
                pile.empiler(ctx.exp().getText());
            }
        }
    }

    @Override
    public void exitTerme(Small_JavaParser.TermeContext ctx) {




    }

    @Override
    public void exitIfinst(Small_JavaParser.IfinstContext ctx) {
        tabQuad.getQuad(sauv_condition).set(1, "" + (tabQuad.size()));

    }

    @Override
    public void exitEl(Small_JavaParser.ElContext ctx) {
        sauv_condition = tabQuad.addQuad("BR", "", "", "");
        tabQuad.getQuad(sauv_condition).set(1, "" + (tabQuad.size() + 1));

        if (sauv_conditionDeb != 0)
            if (tabQuad.getQuad(sauv_conditionDeb).get(1).equals(""))
                tabQuad.getQuad(sauv_conditionDeb).set(1, "" + (tabQuad.size()));
    }

    @Override
    public void exitComp(Small_JavaParser.CompContext ctx) {
        String exp1Val = pile.depiler();
        String expVal = pile.depiler();


        if (ctx.getChild(1).getText().equals("<")) {
            sauv_condition = tabQuad.addQuad(new Quad("BGE", "", expVal, exp1Val));
        }
        if (ctx.getChild(1).getText().equals("<=")) {
            sauv_condition = tabQuad.addQuad(new Quad("BG", "", expVal, exp1Val));
        }
        if (ctx.getChild(1).getText().equals(">")) {
            sauv_condition = tabQuad.addQuad(new Quad("BLE", "", expVal, exp1Val));
        }
        if (ctx.getChild(1).getText().equals(">=")) {
            sauv_condition = tabQuad.addQuad(new Quad("BL", "", expVal, exp1Val));
        }
        if (ctx.getChild(1).getText().equals("==")) {
            sauv_condition = tabQuad.addQuad(new Quad("BNE", "", expVal, exp1Val));
        }
        if (ctx.getChild(1).getText().equals("!=")) {
            sauv_condition = tabQuad.addQuad(new Quad("BE", "", expVal, exp1Val));
        }

        if (sauv_conditionDeb == 0) sauv_conditionDeb = sauv_condition;

    }

    @Override
    public void exitOp(Small_JavaParser.OpContext ctx) {

    }
    @Override
    public void exitRead(Small_JavaParser.ReadContext ctx)
    {

    }
    public void exitWrite(Small_JavaParser.WriteContext ctx)
    {

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
    }

}
