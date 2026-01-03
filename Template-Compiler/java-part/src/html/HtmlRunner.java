package html;

import AST.ASTNode;
import Visitor.ASTVisitor;
<<<<<<< HEAD
import Visitor.HtmlSymbolTableVisitor;
=======
import Visitor.SymbolTableVisitor;
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6
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

<<<<<<< HEAD
        HtmlSymbolTableVisitor stVisitor = new HtmlSymbolTableVisitor();
=======
        SymbolTableVisitor stVisitor = new SymbolTableVisitor();
>>>>>>> 96ead987ca5bb9f072a71a29471d55cb656574e6
        stVisitor.visit(ast);

        System.out.println("==== HTML Symbol Table ====");
        stVisitor.getSymbolTable().printHierarchy("");
    }
}
