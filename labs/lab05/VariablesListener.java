// Generated from Variables.g4 by ANTLR 4.7.1



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VariablesParser}.
 */
public interface VariablesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VariablesParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(VariablesParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariablesParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(VariablesParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariablesParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(VariablesParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariablesParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(VariablesParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariablesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(VariablesParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariablesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(VariablesParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariablesParser#initialize}.
	 * @param ctx the parse tree
	 */
	void enterInitialize(VariablesParser.InitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariablesParser#initialize}.
	 * @param ctx the parse tree
	 */
	void exitInitialize(VariablesParser.InitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariablesParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(VariablesParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariablesParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(VariablesParser.InputContext ctx);
}