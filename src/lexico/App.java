package lexico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java_cup.runtime.Symbol;
import java_cup.sym;

public class App {
    public static void main(String[] args) throws IOException {
        try {
            Reader lector = new BufferedReader(new FileReader("C:\\Users\\edson\\OneDrive\\Documentos\\CompilerC-1\\src\\lexico\\test.txt"));
            Scanner lexico = new Scanner(lector);

            while (true) {
                Symbol token = lexico.next_token();

                if (token.sym == sym.EOF) 
                    break;
            }
        }  catch (FileNotFoundException ex) {} catch (IOException ex) {}
    }
}
