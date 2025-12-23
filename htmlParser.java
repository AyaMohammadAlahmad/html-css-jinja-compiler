// Generated from htmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class htmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JINJA_STMT_OPEN=1, JINJA_STMT_CLOSE=2, JINJA_EXPR_OPEN=3, JINJA_EXPR_CLOSE=4, 
		LT=5, GT=6, SLASH=7, EQ=8, COMMA=9, LPAREN=10, RPAREN=11, BLOCK=12, ENDBLOCK=13, 
		STRING=14, IDENTIFIER=15, TEXT=16, WS=17;
	public static final int
		RULE_template = 0, RULE_content = 1, RULE_html_element = 2, RULE_html_open_tag = 3, 
		RULE_html_close_tag = 4, RULE_attribute_list = 5, RULE_attribute = 6, 
		RULE_attribute_value = 7, RULE_jinja_statement = 8, RULE_jinja_expression = 9, 
		RULE_expression = 10, RULE_function_call = 11, RULE_argument_list = 12, 
		RULE_argument = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "content", "html_element", "html_open_tag", "html_close_tag", 
			"attribute_list", "attribute", "attribute_value", "jinja_statement", 
			"jinja_expression", "expression", "function_call", "argument_list", "argument"
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

	@Override
	public String getGrammarFileName() { return "htmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public htmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(htmlParser.EOF, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitTemplate(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				content();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65578L) != 0) );
			setState(33);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public Jinja_statementContext jinja_statement() {
			return getRuleContext(Jinja_statementContext.class,0);
		}
		public Jinja_expressionContext jinja_expression() {
			return getRuleContext(Jinja_expressionContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(htmlParser.TEXT, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				html_element();
				}
				break;
			case JINJA_STMT_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				jinja_statement();
				}
				break;
			case JINJA_EXPR_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				jinja_expression();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_elementContext extends ParserRuleContext {
		public Html_open_tagContext html_open_tag() {
			return getRuleContext(Html_open_tagContext.class,0);
		}
		public Html_close_tagContext html_close_tag() {
			return getRuleContext(Html_close_tagContext.class,0);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public Html_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterHtml_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitHtml_element(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_html_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			html_open_tag();
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					content();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(48);
			html_close_tag();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_open_tagContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(htmlParser.LT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(htmlParser.IDENTIFIER, 0); }
		public TerminalNode GT() { return getToken(htmlParser.GT, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Html_open_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_open_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterHtml_open_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitHtml_open_tag(this);
		}
	}

	public final Html_open_tagContext html_open_tag() throws RecognitionException {
		Html_open_tagContext _localctx = new Html_open_tagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_html_open_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LT);
			setState(51);
			match(IDENTIFIER);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(52);
				attribute_list();
				}
			}

			setState(55);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_close_tagContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(htmlParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(htmlParser.SLASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(htmlParser.IDENTIFIER, 0); }
		public TerminalNode GT() { return getToken(htmlParser.GT, 0); }
		public Html_close_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_close_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterHtml_close_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitHtml_close_tag(this);
		}
	}

	public final Html_close_tagContext html_close_tag() throws RecognitionException {
		Html_close_tagContext _localctx = new Html_close_tagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_html_close_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LT);
			setState(58);
			match(SLASH);
			setState(59);
			match(IDENTIFIER);
			setState(60);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitAttribute_list(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				attribute();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(htmlParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(htmlParser.EQ, 0); }
		public Attribute_valueContext attribute_value() {
			return getRuleContext(Attribute_valueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IDENTIFIER);
			setState(68);
			match(EQ);
			setState(69);
			attribute_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(htmlParser.STRING, 0); }
		public Jinja_expressionContext jinja_expression() {
			return getRuleContext(Jinja_expressionContext.class,0);
		}
		public Attribute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterAttribute_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitAttribute_value(this);
		}
	}

	public final Attribute_valueContext attribute_value() throws RecognitionException {
		Attribute_valueContext _localctx = new Attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attribute_value);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(STRING);
				}
				break;
			case JINJA_EXPR_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				jinja_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_statementContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(htmlParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(htmlParser.JINJA_STMT_CLOSE, 0); }
		public TerminalNode BLOCK() { return getToken(htmlParser.BLOCK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(htmlParser.IDENTIFIER, 0); }
		public TerminalNode ENDBLOCK() { return getToken(htmlParser.ENDBLOCK, 0); }
		public Jinja_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterJinja_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitJinja_statement(this);
		}
	}

	public final Jinja_statementContext jinja_statement() throws RecognitionException {
		Jinja_statementContext _localctx = new Jinja_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jinja_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(JINJA_STMT_OPEN);
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
				{
				setState(76);
				match(BLOCK);
				setState(77);
				match(IDENTIFIER);
				}
				break;
			case ENDBLOCK:
				{
				setState(78);
				match(ENDBLOCK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81);
			match(JINJA_STMT_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_expressionContext extends ParserRuleContext {
		public TerminalNode JINJA_EXPR_OPEN() { return getToken(htmlParser.JINJA_EXPR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_EXPR_CLOSE() { return getToken(htmlParser.JINJA_EXPR_CLOSE, 0); }
		public Jinja_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterJinja_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitJinja_expression(this);
		}
	}

	public final Jinja_expressionContext jinja_expression() throws RecognitionException {
		Jinja_expressionContext _localctx = new Jinja_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jinja_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(JINJA_EXPR_OPEN);
			setState(84);
			expression();
			setState(85);
			match(JINJA_EXPR_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(htmlParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(htmlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(htmlParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IDENTIFIER);
			setState(90);
			match(LPAREN);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==IDENTIFIER) {
				{
				setState(91);
				argument_list();
				}
			}

			setState(94);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(htmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(htmlParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			argument();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97);
				match(COMMA);
				setState(98);
				argument();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(htmlParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(htmlParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(htmlParser.EQ, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argument);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(IDENTIFIER);
				setState(106);
				match(EQ);
				setState(107);
				match(STRING);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0011o\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b"+
		"\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0004\u0005@\b\u0005\u000b\u0005\f\u0005A\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007J\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bP\b\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b]\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\fd\b\f\n\f\f\fg\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rm"+
		"\b\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u0000\u0000l\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000"+
		"\u00062\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\n?\u0001\u0000"+
		"\u0000\u0000\fC\u0001\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000"+
		"\u0010K\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000\u0000\u0014W"+
		"\u0001\u0000\u0000\u0000\u0016Y\u0001\u0000\u0000\u0000\u0018`\u0001\u0000"+
		"\u0000\u0000\u001al\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000"+
		"\u0000\u0000#(\u0003\u0004\u0002\u0000$(\u0003\u0010\b\u0000%(\u0003\u0012"+
		"\t\u0000&(\u0005\u0010\u0000\u0000\'#\u0001\u0000\u0000\u0000\'$\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000"+
		"(\u0003\u0001\u0000\u0000\u0000)-\u0003\u0006\u0003\u0000*,\u0003\u0002"+
		"\u0001\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000001\u0003\b\u0004\u00001\u0005\u0001\u0000\u0000"+
		"\u000023\u0005\u0005\u0000\u000035\u0005\u000f\u0000\u000046\u0003\n\u0005"+
		"\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000078\u0005\u0006\u0000\u00008\u0007\u0001\u0000\u0000\u0000"+
		"9:\u0005\u0005\u0000\u0000:;\u0005\u0007\u0000\u0000;<\u0005\u000f\u0000"+
		"\u0000<=\u0005\u0006\u0000\u0000=\t\u0001\u0000\u0000\u0000>@\u0003\f"+
		"\u0006\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u000b\u0001\u0000\u0000"+
		"\u0000CD\u0005\u000f\u0000\u0000DE\u0005\b\u0000\u0000EF\u0003\u000e\u0007"+
		"\u0000F\r\u0001\u0000\u0000\u0000GJ\u0005\u000e\u0000\u0000HJ\u0003\u0012"+
		"\t\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\u000f\u0001"+
		"\u0000\u0000\u0000KO\u0005\u0001\u0000\u0000LM\u0005\f\u0000\u0000MP\u0005"+
		"\u000f\u0000\u0000NP\u0005\r\u0000\u0000OL\u0001\u0000\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u0002\u0000\u0000"+
		"R\u0011\u0001\u0000\u0000\u0000ST\u0005\u0003\u0000\u0000TU\u0003\u0014"+
		"\n\u0000UV\u0005\u0004\u0000\u0000V\u0013\u0001\u0000\u0000\u0000WX\u0003"+
		"\u0016\u000b\u0000X\u0015\u0001\u0000\u0000\u0000YZ\u0005\u000f\u0000"+
		"\u0000Z\\\u0005\n\u0000\u0000[]\u0003\u0018\f\u0000\\[\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005\u000b"+
		"\u0000\u0000_\u0017\u0001\u0000\u0000\u0000`e\u0003\u001a\r\u0000ab\u0005"+
		"\t\u0000\u0000bd\u0003\u001a\r\u0000ca\u0001\u0000\u0000\u0000dg\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"f\u0019\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hm\u0005\u000e"+
		"\u0000\u0000ij\u0005\u000f\u0000\u0000jk\u0005\b\u0000\u0000km\u0005\u000e"+
		"\u0000\u0000lh\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000m\u001b"+
		"\u0001\u0000\u0000\u0000\n\u001f\'-5AIO\\el";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}