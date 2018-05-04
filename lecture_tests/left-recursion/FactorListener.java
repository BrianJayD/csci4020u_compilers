// Generated from Factor.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FactorParser}.
 */
public interface FactorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FactorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FactorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FactorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FactorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FactorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FactorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FactorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FactorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FactorParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(FactorParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FactorParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(FactorParser.AdditionContext ctx);
}