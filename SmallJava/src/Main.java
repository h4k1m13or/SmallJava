import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CharStream file = CharStreams.fromFileName("programSemanticTest");
        Small_JavaLexer lexer=new Small_JavaLexer(file);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        Small_JavaParser parser =new Small_JavaParser(tokenStream);
        Small_JavaParser.ProgramContext Axiom = parser.program();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        Small_JavaListener semantic = new Semantic();
        treeWalker.walk(semantic, Axiom);
        QuadsGenerator OwnQuadListener = new QuadsGenerator();
        treeWalker.walk(OwnQuadListener, Axiom);


    }
}
