// Generated from Func.g4 by ANTLR 4.7.1

    import java.util.Map;
    import java.util.ArrayList;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FuncParser}.
 */
public interface FuncListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FuncParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FuncParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FuncParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FuncParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FuncParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(FuncParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(FuncParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FuncParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FuncParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FuncParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FuncParser.FunctionContext ctx);
}