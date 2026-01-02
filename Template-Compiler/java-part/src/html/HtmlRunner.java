package html;

import AST.ASTNode;
import Visitor.ASTVisitor;
import Visitor.SymbolTableVisitor;
import antlar.htmlLexer;
import antlar.htmlParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class HtmlRunner {

    public static void run(String path) throws Exception {

        CharStream input = CharStreams.fromFileName(path);

        htmlLexer lexer = new htmlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        htmlParser parser = new htmlParser(tokens);

        ParseTree tree = parser.template();

        ASTVisitor visitor = new ASTVisitor();
        ASTNode ast = visitor.visit(tree);

        System.out.println("==== HTML AST ====");
        System.out.println(ast.print(""));

        SymbolTableVisitor stVisitor = new SymbolTableVisitor();
        stVisitor.visit(ast);

        System.out.println("==== HTML Symbol Table ====");
        stVisitor.getSymbolTable().printHierarchy("");
    }
}
