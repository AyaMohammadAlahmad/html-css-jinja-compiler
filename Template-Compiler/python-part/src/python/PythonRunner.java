package python;

import antlr.pyLexer;
import antlr.pyParser;
import Ast.*;
import visitor.AstBuilder;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.PythonsymbolTablevisitor;

public class PythonRunner {

    public static void run(String path) throws Exception {

        CharStream input = CharStreams.fromFileName(path);

        pyLexer lexer = new pyLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pyParser parser = new pyParser(tokens);

        ParseTree tree = parser.program();

        AstBuilder visitor = new AstBuilder();
        Element ast = visitor.visit(tree);

        System.out.println("==== PYTHON AST ====");
        ast.print(0);

        // 8) بناء الـ Symbol Table
        PythonsymbolTablevisitor stVisitor = new PythonsymbolTablevisitor();
        stVisitor.visit((Program) ast);

        // 9) طباعة الـ Symbol Table
        System.out.println("\n====== SYMBOL TABLE ======");
        stVisitor.getSymbolTable().print();
    }
}
