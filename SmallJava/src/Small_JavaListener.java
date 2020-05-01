// Generated from C:/Users/hakim/Desktop/M1_SII/SmallJava/src\Small_Java.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Small_JavaParser}.
 */
public interface Small_JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Small_JavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Small_JavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#imp}.
	 * @param ctx the parse tree
	 */
	void enterImp(Small_JavaParser.ImpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#imp}.
	 * @param ctx the parse tree
	 */
	void exitImp(Small_JavaParser.ImpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(Small_JavaParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(Small_JavaParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(Small_JavaParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(Small_JavaParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Small_JavaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Small_JavaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Small_JavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Small_JavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(Small_JavaParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(Small_JavaParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#idf}.
	 * @param ctx the parse tree
	 */
	void enterIdf(Small_JavaParser.IdfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#idf}.
	 * @param ctx the parse tree
	 */
	void exitIdf(Small_JavaParser.IdfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Small_JavaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Small_JavaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(Small_JavaParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(Small_JavaParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(Small_JavaParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(Small_JavaParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#affect}.
	 * @param ctx the parse tree
	 */
	void enterAffect(Small_JavaParser.AffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#affect}.
	 * @param ctx the parse tree
	 */
	void exitAffect(Small_JavaParser.AffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(Small_JavaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(Small_JavaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(Small_JavaParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(Small_JavaParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(Small_JavaParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(Small_JavaParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#op4}.
	 * @param ctx the parse tree
	 */
	void enterOp4(Small_JavaParser.Op4Context ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#op4}.
	 * @param ctx the parse tree
	 */
	void exitOp4(Small_JavaParser.Op4Context ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#op5}.
	 * @param ctx the parse tree
	 */
	void enterOp5(Small_JavaParser.Op5Context ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#op5}.
	 * @param ctx the parse tree
	 */
	void exitOp5(Small_JavaParser.Op5Context ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#op6}.
	 * @param ctx the parse tree
	 */
	void enterOp6(Small_JavaParser.Op6Context ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#op6}.
	 * @param ctx the parse tree
	 */
	void exitOp6(Small_JavaParser.Op6Context ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#op7}.
	 * @param ctx the parse tree
	 */
	void enterOp7(Small_JavaParser.Op7Context ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#op7}.
	 * @param ctx the parse tree
	 */
	void exitOp7(Small_JavaParser.Op7Context ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#terme}.
	 * @param ctx the parse tree
	 */
	void enterTerme(Small_JavaParser.TermeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#terme}.
	 * @param ctx the parse tree
	 */
	void exitTerme(Small_JavaParser.TermeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(Small_JavaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(Small_JavaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(Small_JavaParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(Small_JavaParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#signe}.
	 * @param ctx the parse tree
	 */
	void enterSigne(Small_JavaParser.SigneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#signe}.
	 * @param ctx the parse tree
	 */
	void exitSigne(Small_JavaParser.SigneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#ifinst}.
	 * @param ctx the parse tree
	 */
	void enterIfinst(Small_JavaParser.IfinstContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#ifinst}.
	 * @param ctx the parse tree
	 */
	void exitIfinst(Small_JavaParser.IfinstContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#el}.
	 * @param ctx the parse tree
	 */
	void enterEl(Small_JavaParser.ElContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#el}.
	 * @param ctx the parse tree
	 */
	void exitEl(Small_JavaParser.ElContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(Small_JavaParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(Small_JavaParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(Small_JavaParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(Small_JavaParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Small_JavaParser#listID}.
	 * @param ctx the parse tree
	 */
	void enterListID(Small_JavaParser.ListIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Small_JavaParser#listID}.
	 * @param ctx the parse tree
	 */
	void exitListID(Small_JavaParser.ListIDContext ctx);
}