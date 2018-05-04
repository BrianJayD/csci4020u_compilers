// Generated from PL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, INT=15, BOOL=16, ASMT=17, 
		WS=18, NEWLINE=19;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_whileLoop = 2, RULE_funcInvoke = 3, 
		RULE_assignment = 4, RULE_declaration = 5, RULE_booleanExpr = 6, RULE_dataExpr = 7;
	public static final String[] ruleNames = {
		"program", "statement", "whileLoop", "funcInvoke", "assignment", "declaration", 
		"booleanExpr", "dataExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'while'", "'{'", "'}'", "'('", "')'", "'declare'", "'and'", "'or'", 
		"'+'", "'*'", "'-'", "'/'", "','", null, null, null, "'='", null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "INT", "BOOL", "ASMT", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "PL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLParser(TokenStream input) {
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				statement();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
		public TerminalNode NEWLINE() { return getToken(PLParser.NEWLINE, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FuncInvokeContext funcInvoke() {
			return getRuleContext(FuncInvokeContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				declaration();
				setState(23);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				assignment();
				setState(26);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				funcInvoke();
				setState(29);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				whileLoop();
				setState(32);
				match(NEWLINE);
				}
				break;
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

	public static class WhileLoopContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			booleanExpr(0);
			setState(38);
			match(T__1);
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				statement();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << ID) | (1L << NEWLINE))) != 0) );
			setState(44);
			match(T__2);
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

	public static class FuncInvokeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public FuncInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).enterFuncInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).exitFuncInvoke(this);
		}
	}

	public final FuncInvokeContext funcInvoke() throws RecognitionException {
		FuncInvokeContext _localctx = new FuncInvokeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcInvoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ID);
			setState(47);
			match(T__3);
			setState(48);
			dataExpr(0);
			setState(49);
			match(T__4);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public TerminalNode ASMT() { return getToken(PLParser.ASMT, 0); }
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			setState(52);
			match(ASMT);
			setState(53);
			dataExpr(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__5);
			setState(56);
			assignment();
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

	public static class BooleanExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLParser.ID, i);
		}
		public TerminalNode BOOL() { return getToken(PLParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(PLParser.INT, 0); }
		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}
		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class,i);
		}
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).exitBooleanExpr(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		return booleanExpr(0);
	}

	private BooleanExprContext booleanExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, _parentState);
		BooleanExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_booleanExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(59);
				match(ID);
				setState(60);
				match(BOOL);
				setState(61);
				match(INT);
				}
				break;
			case 2:
				{
				setState(62);
				match(ID);
				setState(63);
				match(BOOL);
				setState(64);
				match(ID);
				}
				break;
			case 3:
				{
				setState(65);
				match(T__3);
				setState(66);
				booleanExpr(0);
				setState(67);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						setState(71);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(72);
						match(T__6);
						setState(73);
						booleanExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						setState(74);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(75);
						match(T__7);
						setState(76);
						booleanExpr(3);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DataExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PLParser.INT, 0); }
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public DataExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).enterDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLListener ) ((PLListener)listener).exitDataExpr(this);
		}
	}

	public final DataExprContext dataExpr() throws RecognitionException {
		return dataExpr(0);
	}

	private DataExprContext dataExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DataExprContext _localctx = new DataExprContext(_ctx, _parentState);
		DataExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_dataExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(83);
				match(INT);
				}
				break;
			case ID:
				{
				setState(84);
				match(ID);
				}
				break;
			case T__3:
				{
				setState(85);
				match(T__3);
				setState(86);
				dataExpr(0);
				setState(87);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new DataExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						match(T__8);
						setState(93);
						dataExpr(7);
						}
						break;
					case 2:
						{
						_localctx = new DataExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(94);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(95);
						match(T__9);
						setState(96);
						dataExpr(6);
						}
						break;
					case 3:
						{
						_localctx = new DataExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						match(T__10);
						setState(99);
						dataExpr(5);
						}
						break;
					case 4:
						{
						_localctx = new DataExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101);
						match(T__11);
						setState(102);
						dataExpr(4);
						}
						break;
					case 5:
						{
						_localctx = new DataExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(103);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(104);
						match(T__12);
						setState(105);
						dataExpr(3);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return booleanExpr_sempred((BooleanExprContext)_localctx, predIndex);
		case 7:
			return dataExpr_sempred((DataExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpr_sempred(BooleanExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dataExpr_sempred(DataExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3"+
		"\3\4\3\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"H\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bP\n\b\f\b\16\bS\13\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\\\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\t\2\4\16\20\n\2\4\6\b\n\f\16\20"+
		"\2\2\2z\2\23\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b\60\3\2\2\2\n\65\3\2\2\2\f"+
		"9\3\2\2\2\16G\3\2\2\2\20[\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\25\3"+
		"\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27%\7\25\2\2\30\31\5\f"+
		"\7\2\31\32\7\25\2\2\32%\3\2\2\2\33\34\5\n\6\2\34\35\7\25\2\2\35%\3\2\2"+
		"\2\36\37\5\b\5\2\37 \7\25\2\2 %\3\2\2\2!\"\5\6\4\2\"#\7\25\2\2#%\3\2\2"+
		"\2$\27\3\2\2\2$\30\3\2\2\2$\33\3\2\2\2$\36\3\2\2\2$!\3\2\2\2%\5\3\2\2"+
		"\2&\'\7\3\2\2\'(\5\16\b\2(*\7\4\2\2)+\5\4\3\2*)\3\2\2\2+,\3\2\2\2,*\3"+
		"\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\5\2\2/\7\3\2\2\2\60\61\7\20\2\2\61\62\7"+
		"\6\2\2\62\63\5\20\t\2\63\64\7\7\2\2\64\t\3\2\2\2\65\66\7\20\2\2\66\67"+
		"\7\23\2\2\678\5\20\t\28\13\3\2\2\29:\7\b\2\2:;\5\n\6\2;\r\3\2\2\2<=\b"+
		"\b\1\2=>\7\20\2\2>?\7\22\2\2?H\7\21\2\2@A\7\20\2\2AB\7\22\2\2BH\7\20\2"+
		"\2CD\7\6\2\2DE\5\16\b\2EF\7\7\2\2FH\3\2\2\2G<\3\2\2\2G@\3\2\2\2GC\3\2"+
		"\2\2HQ\3\2\2\2IJ\f\5\2\2JK\7\t\2\2KP\5\16\b\6LM\f\4\2\2MN\7\n\2\2NP\5"+
		"\16\b\5OI\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\17\3\2\2\2"+
		"SQ\3\2\2\2TU\b\t\1\2U\\\7\21\2\2V\\\7\20\2\2WX\7\6\2\2XY\5\20\t\2YZ\7"+
		"\7\2\2Z\\\3\2\2\2[T\3\2\2\2[V\3\2\2\2[W\3\2\2\2\\n\3\2\2\2]^\f\b\2\2^"+
		"_\7\13\2\2_m\5\20\t\t`a\f\7\2\2ab\7\f\2\2bm\5\20\t\bcd\f\6\2\2de\7\r\2"+
		"\2em\5\20\t\7fg\f\5\2\2gh\7\16\2\2hm\5\20\t\6ij\f\4\2\2jk\7\17\2\2km\5"+
		"\20\t\5l]\3\2\2\2l`\3\2\2\2lc\3\2\2\2lf\3\2\2\2li\3\2\2\2mp\3\2\2\2nl"+
		"\3\2\2\2no\3\2\2\2o\21\3\2\2\2pn\3\2\2\2\13\25$,GOQ[ln";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}