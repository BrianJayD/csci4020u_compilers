// Generated from PL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, INT=15, BOOL=16, ASMT=17, 
		WS=18, NEWLINE=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "ID", "INT", "BOOL", "ASMT", "WS", 
		"NEWLINE"
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


	public PLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17R\n\17\r\17\16\17S\3"+
		"\20\6\20W\n\20\r\20\16\20X\3\21\3\21\3\21\5\21^\n\21\3\22\3\22\3\23\6"+
		"\23c\n\23\r\23\16\23d\3\23\3\23\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		"\3\2\6\4\2C\\c|\3\2\62;\4\2>>@@\4\2\13\13\"\"\2m\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\3)\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r"+
		"\67\3\2\2\2\17?\3\2\2\2\21C\3\2\2\2\23F\3\2\2\2\25H\3\2\2\2\27J\3\2\2"+
		"\2\31L\3\2\2\2\33N\3\2\2\2\35Q\3\2\2\2\37V\3\2\2\2!]\3\2\2\2#_\3\2\2\2"+
		"%b\3\2\2\2\'h\3\2\2\2)*\7y\2\2*+\7j\2\2+,\7k\2\2,-\7n\2\2-.\7g\2\2.\4"+
		"\3\2\2\2/\60\7}\2\2\60\6\3\2\2\2\61\62\7\177\2\2\62\b\3\2\2\2\63\64\7"+
		"*\2\2\64\n\3\2\2\2\65\66\7+\2\2\66\f\3\2\2\2\678\7f\2\289\7g\2\29:\7e"+
		"\2\2:;\7n\2\2;<\7c\2\2<=\7t\2\2=>\7g\2\2>\16\3\2\2\2?@\7c\2\2@A\7p\2\2"+
		"AB\7f\2\2B\20\3\2\2\2CD\7q\2\2DE\7t\2\2E\22\3\2\2\2FG\7-\2\2G\24\3\2\2"+
		"\2HI\7,\2\2I\26\3\2\2\2JK\7/\2\2K\30\3\2\2\2LM\7\61\2\2M\32\3\2\2\2NO"+
		"\7.\2\2O\34\3\2\2\2PR\t\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"T\36\3\2\2\2UW\t\3\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y \3\2\2"+
		"\2Z^\t\4\2\2[\\\7?\2\2\\^\7?\2\2]Z\3\2\2\2][\3\2\2\2^\"\3\2\2\2_`\7?\2"+
		"\2`$\3\2\2\2ac\t\5\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2"+
		"\2fg\b\23\2\2g&\3\2\2\2hi\7\f\2\2i(\3\2\2\2\7\2SX]d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}