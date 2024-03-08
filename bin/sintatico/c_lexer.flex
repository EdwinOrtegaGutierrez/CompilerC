/*
    ALVAREZ VELAZQUEZ EDOSN ALI
    ORTEGA GUTIERREZ EDWIN OMAR
    SANCHEZ REYES DANIA GUADALUPE
*/

/*  package lexico; */

package sintatico;

import java_cup.*;
import java_cup.runtime.*;

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
"auto" { 
    System.out.println(" Declara una variable local que se almacena en el stack "); 
    return symbol(sym.AUTO);
}
"break" { 
    System.out.println(" Termina la ejecucion del bucle o la sentencia switch actual "); 
    return symbol(sym.BREAK);
}
"case" { 
    System.out.println(" Especifica un caso en una sentencia switch "); 
    return symbol(sym.CASE);
}
"char" { 
    System.out.println(" Declara una variable de tipo caracter "); 
    return symbol(sym.CHAR);
}
"const" { 
    System.out.println(" Declara una variable que no puede ser modificada "); 
    return symbol(sym.CONST);
}
"continue" { 
    System.out.println(" Salta a la siguiente iteracion del bucle actual "); 
    return symbol(sym.CONTINUE);
}
"default" { 
    System.out.println(" Especifica un caso por defecto en una sentencia switch "); 
    return symbol(sym.DEFAULT);
}
"do" { 
    System.out.println(" Especifica el inicio de un bucle do-while "); 
    return symbol(sym.DO);
}
"double" { 
    System.out.println(" Declara una variable de tipo doble precision "); 
    return symbol(sym.DOUBLE);
}
"else" { 
    System.out.println(" Especifica la parte else de una instruccion if "); 
    return symbol(sym.ELSE);
}
"enum" { 
    System.out.println(" Declara un conjunto de constantes enteras numeradas "); 
    return symbol(sym.ENUM);
}
"extern" { 
    System.out.println(" Declara una variable global que esta definida en otro archivo "); 
    return symbol(sym.EXTERN);
}
"float" { 
    System.out.println(" Declara una variable de tipo coma flotante "); 
    return symbol(sym.FLOAT);
}
"for" { 
    System.out.println(" Especifica un bucle for "); 
    return symbol(sym.FOR);
}
"goto" { 
    System.out.println(" Salta a una etiqueta especifica "); 
    return symbol(sym.GOTO);
}
"if" { 
    System.out.println("Especifica una condicion"); 
    return symbol(sym.IF);
}
"int" { 
    System.out.println("Declara una variable de tipo entero"); 
    return symbol(sym.INT);
}
"long" { 
    System.out.println("Declara una variable de tipo entero largo"); 
    return symbol(sym.LOGIN);
}
"register" { 
    System.out.println("Declara una variable que se almacena en el registro"); 
    return symbol(sym.REGISTER);
}
"return" { 
    System.out.println("Devuelve un valor de una funcion"); 
    return symbol(sym.RETURN);
}
"short" { 
    System.out.println("Declara una variable de tipo entero corto"); 
    return symbol(sym.SHORT);
}
"signed" { 
    System.out.println("Declara una variable de tipo entero con signo"); 
    return symbol(sym.SIGNED);
}
"sizeof" { 
    System.out.println("Devuelve el tamano de un tipo de dato"); 
    return symbol(sym.SIZEOF);
}
"static" {
    System.out.println("Declara una variable local que se mantiene en la memoria despues de que la funcion termine"); 
    return symbol(sym.STATIC);
}
"struct" { 
    System.out.println("Declara una estructura"); 
    return symbol(sym.STRUCT);
}
"switch" { 
    System.out.println("Especifica una sentencia switch"); 
    return symbol(sym.SWITCH);
}
"typedef" { 
    System.out.println("Declara un nuevo tipo de dato"); 
    return symbol(sym.TYPEDEF);
}
"union" { 
    System.out.println("Declara una union"); 
    return symbol(sym.UNION);
}
"unsigned" { 
    System.out.println("Declara una variable de tipo entero sin signo"); 
    return symbol(sym.UNSIGNED);
}
"void" { 
    System.out.println("Funcion sin valor"); 
    return symbol(sym.VOID);
}
"volatile" { 
    System.out.println("Declara una variable que puede ser modificada por hardware"); 
    return symbol(sym.VOLATILE);
}
"while" { 
    System.out.println("Especifica un bucle while"); 
    return symbol(sym.WHILE);
}
<YYINITIAL> "#include" {
    System.out.println("Inclusion de libreria");
    return symbol(sym.INCLUDE);
}

/* Operadores */ 

"+=" { 
    System.out.println("Suma y asignacion "); 
    return symbol(sym.SUMA_ASIGNACION);
}
"++" { 
    System.out.println("Incremento "); 
    return symbol(sym.INCREMENTO);
}
"-=" { 
    System.out.println("Resta y asignación "); 
    return symbol(sym.RESTA_ASIGNACION);
}
"/=" { 
    System.out.println("División y asignación "); 
    return symbol(sym.DIVISION_ASIGNACION);
}
"%=" { 
    System.out.println("Módulo y asignación "); 
    return symbol(sym.MODULO_Y_ASIGNACION);
}
"--" { 
    System.out.println("Decremento "); 
    return symbol(sym.DECREMENTO);
}
"<=" { 
    System.out.println("Menor o igual que "); 
    return symbol(sym.MENOR_O_IGUAL_QUE);
}
">=" { 
    System.out.println("Mayor que o igual que "); 
    return symbol(sym.MAYOR_O_IGUAL_QUE);
}
"==" { 
    System.out.println("Igual que "); 
    return symbol(sym.IGUAL_QUE);
}
"!=" { 
    System.out.println("Diferente que / No igual que "); 
    return symbol(sym.DIFERENTE_QUE);
}
"<=>" { 
    System.out.println("Comparación a tres sentidos "); 
    return symbol(sym.COMPARACION_TRES_SENTIDOS);
}
"&&" { 
    System.out.println("Y lógico (AND) "); 
    return symbol(sym.AND);
}
"||" { 
    System.out.println("O lógico (OR) ");
    return symbol(sym.OR);
}
"<<" { 
    System.out.println("Desplazamiento a la izquierda "); 
    return symbol(sym.DESPLAZAMIENTO_IZQUIERDA);
}
"<<=" { 
    System.out.println("Asignación con desplazamiento a la izquierda "); 
    return symbol(sym.ASIGNACION_DESPLAZAMIENTO_IZQUIERDA);
}
">>" { 
    System.out.println("Desplazamiento a la derecha "); 
    return symbol(sym.DESPLAZAMIENTO_DERECHA);
}
">>=" { 
    System.out.println("Asignación con desplazamiento a la derecha "); 
    return symbol(sym.ASIGNACION_DESPLAZAMIENTO_DERECHA);
}
"&=" { 
    System.out.println("Asignación con AND binario "); 
    return symbol(sym.ASIGNACION_AND);
}
"^=" { 
    System.out.println("Asignación con XOR binario "); 
    return symbol(sym.ASIGNACION_XOR);
}
"()" { 
    System.out.println("Llamada a función "); 
    return symbol(sym.LLAMADA_A_FUNCION);
}
"*=" { 
    System.out.println("Multiplicación y asignación "); 
    return symbol(sym.MULTIPLIACION_Y_ASIGNACION);
}
"/" { 
    System.out.println("Division "); 
    return symbol(sym.DIVISION);
}
"%" { 
    System.out.println("Módulo "); 
    return symbol(sym.MODULO);
}
"|" { 
    System.out.println("OR binario "); 
    return symbol(sym.OR_BINARIO);
}
"&" { 
    System.out.println("AND binario ");
    return symbol(sym.AND_BINARIO); 
}
"*" { 
    System.out.println("Multiplicacion "); 
    return symbol(sym.MULTIPLICACION); 
}
"=" { 
    System.out.println("Asignación básica "); 
    return symbol(sym.IGUAL);
}
"<" { 
    System.out.println("Menor que "); 
    return symbol(sym.MENOR_QUE); 
}
">" { 
    System.out.println("Mayor que "); 
    return symbol(sym.MAYOR_QUE); 
}
"!" { 
    System.out.println("Negación lógica (NOT) "); 
    return symbol(sym.NEGACION_LOGICA); 
}
"-" { 
    System.out.println("Resta "); 
    return symbol(sym.RESTA); 
}
"^" { 
    System.out.println("XOR binario "); 
    return symbol(sym.XOR_BINARIO); 
}
"~" { 
    System.out.println("Complemento a uno "); 
    return symbol(sym.COMPLEMENTO_A_UNO);
}
"+" { 
    System.out.println("Suma "); 
    return symbol(sym.SUMA);
}
";" { 
    System.out.println("Punto y coma"); 
    return symbol(sym.PUNTO_COMA);
}
"{" { 
    System.out.println("Llave izquierda"); 
    return symbol(sym.BRACKET_LEFT);
}
"}" { 
    System.out.println("Llave derecha"); 
    return symbol(sym.BRACKET_RIGHT);
}
"(" { 
    System.out.println("Parentesis izquierdo"); 
    return symbol(sym.PARENTHESES_LEFT);
}
")" { 
    System.out.println("Parentesis derecho"); 
    return symbol(sym.PARENTHESES_RIGHT);
}

/* FUNCIONES */
<YYINITIAL> "main" { 
    System.out.println("Metodo main"); 
    return symbol(sym.MAIN);
}

"printf" { 
    System.out.println("Metodo print"); 
    return symbol(sym.PRINTF);
}

/* EXPRESIONES */
[ \n\t\r] { /* Acciones específicas para salto de línea */ }

(\/\*(\s*|.*?)*\*\/)|(\/\/.*) { System.out.println("Comentarios multilinea y unilinea"); }

("\"".*?"\"") { 
    System.out.println("Lectura de cadenas: " + yytext()); 
    return symbol(sym.STRINGS);
}

(<)[a-z]*.h(>) {
    System.out.println("Lectura de libreria");
    return symbol(sym.LIB);
}

("\'".*?"\'") { 
    System.out.println("Lectura de caracteres: " + yytext()); 
    return symbol(sym.CHARS);
}

[0-9]* { 
    System.out.println("Lectura de enteros: " + yytext()); 
    return symbol(sym.INTS);
}
(true|false) { 
    System.out.println("Lectura de boleanos: " + yytext()); 
    return symbol(sym.BOOLS);
}
/*
"^-?\\d*\\.\\d+$" { 
    System.out.println("Lectura de decimales: " + yytext()); 
    return symbol(sym.FLOATS);
}
[a-zA-Z_][a-zA-Z0-9_]* { 
    System.out.println("Identificadores: " + yytext()); 
    return symbol(sym.VARS);
}
 */

. { System.out.println("Simbolo no reconocido: " + yytext()); }