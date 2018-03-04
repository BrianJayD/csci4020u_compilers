// Generated from Calc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#progg}.
	 * @param ctx the parse tree
	 */
	void enterProgg(CalcParser.ProggContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#progg}.
	 * @param ctx the parse tree
	 */
	void exitProgg(CalcParser.ProggContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CalcParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CalcParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalcParser.ExprContext ctx);
}