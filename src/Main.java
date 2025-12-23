import AST.ASTNode;
import Visitor.ASTVisitor;
import antlar.htmlLexer;
import antlar.htmlParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        try {
            // 1) ملف الإدخال
            String path = "test.html";

            // 2) قراءة الملف
            CharStream input = fromFileName(path);

            // 3) Lexer
            htmlLexer lexer = new htmlLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 4) Parser
            htmlParser parser = new htmlParser(tokens);

            // 5) Parse Tree (نقطة البداية)
            ParseTree tree = parser.template();

            // 6) Visitor → AST
            ASTVisitor visitor = new ASTVisitor();
            ASTNode ast = visitor.visit(tree);

            // 7) طباعة الـ AST
            System.out.println("====== AST ======");
            System.out.println(ast.print(""));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
