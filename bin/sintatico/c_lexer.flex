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

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

%%

/* keywords */
"auto" { 
    System.out.println(" Declara una variable local que se almacena en el stack "); 
    return symbol(sym.AUTO, yytext());
}
"break" { 
    System.out.println(" Termina la ejecucion del bucle o la sentencia switch actual "); 
    return symbol(sym.BREAK, yytext());
}
"case" { 
    System.out.println(" Especifica un caso en una sentencia switch "); 
    return symbol(sym.CASE, yytext());
}
"char" { 
    System.out.println(" Declara una variable de tipo caracter "); 
    return symbol(sym.CHAR, yytext());
}
"const" { 
    System.out.println(" Declara una variable que no puede ser modificada "); 
    return symbol(sym.CONST, yytext());
}
"continue" { 
    System.out.println(" Salta a la siguiente iteracion del bucle actual "); 
    return symbol(sym.CONTINUE, yytext());
}
"default" { 
    System.out.println(" Especifica un caso por defecto en una sentencia switch "); 
    return symbol(sym.DEFAULT, yytext());
}
"do" { 
    System.out.println(" Especifica el inicio de un bucle do-while "); 
    return symbol(sym.DO, yytext());
}
"double" { 
    System.out.println(" Declara una variable de tipo doble precision "); 
    return symbol(sym.DOUBLE, yytext());
}
"else" { 
    System.out.println(" Especifica la parte else de una instruccion if "); 
    return symbol(sym.ELSE, yytext());
}
"enum" { 
    System.out.println(" Declara un conjunto de constantes enteras numeradas "); 
    return symbol(sym.ENUM, yytext());
}
"extern" { 
    System.out.println(" Declara una variable global que esta definida en otro archivo "); 
    return symbol(sym.EXTERN, yytext());
}
"float" { 
    System.out.println(" Declara una variable de tipo coma flotante "); 
    return symbol(sym.FLOAT, yytext());
}
"for" { 
    System.out.println(" Especifica un bucle for "); 
    return symbol(sym.FOR, yytext());
}
"goto" { 
    System.out.println(" Salta a una etiqueta especifica "); 
    return symbol(sym.GOTO, yytext());
}
"if" { 
    System.out.println("Especifica una condicion"); 
    return symbol(sym.IF, yytext());
}
"int" { 
    System.out.println(yytext()); 
    return symbol(sym.INT, yytext());
}
"long" { 
    System.out.println("Declara una variable de tipo entero largo"); 
    return symbol(sym.LOGIN, yytext());
}
"register" { 
    System.out.println("Declara una variable que se almacena en el registro"); 
    return symbol(sym.REGISTER, yytext());
}
"return" { 
    System.out.println(yytext()); 
    return symbol(sym.RETURN, yytext());
}
"short" { 
    System.out.println("Declara una variable de tipo entero corto"); 
    return symbol(sym.SHORT, yytext());
}
"signed" { 
    System.out.println("Declara una variable de tipo entero con signo"); 
    return symbol(sym.SIGNED, yytext());
}
"sizeof" { 
    System.out.println("Devuelve el tamano de un tipo de dato"); 
    return symbol(sym.SIZEOF, yytext());
}
"static" {
    System.out.println("Declara una variable local que se mantiene en la memoria despues de que la funcion termine"); 
    return symbol(sym.STATIC, yytext());
}
"struct" { 
    System.out.println("Declara una estructura"); 
    return symbol(sym.STRUCT, yytext());
}
"switch" { 
    System.out.println("Especifica una sentencia switch"); 
    return symbol(sym.SWITCH, yytext());
}
"typedef" { 
    System.out.println("Declara un nuevo tipo de dato"); 
    return symbol(sym.TYPEDEF, yytext());
}
"union" { 
    System.out.println("Declara una union"); 
    return symbol(sym.UNION, yytext());
}
"unsigned" { 
    System.out.println("Declara una variable de tipo entero sin signo"); 
    return symbol(sym.UNSIGNED, yytext());
}
"void" { 
    System.out.println("Funcion sin valor"); 
    return symbol(sym.VOID, yytext());
}
"volatile" { 
    System.out.println("Declara una variable que puede ser modificada por hardware"); 
    return symbol(sym.VOLATILE, yytext());
}
"while" { 
    System.out.println("Especifica un bucle while"); 
    return symbol(sym.WHILE, yytext());
}
<YYINITIAL> "#include" {
    System.out.println(yytext());
    return symbol(sym.INCLUDE, yytext());
}

/* Operadores */ 

"+=" { 
    System.out.println("Suma y asignacion "); 
    return symbol(sym.SUMA_ASIGNACION, yytext());
}
"++" { 
    System.out.println("Incremento "); 
    return symbol(sym.INCREMENTO, yytext());
}
"-=" { 
    System.out.println("Resta y asignación "); 
    return symbol(sym.RESTA_ASIGNACION, yytext());
}
"/=" { 
    System.out.println("División y asignación "); 
    return symbol(sym.DIVISION_ASIGNACION, yytext());
}
"%=" { 
    System.out.println("Módulo y asignación "); 
    return symbol(sym.MODULO_Y_ASIGNACION, yytext());
}
"--" { 
    System.out.println("Decremento "); 
    return symbol(sym.DECREMENTO, yytext());
}
"<=" { 
    System.out.println("Menor o igual que "); 
    return symbol(sym.MENOR_O_IGUAL_QUE, yytext());
}
">=" { 
    System.out.println("Mayor que o igual que "); 
    return symbol(sym.MAYOR_O_IGUAL_QUE, yytext());
}
"==" { 
    System.out.println("Igual que "); 
    return symbol(sym.IGUAL_QUE, yytext());
}
"!=" { 
    System.out.println("Diferente que / No igual que "); 
    return symbol(sym.DIFERENTE_QUE, yytext());
}
"<=>" { 
    System.out.println("Comparación a tres sentidos "); 
    return symbol(sym.COMPARACION_TRES_SENTIDOS, yytext());
}
"&&" { 
    System.out.println("Y lógico (AND) "); 
    return symbol(sym.AND, yytext());
}
"||" { 
    System.out.println("O lógico (OR) ");
    return symbol(sym.OR, yytext());
}
"<<" { 
    System.out.println("Desplazamiento a la izquierda "); 
    return symbol(sym.DESPLAZAMIENTO_IZQUIERDA, yytext());
}
"<<=" { 
    System.out.println("Asignación con desplazamiento a la izquierda "); 
    return symbol(sym.ASIGNACION_DESPLAZAMIENTO_IZQUIERDA, yytext());
}
">>" { 
    System.out.println("Desplazamiento a la derecha "); 
    return symbol(sym.DESPLAZAMIENTO_DERECHA, yytext());
}
">>=" { 
    System.out.println("Asignación con desplazamiento a la derecha "); 
    return symbol(sym.ASIGNACION_DESPLAZAMIENTO_DERECHA, yytext());
}
"&=" { 
    System.out.println("Asignación con AND binario "); 
    return symbol(sym.ASIGNACION_AND, yytext());
}
"^=" { 
    System.out.println("Asignación con XOR binario "); 
    return symbol(sym.ASIGNACION_XOR, yytext());
}
"()" { 
    System.out.println(yytext()); 
    return symbol(sym.LLAMADA_A_FUNCION, yytext());
}
"*=" { 
    System.out.println("Multiplicación y asignación "); 
    return symbol(sym.MULTIPLIACION_Y_ASIGNACION, yytext());
}
"/" { 
    System.out.println("Division "); 
    return symbol(sym.DIVISION, yytext());
}
"%" { 
    System.out.println("Módulo "); 
    return symbol(sym.MODULO, yytext());
}
"|" { 
    System.out.println("OR binario "); 
    return symbol(sym.OR_BINARIO, yytext());
}
"&" { 
    System.out.println("AND binario ");
    return symbol(sym.AND_BINARIO, yytext()); 
}
"*" { 
    System.out.println("Multiplicacion "); 
    return symbol(sym.MULTIPLICACION, yytext()); 
}
"=" { 
    System.out.println("Asignación básica "); 
    return symbol(sym.IGUAL, yytext());
}
"<" { 
    System.out.println("Menor que "); 
    return symbol(sym.MENOR_QUE, yytext()); 
}
">" { 
    System.out.println("Mayor que "); 
    return symbol(sym.MAYOR_QUE, yytext()); 
}
"!" { 
    System.out.println("Negación lógica (NOT) "); 
    return symbol(sym.NEGACION_LOGICA, yytext()); 
}
"-" { 
    System.out.println("Resta "); 
    return symbol(sym.RESTA, yytext()); 
}
"^" { 
    System.out.println("XOR binario "); 
    return symbol(sym.XOR_BINARIO, yytext()); 
}
"~" { 
    System.out.println("Complemento a uno "); 
    return symbol(sym.COMPLEMENTO_A_UNO, yytext());
}
"+" { 
    System.out.println("Suma "); 
    return symbol(sym.SUMA, yytext());
}
";" { 
    System.out.println(yytext()); 
    return symbol(sym.PUNTO_COMA, yytext());
}
"{" { 
    System.out.println(yytext()); 
    return symbol(sym.BRACKET_LEFT, yytext());
}
"}" { 
    System.out.println(yytext()); 
    return symbol(sym.BRACKET_RIGHT, yytext());
}
"(" { 
    System.out.println(yytext()); 
    return symbol(sym.PARENTHESES_LEFT, yytext());
}
")" { 
    System.out.println(yytext()); 
    return symbol(sym.PARENTHESES_RIGHT, yytext());
}

/* FUNCIONES */
"main" { 
    System.out.println(yytext()); 
    return symbol(sym.MAIN, yytext());
}

"printf" { 
    System.out.println(yytext()); 
    return symbol(sym.PRINTF, yytext());
}

/* EXPRESIONES */
[ \n\t\r] { /* Acciones específicas para salto de línea */ }

(\/\*(\s*|.*?)*\*\/)|(\/\/.*) { /* Comentarios multilinea y unilinea */ }

("\"".*?"\"") { 
    System.out.println(yytext()); 
    return symbol(sym.STRINGS, yytext());
}

(<)[a-z]*.h(>) {
    System.out.println(yytext());
    return symbol(sym.LIB, yytext());
}

("\'".*?"\'") { 
    System.out.println("Lectura de caracteres: " + yytext()); 
    return symbol(sym.CHARS, yytext());
}

[0-9]* { 
    System.out.println(yytext()); 
    return symbol(sym.INTS, yytext());
}
(true|false) { 
    System.out.println("Lectura de boleanos: " + yytext()); 
    return symbol(sym.BOOLS, yytext());
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