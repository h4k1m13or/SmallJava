// Generated from C:/Users/hakim/Desktop/M1_SII/SmallJava/src\Small_Java.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Small_JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Small_JavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Small_JavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#imp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp(Small_JavaParser.ImpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(Small_JavaParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(Small_JavaParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Small_JavaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Small_JavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(Small_JavaParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#idf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdf(Small_JavaParser.IdfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Small_JavaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(Small_JavaParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(Small_JavaParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#affect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffect(Small_JavaParser.AffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(Small_JavaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(Small_JavaParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(Small_JavaParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp4(Small_JavaParser.Op4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#op5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp5(Small_JavaParser.Op5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#op6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp6(Small_JavaParser.Op6Context ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#op7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp7(Small_JavaParser.Op7Context ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#terme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerme(Small_JavaParser.TermeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(Small_JavaParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(Small_JavaParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#signe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigne(Small_JavaParser.SigneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#ifinst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfinst(Small_JavaParser.IfinstContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEl(Small_JavaParser.ElContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(Small_JavaParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(Small_JavaParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Small_JavaParser#listID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListID(Small_JavaParser.ListIDContext ctx);
}