package code;

import java.io.BufferedReader;
import java.io.FileReader;
import java_cup.runtime.Symbol;
import java.io.Reader;


public class Analizador {
    public static void main(String[] args) throws Exception {
        Reader lector = new BufferedReader(new FileReader("C:\\Users\\edson\\OneDrive\\Documentos\\CompilerC-1\\src\\code\\numeros.c"));
        CompilerC s = new CompilerC(new Scanner(lector));
        
        try {
            // Imprimir el texto con color blanco
            System.out.println("\n\u001B[42mCantidad de errores: " + s.parse() + ", Análisis realizado correctamente  \u001B[0m");
        } catch (Exception ex) {
            Symbol sym = s.scan();
            System.out.print("\u001B[31m");
            System.out.println("Error de sintaxis. Línea: " + (sym.right + 1) + ", Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            System.out.println(ex.getMessage());    
            System.out.print("\u001B[0m"); // Restablecer el color a predeterminado
        }
        
    }
}