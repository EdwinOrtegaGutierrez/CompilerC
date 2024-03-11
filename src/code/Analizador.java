package code;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java_cup.runtime.Symbol;
import java.io.Reader;
import java.io.StringReader;


public class Analizador {
    public static void main(String[] args) throws Exception {
        // try {
        //     Scanner lexer = new Scanner(new BufferedReader(new FileReader("C:\\Users\\edwin\\OneDrive\\Escritorio\\CompilerC\\src\\code\\test.txt")));
        //     CompilerC parser = new CompilerC(lexer);

        //     while (true) {
        //         Symbol token = lexer.next_token();

        //         if (token.sym == sym.EOF) 
        //             break;
        //     }
        //     System.out.println("\n\n\n\n\n");
        //     parser.parse();
        //     System.out.println("Análisis completado sin errores.");
        // }  catch (FileNotFoundException ex) {} catch (IOException ex) {}
    
        Reader lector = new BufferedReader(new FileReader("C:\\Users\\edwin\\OneDrive\\Escritorio\\CompilerC\\src\\code\\test.txt"));
        CompilerC s = new CompilerC(new Scanner(lector));
        

        try {
            System.out.println("\nCantidad de errores: " + s.parse());
            System.out.println("Analisis realizado correctamente");
        } catch (Exception ex) {
            Symbol sym = s.scan();
            System.out.println("Error de sintaxis. Linea: " + (sym.right + 1) +" Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            System.out.println(ex.getMessage());
        }
        
    }
}