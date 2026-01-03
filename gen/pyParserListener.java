// Generated from E:/aya/study/مترجمات/‏‏‏‏untitled1 - نسخة - نسخة/Template-Compiler/python-part/grammar/pyParser.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pyParser}.
 */
public interface pyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramRule}
	 * labeled alternative in {@link pyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramRule(pyParser.ProgramRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramRule}
	 * labeled alternative in {@link pyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramRule(pyParser.ProgramRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 */
	void enterImportElement(pyParser.ImportElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 */
	void exitImportElement(pyParser.ImportElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratedFunctionElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedFunctionElement(pyParser.DecoratedFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedFunctionElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedFunctionElement(pyParser.DecoratedFunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 */
	void enterFunctionElement(pyParser.FunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 */
	void exitFunctionElement(pyParser.FunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 */
	void enterStatementElement(pyParser.StatementElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementElement}
	 * labeled alternative in {@link pyParser#element}.
	 * @param ctx the parse tree
	 */
	void exitStatementElement(pyParser.StatementElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link pyParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStmt(pyParser.FromImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link pyParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStmt(pyParser.FromImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Import}
	 * labeled alternative in {@link pyParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImport(pyParser.ImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link pyParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImport(pyParser.ImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DottedNameRule}
	 * labeled alternative in {@link pyParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedNameRule(pyParser.DottedNameRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DottedNameRule}
	 * labeled alternative in {@link pyParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedNameRule(pyParser.DottedNameRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportListRule}
	 * labeled alternative in {@link pyParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportListRule(pyParser.ImportListRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportListRule}
	 * labeled alternative in {@link pyParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportListRule(pyParser.ImportListRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratedFunctionRule}
	 * labeled alternative in {@link pyParser#decoratedFunction}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedFunctionRule(pyParser.DecoratedFunctionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedFunctionRule}
	 * labeled alternative in {@link pyParser#decoratedFunction}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedFunctionRule(pyParser.DecoratedFunctionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorRule}
	 * labeled alternative in {@link pyParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorRule(pyParser.DecoratorRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorRule}
	 * labeled alternative in {@link pyParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorRule(pyParser.DecoratorRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefRule}
	 * labeled alternative in {@link pyParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefRule(pyParser.FunctionDefRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefRule}
	 * labeled alternative in {@link pyParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefRule(pyParser.FunctionDefRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterListRule}
	 * labeled alternative in {@link pyParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterListRule(pyParser.ParameterListRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterListRule}
	 * labeled alternative in {@link pyParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterListRule(pyParser.ParameterListRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(pyParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(pyParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(pyParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(pyParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(pyParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(pyParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(pyParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(pyParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(pyParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(pyParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(pyParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link pyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(pyParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentRule}
	 * labeled alternative in {@link pyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentRule(pyParser.AssignmentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentRule}
	 * labeled alternative in {@link pyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentRule(pyParser.AssignmentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugmentedAssignmentRule}
	 * labeled alternative in {@link pyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAugmentedAssignmentRule(pyParser.AugmentedAssignmentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugmentedAssignmentRule}
	 * labeled alternative in {@link pyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAugmentedAssignmentRule(pyParser.AugmentedAssignmentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnRule}
	 * labeled alternative in {@link pyParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnRule(pyParser.ReturnRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnRule}
	 * labeled alternative in {@link pyParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnRule(pyParser.ReturnRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmtRule}
	 * labeled alternative in {@link pyParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtRule(pyParser.IfStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmtRule}
	 * labeled alternative in {@link pyParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtRule(pyParser.IfStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmtRule}
	 * labeled alternative in {@link pyParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmtRule(pyParser.ForStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmtRule}
	 * labeled alternative in {@link pyParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmtRule(pyParser.ForStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockRule}
	 * labeled alternative in {@link pyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockRule(pyParser.BlockRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockRule}
	 * labeled alternative in {@link pyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockRule(pyParser.BlockRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExprRule}
	 * labeled alternative in {@link pyParser#conditionalExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExprRule(pyParser.ConditionalExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExprRule}
	 * labeled alternative in {@link pyParser#conditionalExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExprRule(pyParser.ConditionalExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExprRule}
	 * labeled alternative in {@link pyParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExprRule(pyParser.ComparisonExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExprRule}
	 * labeled alternative in {@link pyParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExprRule(pyParser.ComparisonExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExprRule}
	 * labeled alternative in {@link pyParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExprRule(pyParser.AdditiveExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExprRule}
	 * labeled alternative in {@link pyParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExprRule(pyParser.AdditiveExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExprRule}
	 * labeled alternative in {@link pyParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExprRule(pyParser.MultiplicativeExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExprRule}
	 * labeled alternative in {@link pyParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExprRule(pyParser.MultiplicativeExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExprRule}
	 * labeled alternative in {@link pyParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExprRule(pyParser.PowerExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExprRule}
	 * labeled alternative in {@link pyParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExprRule(pyParser.PowerExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(pyParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(pyParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(pyParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(pyParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexingExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterIndexingExpr(pyParser.IndexingExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexingExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitIndexingExpr(pyParser.IndexingExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(pyParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(pyParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterDictExpr(pyParser.DictExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitDictExpr(pyParser.DictExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(pyParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(pyParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DottedNameExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterDottedNameExpr(pyParser.DottedNameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DottedNameExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitDottedNameExpr(pyParser.DottedNameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(pyParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link pyParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(pyParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pyParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(pyParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pyParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(pyParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneratorExprRule}
	 * labeled alternative in {@link pyParser#generatorExpr}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorExprRule(pyParser.GeneratorExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratorExprRule}
	 * labeled alternative in {@link pyParser#generatorExpr}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorExprRule(pyParser.GeneratorExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallRule}
	 * labeled alternative in {@link pyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallRule(pyParser.FunctionCallRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallRule}
	 * labeled alternative in {@link pyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallRule(pyParser.FunctionCallRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallRule}
	 * labeled alternative in {@link pyParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallRule(pyParser.MethodCallRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallRule}
	 * labeled alternative in {@link pyParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallRule(pyParser.MethodCallRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexingRule}
	 * labeled alternative in {@link pyParser#indexing}.
	 * @param ctx the parse tree
	 */
	void enterIndexingRule(pyParser.IndexingRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexingRule}
	 * labeled alternative in {@link pyParser#indexing}.
	 * @param ctx the parse tree
	 */
	void exitIndexingRule(pyParser.IndexingRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentListRule}
	 * labeled alternative in {@link pyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListRule(pyParser.ArgumentListRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentListRule}
	 * labeled alternative in {@link pyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListRule(pyParser.ArgumentListRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentExpr}
	 * labeled alternative in {@link pyParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpr(pyParser.ArgumentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentExpr}
	 * labeled alternative in {@link pyParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpr(pyParser.ArgumentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedArgumentExpr}
	 * labeled alternative in {@link pyParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgumentExpr(pyParser.NamedArgumentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedArgumentExpr}
	 * labeled alternative in {@link pyParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgumentExpr(pyParser.NamedArgumentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneratorArgumentExpr}
	 * labeled alternative in {@link pyParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorArgumentExpr(pyParser.GeneratorArgumentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratorArgumentExpr}
	 * labeled alternative in {@link pyParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorArgumentExpr(pyParser.GeneratorArgumentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListRule}
	 * labeled alternative in {@link pyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterListRule(pyParser.ListRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListRule}
	 * labeled alternative in {@link pyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitListRule(pyParser.ListRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListComprehensionRule}
	 * labeled alternative in {@link pyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterListComprehensionRule(pyParser.ListComprehensionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListComprehensionRule}
	 * labeled alternative in {@link pyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitListComprehensionRule(pyParser.ListComprehensionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComprehensionRule}
	 * labeled alternative in {@link pyParser#comprehension}.
	 * @param ctx the parse tree
	 */
	void enterComprehensionRule(pyParser.ComprehensionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComprehensionRule}
	 * labeled alternative in {@link pyParser#comprehension}.
	 * @param ctx the parse tree
	 */
	void exitComprehensionRule(pyParser.ComprehensionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictRule}
	 * labeled alternative in {@link pyParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDictRule(pyParser.DictRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictRule}
	 * labeled alternative in {@link pyParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDictRule(pyParser.DictRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictItemRule}
	 * labeled alternative in {@link pyParser#dictItem}.
	 * @param ctx the parse tree
	 */
	void enterDictItemRule(pyParser.DictItemRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictItemRule}
	 * labeled alternative in {@link pyParser#dictItem}.
	 * @param ctx the parse tree
	 */
	void exitDictItemRule(pyParser.DictItemRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralRule(pyParser.StringLiteralRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralRule(pyParser.StringLiteralRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteralRule(pyParser.NumberLiteralRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteralRule(pyParser.NumberLiteralRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNoneLiteralRule(pyParser.NoneLiteralRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNoneLiteralRule(pyParser.NoneLiteralRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteralRule(pyParser.TrueLiteralRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteralRule(pyParser.TrueLiteralRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteralRule(pyParser.FalseLiteralRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteralRule}
	 * labeled alternative in {@link pyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteralRule(pyParser.FalseLiteralRuleContext ctx);
}