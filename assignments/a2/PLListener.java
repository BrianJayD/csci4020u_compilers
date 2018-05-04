// Generated from PL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLParser}.
 */
public interface PLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(PLParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(PLParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#funcInvoke}.
	 * @param ctx the parse tree
	 */
	void enterFuncInvoke(PLParser.FuncInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#funcInvoke}.
	 * @param ctx the parse tree
	 */
	void exitFuncInvoke(PLParser.FuncInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(PLParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(PLParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#dataExpr}.
	 * @param ctx the parse tree
	 */
	void enterDataExpr(PLParser.DataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#dataExpr}.
	 * @param ctx the parse tree
	 */
	void exitDataExpr(PLParser.DataExprContext ctx);
}