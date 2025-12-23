// Generated from htmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link htmlParser}.
 */
public interface htmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link htmlParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(htmlParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(htmlParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(htmlParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(htmlParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterHtml_element(htmlParser.Html_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitHtml_element(htmlParser.Html_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#html_open_tag}.
	 * @param ctx the parse tree
	 */
	void enterHtml_open_tag(htmlParser.Html_open_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#html_open_tag}.
	 * @param ctx the parse tree
	 */
	void exitHtml_open_tag(htmlParser.Html_open_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#html_close_tag}.
	 * @param ctx the parse tree
	 */
	void enterHtml_close_tag(htmlParser.Html_close_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#html_close_tag}.
	 * @param ctx the parse tree
	 */
	void exitHtml_close_tag(htmlParser.Html_close_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(htmlParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(htmlParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(htmlParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(htmlParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#attribute_value}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_value(htmlParser.Attribute_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#attribute_value}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_value(htmlParser.Attribute_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#jinja_statement}.
	 * @param ctx the parse tree
	 */
	void enterJinja_statement(htmlParser.Jinja_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#jinja_statement}.
	 * @param ctx the parse tree
	 */
	void exitJinja_statement(htmlParser.Jinja_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#jinja_expression}.
	 * @param ctx the parse tree
	 */
	void enterJinja_expression(htmlParser.Jinja_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#jinja_expression}.
	 * @param ctx the parse tree
	 */
	void exitJinja_expression(htmlParser.Jinja_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(htmlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(htmlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(htmlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(htmlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(htmlParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(htmlParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(htmlParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(htmlParser.ArgumentContext ctx);
}