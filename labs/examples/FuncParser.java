// Generated from Func.g4 by ANTLR 4.7.1

    import java.util.Map;
    import java.util.ArrayList;
    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FuncParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, INT=9, NL=10, 
		WS=11;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assign = 2, RULE_list = 3, 
		RULE_function = 4;
	public static final String[] ruleNames = {
		"program", "statement", "assign", "list", "function"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'['", "','", "']'", "'reduce('", "'*'", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ID", "INT", "NL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Func.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public Map<String, ArrayList<Integer>> memory = new HashMap<>();

	    //save
	    public void save(String id, ArrayList<Integer> list) {
	      System.out.println(id + " = " + list.toString());
	      this.memory.put(id, list);
	    }

	    //load
	    public ArrayList<Integer> load(String id) {
	      return this.memory.get(id);
	    }

	    //multiply
	    public Integer mul(ArrayList<Integer> list) {
	      Integer result = 1;
	      for (Integer ele: list) {
	        result *= ele;
	      }
	      return result;
	    }

	public FuncParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(FuncParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FuncParser.NL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				statement();
				setState(11);
				match(NL);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public FunctionContext function;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				assign();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				((StatementContext)_localctx).function = function();
				System.out.println(((StatementContext)_localctx).function.v);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public Token ID;
		public ListContext list;
		public TerminalNode ID() { return getToken(FuncParser.ID, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			((AssignContext)_localctx).ID = match(ID);
			setState(24);
			match(T__0);
			setState(25);
			((AssignContext)_localctx).list = list();

			      save((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null), ((AssignContext)_localctx).list.v);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public ArrayList<Integer> v = new ArrayList<>();
		public Token i1;
		public Token i2;
		public List<TerminalNode> INT() { return getTokens(FuncParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FuncParser.INT, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__1);
			setState(29);
			((ListContext)_localctx).i1 = match(INT);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(30);
				match(T__2);
				setState(31);
				((ListContext)_localctx).i2 = match(INT);
				_localctx.v.add(Integer.parseInt((((ListContext)_localctx).i2!=null?((ListContext)_localctx).i2.getText():null)));
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(T__3);

			      _localctx.v.add(Integer.parseInt((((ListContext)_localctx).i1!=null?((ListContext)_localctx).i1.getText():null)));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Integer v;
		public Token ID;
		public TerminalNode ID() { return getToken(FuncParser.ID, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncListener ) ((FuncListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__4);
			setState(42);
			((FunctionContext)_localctx).ID = match(ID);
			setState(43);
			match(T__2);
			setState(44);
			match(T__5);
			setState(45);
			match(T__6);
			((FunctionContext)_localctx).v =  mul(load((((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3"+
		"\3\3\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5$\n\5"+
		"\f\5\16\5\'\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4"+
		"\6\b\n\2\2\2\60\2\17\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b\36\3\2\2\2\n"+
		"+\3\2\2\2\f\r\5\4\3\2\r\16\7\f\2\2\16\20\3\2\2\2\17\f\3\2\2\2\20\21\3"+
		"\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\30\5\6\4\2\24\25\5"+
		"\n\6\2\25\26\b\3\1\2\26\30\3\2\2\2\27\23\3\2\2\2\27\24\3\2\2\2\30\5\3"+
		"\2\2\2\31\32\7\n\2\2\32\33\7\3\2\2\33\34\5\b\5\2\34\35\b\4\1\2\35\7\3"+
		"\2\2\2\36\37\7\4\2\2\37%\7\13\2\2 !\7\5\2\2!\"\7\13\2\2\"$\b\5\1\2# \3"+
		"\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\6\2\2)"+
		"*\b\5\1\2*\t\3\2\2\2+,\7\7\2\2,-\7\n\2\2-.\7\5\2\2./\7\b\2\2/\60\7\t\2"+
		"\2\60\61\b\6\1\2\61\13\3\2\2\2\5\21\27%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}