// Generated from E:/aya/study/مترجمات/‏‏‏‏untitled1 - نسخة - نسخة/Template-Compiler/python-part/grammar/pyParser.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ProgramRule}
	 * labeled alternative in {@link pyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramRule(pyParser.ProgramRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportElement(pyParser.ImportElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedFunctionElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedFunctionElement(pyParser.DecoratedFunctionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionElement(pyParser.FunctionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementElement(pyParser.StatementElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link pyParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStmt(pyParser.FromImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link pyParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport(pyParser.ImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DottedNameRule}
	 * labeled alternative in {@link pyParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedNameRule(pyParser.DottedNameRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportListRule}
	 * labeled alternative in {@link pyParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportListRule(pyParser.ImportListRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedFunctionRule}
	 * labeled alternative in {@link pyParser#decoratedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedFunctionRule(pyParser.DecoratedFunctionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorRule}
	 * labeled alternative in {@link pyParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorRule(pyParser.DecoratorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefRule}
	 * labeled alternative in {@link pyParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefRule(pyParser.FunctionDefRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterListRule}
	 * labeled alternative in {@link pyParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterListRule(pyParser.ParameterListRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(pyParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(pyParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(pyParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(pyParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(pyParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(pyParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentRule}
	 * labeled alternative in {@link pyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentRule(pyParser.AssignmentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugmentedAssignmentRule}
	 * labeled alternative in {@link pyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugmentedAssignmentRule(pyParser.AugmentedAssignmentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnRule}
	 * labeled alternative in {@link pyParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnRule(pyParser.ReturnRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmtRule}
	 * labeled alternative in {@link pyParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtRule(pyParser.IfStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmtRule}
	 * labeled alternative in {@link pyParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmtRule(pyParser.ForStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockRule}
	 * labeled alternative in {@link pyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockRule(pyParser.BlockRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(pyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExprRule}
	 * labeled alternative in {@link pyParser#conditionalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExprRule(pyParser.ConditionalExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExprRule}
	 * labeled alternative in {@link pyParser#comparisonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExprRule(pyParser.ComparisonExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExprRule}
	 * labeled alternative in {@link pyParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExprRule(pyParser.AdditiveExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExprRule}
	 * labeled alternative in {@link pyParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExprRule(pyParser.MultiplicativeExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExprRule}
	 * labeled alternative in {@link pyParser#powerExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExprRule(pyParser.PowerExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(pyParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpr(pyParser.MethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexingExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingExpr(pyParser.IndexingExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(pyParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictExpr(pyParser.DictExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(pyParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DottedNameExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedNameExpr(pyParser.DottedNameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(pyParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pyParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(pyParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeneratorExprRule}
	 * labeled alternative in {@link pyParser#generatorExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorExprRule(pyParser.GeneratorExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallRule}
	 * labeled alternative in {@link pyParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallRule(pyParser.FunctionCallRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallRule}
	 * labeled alternative in {@link pyParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallRule(pyParser.MethodCallRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexingRule}
	 * labeled alternative in {@link pyParser#indexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingRule(pyParser.IndexingRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentListRule}
	 * labeled alternative in {@link pyParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentListRule(pyParser.ArgumentListRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentExpr}
	 * labeled alternative in {@link pyParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpr(pyParser.ArgumentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedArgumentExpr}
	 * labeled alternative in {@link pyParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgumentExpr(pyParser.NamedArgumentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeneratorArgumentExpr}
	 * labeled alternative in {@link pyParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorArgumentExpr(pyParser.GeneratorArgumentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListRule}
	 * labeled alternative in {@link pyParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRule(pyParser.ListRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListComprehensionRule}
	 * labeled alternative in {@link pyParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComprehensionRule(pyParser.ListComprehensionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComprehensionRule}
	 * labeled alternative in {@link pyParser#comprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComprehensionRule(pyParser.ComprehensionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictRule}
	 * labeled alternative in {@link pyParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictRule(pyParser.DictRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictItemRule}
	 * labeled alternative in {@link pyParser#dictItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictItemRule(pyParser.DictItemRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralRule(pyParser.StringLiteralRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteralRule(pyParser.NumberLiteralRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLiteralRule(pyParser.NoneLiteralRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteralRule(pyParser.TrueLiteralRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteralRule(pyParser.FalseLiteralRuleContext ctx);
}