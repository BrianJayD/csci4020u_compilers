// Generated from Midterm.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MidtermParser}.
 */
public interface MidtermListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MidtermParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(MidtermParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidtermParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(MidtermParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidtermParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(MidtermParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidtermParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(MidtermParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidtermParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(MidtermParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidtermParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(MidtermParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidtermParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MidtermParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidtermParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MidtermParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidtermParser#array_values}.
	 * @param ctx the parse tree
	 */
	void enterArray_values(MidtermParser.Array_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidtermParser#array_values}.
	 * @param ctx the parse tree
	 */
	void exitArray_values(MidtermParser.Array_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidtermParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MidtermParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidtermParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MidtermParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidtermParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MidtermParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidtermParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MidtermParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MidtermParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MidtermParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MidtermParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MidtermParser.NumberContext ctx);
}