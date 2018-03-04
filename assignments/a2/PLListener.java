// Generated from PL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLParser}.
 */
public interface PLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(PLParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(PLParser.LineContext ctx);
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
	 * Enter a parse tree produced by {@link PLParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(PLParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(PLParser.LoopContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PLParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PLParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PLParser.BoolContext ctx);
}