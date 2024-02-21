/*
    ALVAREZ VELAZQUEZ EDOSN ALI
    ORTEGA GUTIERREZ EDWIN OMAR
    SANCHEZ REYES DANIA GUADALUPE
*/

/*  package lexico; */

package sintatico;

import java_cup.*;

%%
%class Scanner
%unicode
%cup
%line
%column
%{
    StringBuffer string = new StringBuffer();

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

%%

/* keywords */
<YYINITIAL> "auto" { 
    System.out.println(" Declara una variable local que se almacena en el stack "); 
    return symbol(sym.AUTO);
}
<YYINITIAL> "break" { 
    System.out.println(" Termina la ejecucion del bucle o la sentencia switch actual "); 
    return symbol(sym.BREAK);
}
<YYINITIAL> "case" { 
    System.out.println(" Especifica un caso en una sentencia switch "); 
    return symbol(sym.CASE);
}
<YYINITIAL> "char" { 
    System.out.println(" Declara una variable de tipo caracter "); 
    return symbol(sym.CHAR);
}
<YYINITIAL> "const" { 
    System.out.println(" Declara una variable que no puede ser modificada "); 
    return symbol(sym.CONST);
}
<YYINITIAL> "continue" { 
    System.out.println(" Salta a la siguiente iteracion del bucle actual "); 
    return symbol(sym.CONTINUE);
}
<YYINITIAL> "default" { 
    System.out.println(" Especifica un caso por defecto en una sentencia switch "); 
    return symbol(sym.DEFAULT);
}
<YYINITIAL> "do" { 
    System.out.println(" Especifica el inicio de un bucle do-while "); 
    return symbol(sym.DO);
}
<YYINITIAL> "double" { 
    System.out.println(" Declara una variable de tipo doble precision "); 
    return symbol(sym.DOUBLE);
}
<YYINITIAL> "else" { 
    System.out.println(" Especifica la parte else de una instruccion if "); 
    return symbol(sym.ELSE);
}
<YYINITIAL> "enum" { 
    System.out.println(" Declara un conjunto de constantes enteras numeradas "); 
    return symbol(sym.ENUM);
}
<YYINITIAL> "extern" { 
    System.out.println(" Declara una variable global que esta definida en otro archivo "); 
    return symbol(sym.EXTERN);
}
<YYINITIAL> "float" { 
    System.out.println(" Declara una variable de tipo coma flotante "); 
    return symbol(sym.FLOAT);
}
<YYINITIAL> "for" { 
    System.out.println(" Especifica un bucle for "); 
    return symbol(sym.FOR);
}
<YYINITIAL> "goto" { 
    System.out.println(" Salta a una etiqueta especifica "); 
    return symbol(sym.GOTO);
}
<YYINITIAL> "if" { 
    System.out.println("Especifica una condicion"); 
    return symbol(sym.IF);
}
<YYINITIAL> "int" { 
    System.out.println("Declara una variable de tipo entero"); 
    return symbol(sym.INT);
}
<YYINITIAL> "long" { 
    System.out.println("Declara una variable de tipo entero largo"); 
    return symbol(sym.LOGIN);
}
<YYINITIAL> "register" { 
    System.out.println("Declara una variable que se almacena en el registro"); 
    return symbol(sym.REGISTER);
}
<YYINITIAL> "return" { 
    System.out.println("Devuelve un valor de una funcion"); 
    return symbol(sym.RETURN);
}
<YYINITIAL> "short" { 
    System.out.println("Declara una variable de tipo entero corto"); 
    return symbol(sym.SHORT);
}
<YYINITIAL> "signed" { 
    System.out.println("Declara una variable de tipo entero con signo"); 
    return symbol(sym.SIGNED);
}
<YYINITIAL> "sizeof" { 
    System.out.println("Devuelve el tamano de un tipo de dato"); 
    return symbol(sym.SIZEOF);
}
<YYINITIAL> "static" {
    System.out.println("Declara una variable local que se mantiene en la memoria despues de que la funcion termine"); 
    return symbol(sym.STATIC);
}
<YYINITIAL> "struct" { 
    System.out.println("Declara una estructura"); 
    return symbol(sym.STRUCT);
}
<YYINITIAL> "switch" { 
    System.out.println("Especifica una sentencia switch"); 
    return symbol(sym.SWITCH);
}
<YYINITIAL> "typedef" { 
    System.out.println("Declara un nuevo tipo de dato"); 
    return symbol(sym.TYPEDEF);
}
<YYINITIAL> "union" { 
    System.out.println("Declara una union"); 
    return symbol(sym.UNION);
}
<YYINITIAL> "unsigned" { 
    System.out.println("Declara una variable de tipo entero sin signo"); 
    return symbol(sym.UNSIGNED);
}
<YYINITIAL> "void" { 
    System.out.println("Funcion sin valor"); 
    return symbol(sym.VOID);
}
<YYINITIAL> "volatile" { 
    System.out.println("Declara una variable que puede ser modificada por hardware"); 
    return symbol(sym.VOLATILE);
}
<YYINITIAL> "while" { 
    System.out.println("Especifica un bucle while"); 
    return symbol(sym.WHILE);
}
<YYINITIAL> "#include" {
    System.out.println("Inclusion de libreria");
    return symbol(sym.INCLUDE);
}

/* Operadores */ 

<YYINITIAL> "+=" { 
    System.out.println(" Suma y asignacion "); 
    return symbol(sym.SUMA_ASIGNACION);
}
<YYINITIAL> "++" { 
    System.out.println(" Incremento "); 
    return symbol(sym.);
}
<YYINITIAL> "-=" { 
    System.out.println(" Resta y asignación "); 
    return symbol(sym.);
}
<YYINITIAL> "/=" { 
    System.out.println(" División y asignación "); 
    return symbol(sym.);
}
<YYINITIAL> "%=" { 
    System.out.println(" Módulo y asignación "); 
    return symbol(sym.);
}
<YYINITIAL> "--" { 
    System.out.println(" Decremento "); 
    return symbol(sym.);
}
<YYINITIAL> "<=" { 
    System.out.println(" Menor o igual que "); 
    return symbol(sym.);
}
<YYINITIAL> ">=" { 
    System.out.println(" Mayor que o igual que "); 
    return symbol(sym.);
}
<YYINITIAL> "==" { 
    System.out.println(" Igual que "); 
    return symbol(sym.);
}
<YYINITIAL> "!=" { 
    System.out.println(" Diferente que / No igual que "); 
    return symbol(sym.);
}
<YYINITIAL> "<=>" { 
    System.out.println(" Comparación a tres sentidos "); 
    return symbol(sym.);
}
<YYINITIAL> "&&" { 
    System.out.println(" Y lógico (AND) "); 
    return symbol(sym.);
}
<YYINITIAL> "||" { 
    System.out.println(" O lógico (OR) ");
    return symbol(sym.);
}
<YYINITIAL> "<<" { 
    System.out.println(" Desplazamiento a la izquierda "); 
    return symbol(sym.);
}
<YYINITIAL> "<<=" { 
    System.out.println(" Asignación con desplazamiento a la izquierda "); 
    return symbol(sym.);
}
<YYINITIAL> ">>" { 
    System.out.println(" Desplazamiento a la derecha "); 
    return symbol(sym.);
}
<YYINITIAL> ">>=" { 
    System.out.println(" Asignación con desplazamiento a la derecha "); 
    return symbol(sym.);
}
<YYINITIAL> "&=" { 
    System.out.println(" Asignación con AND binario "); 
    return symbol(sym.);
}
<YYINITIAL> "^=" { 
    System.out.println(" Asignación con XOR binario "); 
    return symbol(sym.);
}
<YYINITIAL> "()" { 
    System.out.println(" Llamada a función "); return symbol(sym.);
}
<YYINITIAL> "*=" { 
    System.out.println(" Multiplicación y asignación "); 
    return symbol(sym.);
}
<YYINITIAL> "/" { 
    System.out.println(" Division "); 
    return symbol(sym.);
}
<YYINITIAL> "%" { 
    System.out.println(" Módulo "); 
    return symbol(sym.);
}
<YYINITIAL> "|" { 
    System.out.println(" OR binario "); 
    return symbol(sym.);
}
<YYINITIAL> "&" { 
    System.out.println(" AND binario ");
    return symbol(sym.); 
}
<YYINITIAL> "*" { 
    System.out.println(" Multiplicacion "); 
    return symbol(sym.); 
}
<YYINITIAL> "=" { 
    System.out.println(" Asignación básica "); 
    return symbol(sym.IGUAL);
}
<YYINITIAL> "<" { 
    System.out.println(" Menor que "); 
    return symbol(sym.); 
}
<YYINITIAL> ">" { 
    System.out.println(" Mayor que "); 
    return symbol(sym.); 
}
<YYINITIAL> "!" { 
    System.out.println(" Negación lógica (NOT) "); return symbol(sym.); 
}
<YYINITIAL> "-" { 
    System.out.println(" Resta "); 
    return symbol(sym.); 
}
<YYINITIAL> "^" { 
    System.out.println(" XOR binario "); return symbol(sym.); 
}
<YYINITIAL> "~" { 
    System.out.println(" Complemento a uno "); 
    return symbol(sym.);
}
<YYINITIAL> "+" { 
    System.out.println(" Suma "); 
    return symbol(sym.SUMA);
}
<YYINITIAL> ";" { 
    System.out.println("Punto y coma"); 
    return symbol(sym.PUNTO_COMA);
}
<YYINITIAL> "{" { 
    System.out.println("Llave izquierda"); 
    return symbol(sym.BRACKET_LEFT);
}
<YYINITIAL> "}" { 
    System.out.println("Llave derecha"); 
    return symbol(sym.BRACKET_RIGHT);
}
<YYINITIAL> "(" { 
    System.out.println("Parentesis izquierdo"); 
    return symbol(sym.PARENTHESES_LEFT);
}
<YYINITIAL> ")" { 
    System.out.println("Parentesis derecho"); 
    return symbol(sym.PARENTHESES_RIGHT);
}

/* FUNCIONES */
<YYINITIAL> "main()" { 
    System.out.println("Metodo main"); 
    return symbol(sym.MAIN);
}

<YYINITIAL> "printf" { 
    System.out.println("Metodo print"); 
    return symbol(sym.PRINTF);
}

/* EXPRESIONES */
[\r\n] { /* Acciones específicas para salto de línea */ }
<YYINITIAL> "\\/\\*(?:.|[\\r\\n])*?\\*\\/" { 
    System.out.println("Comentarios multi: " + yytext()); 
    
}
<YYINITIAL> "\\/\\/[^\r\n]*" { 
    System.out.println("Comentarios unilinea: " + yytext()); 
    
}
<YYINITIAL> "[ \\n\\t\\r]+" { 
    System.out.println("Espacios: " + yytext()); 
    
}
<YYINITIAL> "\"(?:[^\"]|\\.)*\"" { 
    System.out.println("Cadenas: " + yytext()); 
    return symbol(sym.STRINGS);
}
<YYINITIAL> "\'(?:[^\']|\\.)*\'" { 
    System.out.println("Caracteres: " + yytext()); 
    return symbol(sym.CHARS);
}
<YYINITIAL> "^-?\\d+$" { 
    System.out.println("Enteros: " + yytext()); 
    return symbol(sym.INTS)
}
<YYINITIAL> "^-?\\d*\\.\\d+$" { 
    System.out.println("Decimales: " + yytext()); 
    return symbol(sym.FLOATS);
}
<YYINITIAL> "(true|false)" { 
    System.out.println("Boleanos: " + yytext()); 
    return symbol(sym.BOOLS);
}
<YYINITIAL> "[a-zA-Z_][a-zA-Z0-9_]*" { 
    System.out.println("Identificadores: " + yytext()); 
    return symbol(sym.VARS);
}
<YYINITIAL> "<([^>]*)>" {
    System.out.println("Lectura de libreria");
    return symbol(sym.LIB);
}

. { System.out.println("Simbolo no reconocido: " + yytext()); }