// Generated from htmlLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class htmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JINJA_STMT_OPEN=1, JINJA_STMT_CLOSE=2, JINJA_EXPR_OPEN=3, JINJA_EXPR_CLOSE=4, 
		LT=5, GT=6, SLASH=7, EQ=8, COMMA=9, LPAREN=10, RPAREN=11, BLOCK=12, ENDBLOCK=13, 
		STRING=14, IDENTIFIER=15, TEXT=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"JINJA_STMT_OPEN", "JINJA_STMT_CLOSE", "JINJA_EXPR_OPEN", "JINJA_EXPR_CLOSE", 
			"LT", "GT", "SLASH", "EQ", "COMMA", "LPAREN", "RPAREN", "BLOCK", "ENDBLOCK", 
			"STRING", "IDENTIFIER", "TEXT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{%'", "'%}'", "'{{'", "'}}'", "'<'", "'>'", "'/'", "'='", "','", 
			"'('", "')'", "'block'", "'endblock'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JINJA_STMT_OPEN", "JINJA_STMT_CLOSE", "JINJA_EXPR_OPEN", "JINJA_EXPR_CLOSE", 
			"LT", "GT", "SLASH", "EQ", "COMMA", "LPAREN", "RPAREN", "BLOCK", "ENDBLOCK", 
			"STRING", "IDENTIFIER", "TEXT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public htmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "htmlLexer.g4"; }

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
		"\u0004\u0000\u0011q\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rO\b"+
		"\r\n\r\f\rR\t\r\u0001\r\u0001\r\u0001\r\u0005\rW\b\r\n\r\f\rZ\t\r\u0001"+
		"\r\u0003\r]\b\r\u0001\u000e\u0001\u000e\u0005\u000ea\b\u000e\n\u000e\f"+
		"\u000ed\t\u000e\u0001\u000f\u0004\u000fg\b\u000f\u000b\u000f\f\u000fh"+
		"\u0001\u0010\u0004\u0010l\b\u0010\u000b\u0010\f\u0010m\u0001\u0010\u0001"+
		"\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0006"+
		"\u0003\u0000\n\n\r\r\'\'\u0003\u0000\n\n\r\r\"\"\u0002\u0000AZaz\u0003"+
		"\u000009AZaz\u0001\u0000<<\u0003\u0000\t\n\r\r  v\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001"+
		"#\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u0005)\u0001"+
		"\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000"+
		"\u0000\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f"+
		"5\u0001\u0000\u0000\u0000\u00117\u0001\u0000\u0000\u0000\u00139\u0001"+
		"\u0000\u0000\u0000\u0015;\u0001\u0000\u0000\u0000\u0017=\u0001\u0000\u0000"+
		"\u0000\u0019C\u0001\u0000\u0000\u0000\u001b\\\u0001\u0000\u0000\u0000"+
		"\u001d^\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000\u0000!k\u0001"+
		"\u0000\u0000\u0000#$\u0005{\u0000\u0000$%\u0005%\u0000\u0000%\u0002\u0001"+
		"\u0000\u0000\u0000&\'\u0005%\u0000\u0000\'(\u0005}\u0000\u0000(\u0004"+
		"\u0001\u0000\u0000\u0000)*\u0005{\u0000\u0000*+\u0005{\u0000\u0000+\u0006"+
		"\u0001\u0000\u0000\u0000,-\u0005}\u0000\u0000-.\u0005}\u0000\u0000.\b"+
		"\u0001\u0000\u0000\u0000/0\u0005<\u0000\u00000\n\u0001\u0000\u0000\u0000"+
		"12\u0005>\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005/\u0000\u0000"+
		"4\u000e\u0001\u0000\u0000\u000056\u0005=\u0000\u00006\u0010\u0001\u0000"+
		"\u0000\u000078\u0005,\u0000\u00008\u0012\u0001\u0000\u0000\u00009:\u0005"+
		"(\u0000\u0000:\u0014\u0001\u0000\u0000\u0000;<\u0005)\u0000\u0000<\u0016"+
		"\u0001\u0000\u0000\u0000=>\u0005b\u0000\u0000>?\u0005l\u0000\u0000?@\u0005"+
		"o\u0000\u0000@A\u0005c\u0000\u0000AB\u0005k\u0000\u0000B\u0018\u0001\u0000"+
		"\u0000\u0000CD\u0005e\u0000\u0000DE\u0005n\u0000\u0000EF\u0005d\u0000"+
		"\u0000FG\u0005b\u0000\u0000GH\u0005l\u0000\u0000HI\u0005o\u0000\u0000"+
		"IJ\u0005c\u0000\u0000JK\u0005k\u0000\u0000K\u001a\u0001\u0000\u0000\u0000"+
		"LP\u0005\'\u0000\u0000MO\b\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000"+
		"OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S]\u0005\'\u0000"+
		"\u0000TX\u0005\"\u0000\u0000UW\b\u0001\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0005"+
		"\"\u0000\u0000\\L\u0001\u0000\u0000\u0000\\T\u0001\u0000\u0000\u0000]"+
		"\u001c\u0001\u0000\u0000\u0000^b\u0007\u0002\u0000\u0000_a\u0007\u0003"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u001e\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000eg\b\u0004\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000i \u0001\u0000\u0000\u0000jl\u0007\u0005\u0000\u0000kj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0006\u0010\u0000"+
		"\u0000p\"\u0001\u0000\u0000\u0000\u0007\u0000PX\\bhm\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}