package sintatico;

import java.io.File;
import java.io.IOException;

public class Generador {
    public static void main(String[] args) throws IOException, Exception {
        //String pathFlex="C:\\Users\\7053\\Documents\\NetBeansProjects\\EMULADOR\\src\\lexico\\tokens.flex";

        //*************ESTE CODIGO ES PARA EL FLEX**********************
        String pathFlex="src\\sintatico\\c_lexer.flex";
        File file=new File(pathFlex);
        jflex.Main.generate(file);
        String[] parametrosLex = {pathFlex};
        jflex.Main.generate(parametrosLex);
        
        
        //**********************ESTE ES PARA EL CUP**********************
        //String[] parametros = {"-parser", "Sintactico", "C:\\Users\\7053\\Documents\\NetBeansProjects\\UEDL_COMPILADORES\\src\\sintactico\\sintactico.cup"};
        String[] parametros = {"-destdir", "src\\sintatico","-parser", "CompilerC", 
            "-progress", "src\\sintatico\\gramatica.cup"};
        java_cup.Main.main(parametros);   
    }
}
