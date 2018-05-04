// Generated from Calc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Number=8, WS=9;
	public static final int
		RULE_program = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"program", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "Number", "WS"
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
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  public void echo() {System.out.println("echo");}

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				((ProgramContext)_localctx).expr = expr(0);
				setState(5);
				match(T__0);
				System.out.println(((ProgramContext)_localctx).expr.v);
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 || _la==Number );
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

	public static class ExprContext extends ParserRuleContext {
		public double v;
		public ExprContext e1;
		public Token Number;
		public ExprContext expr;
		public ExprContext e2;
		public TerminalNode Number() { return getToken(CalcParser.Number, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(13);
				((ExprContext)_localctx).Number = match(Number);
				((ExprContext)_localctx).v =  Double.parseDouble((((ExprContext)_localctx).Number!=null?((ExprContext)_localctx).Number.getText():null));
				}
				break;
			case T__5:
				{
				setState(15);
				match(T__5);
				setState(16);
				((ExprContext)_localctx).expr = expr(0);
				setState(17);
				match(T__6);
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).expr.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(42);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(22);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(23);
						match(T__1);
						setState(24);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(6);
						((ExprContext)_localctx).v =  ((ExprContext)_localctx).e1.v + ((ExprContext)_localctx).e2.v;
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(27);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(28);
						match(T__2);
						setState(29);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(5);
						((ExprContext)_localctx).v =  ((ExprContext)_localctx).e1.v - ((ExprContext)_localctx).e2.v;
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33);
						match(T__3);
						setState(34);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(4);
						((ExprContext)_localctx).v =  ((ExprContext)_localctx).e1.v * ((ExprContext)_localctx).e2.v;
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(38);
						match(T__4);
						setState(39);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(3);
						((ExprContext)_localctx).v =  ((ExprContext)_localctx).e1.v / ((ExprContext)_localctx).e2.v;
						}
						break;
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\62\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\27\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\2\3\4\4\2\4\2"+
		"\2\2\65\2\n\3\2\2\2\4\26\3\2\2\2\6\7\5\4\3\2\7\b\7\3\2\2\b\t\b\2\1\2\t"+
		"\13\3\2\2\2\n\6\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\3\3\2\2"+
		"\2\16\17\b\3\1\2\17\20\7\n\2\2\20\27\b\3\1\2\21\22\7\b\2\2\22\23\5\4\3"+
		"\2\23\24\7\t\2\2\24\25\b\3\1\2\25\27\3\2\2\2\26\16\3\2\2\2\26\21\3\2\2"+
		"\2\27.\3\2\2\2\30\31\f\7\2\2\31\32\7\4\2\2\32\33\5\4\3\b\33\34\b\3\1\2"+
		"\34-\3\2\2\2\35\36\f\6\2\2\36\37\7\5\2\2\37 \5\4\3\7 !\b\3\1\2!-\3\2\2"+
		"\2\"#\f\5\2\2#$\7\6\2\2$%\5\4\3\6%&\b\3\1\2&-\3\2\2\2\'(\f\4\2\2()\7\7"+
		"\2\2)*\5\4\3\5*+\b\3\1\2+-\3\2\2\2,\30\3\2\2\2,\35\3\2\2\2,\"\3\2\2\2"+
		",\'\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60.\3\2\2\2\6\f"+
		"\26,.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}