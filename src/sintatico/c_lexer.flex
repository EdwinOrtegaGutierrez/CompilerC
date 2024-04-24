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

long

/* keywords */
"auto" { 
    /* Declara una variable local que se almacena en el stack */
    return symbol(sym.AUTO, yytext());
}
"break" { 
    /* Termina la ejecucion del bucle o la sentencia switch actual */
    return symbol(sym.BREAK, yytext());
}
"case" { 
    /* Especifica un caso en una sentencia switch */
    return symbol(sym.CASE, yytext());
}
"char" { 
    /* Declara una variable de tipo caracter */
    return symbol(sym.CHAR, yytext());
}
"const" { 
    /* Declara una variable que no puede ser modificada */
    return symbol(sym.CONST, yytext());
}
"continue" { 
    /* Salta a la siguiente iteracion del bucle actual */
    return symbol(sym.CONTINUE, yytext());
}
"default" { 
    /*Especifica un caso por defecto en una sentencia switch */
    return symbol(sym.DEFAULT, yytext());
}
"do" { 
    /*Especifica el inicio de un bucle do-while */
    return symbol(sym.DO, yytext());
}
"double" { 
    /*Declara una variable de tipo doble precision */
    return symbol(sym.DOUBLE, yytext());
}
"else" { 
    /*Especifica la parte else de una instruccion if */
    return symbol(sym.ELSE, yytext());
}
"enum" { 
    /*Declara un conjunto de constantes enteras numeradas */
    return symbol(sym.ENUM, yytext());
}
"extern" { 
    /*Declara una variable global que esta definida en otro archivo */
    return symbol(sym.EXTERN, yytext());
}
"float" { 
    /*Declara una variable de tipo coma flotante */
    return symbol(sym.FLOAT, yytext());
}
"for" { 
    /*Especifica un bucle for */
    return symbol(sym.FOR, yytext());
}
"goto" { 
    /*Salta a una etiqueta especifica */
    return symbol(sym.GOTO, yytext());
}
"if" { 
    /*Especifica una condicion*/
    return symbol(sym.IF, yytext());
}
"int" { 
    return symbol(sym.INT, yytext());
}
"long" { 
    /*Declara una variable de tipo entero largo*/
    return symbol(sym.LONG, yytext());
}
"register" { 
    /*Declara una variable que se almacena en el registro*/
    return symbol(sym.REGISTER, yytext());
}
"return" { 
    return symbol(sym.RETURN, yytext());
}
"short" { 
    /*Declara una variable de tipo entero corto*/
    return symbol(sym.SHORT, yytext());
}
"signed" { 
    /*Declara una variable de tipo entero con signo*/
    return symbol(sym.SIGNED, yytext());
}
"sizeof" { 
    /*Devuelve el tamano de un tipo de dato*/
    return symbol(sym.SIZEOF, yytext());
}
"static" {
    /*Declara una variable local que se mantiene en la memoria despues de que la funcion termine*/
    return symbol(sym.STATIC, yytext());
}
"struct" { 
    /*Declara una estructura*/
    return symbol(sym.STRUCT, yytext());
}
"switch" { 
    /*Especifica una sentencia switch*/
    return symbol(sym.SWITCH, yytext());
}
"typedef" { 
    /*Declara un nuevo tipo de dato*/
    return symbol(sym.TYPEDEF, yytext());
}
"union" { 
    /*Declara una union*/
    return symbol(sym.UNION, yytext());
}
"unsigned" { 
    /*Declara una variable de tipo entero sin signo*/
    return symbol(sym.UNSIGNED, yytext());
}
"void" { 
    /*Funcion sin valor*/
    return symbol(sym.VOID, yytext());
}
"volatile" { 
    /*Declara una variable que puede ser modificada por hardware*/
    return symbol(sym.VOLATILE, yytext());
}
"while" { 
    /*Especifica un bucle while*/
    return symbol(sym.WHILE, yytext());
}
<YYINITIAL> "#include" {
    return symbol(sym.INCLUDE, yytext());
}

/* Operadores */ 

"+=" { 
    /*Suma y asignacion */
    return symbol(sym.SUMA_ASIGNACION, yytext());
}
"++" { 
    /*Incremento */
    return symbol(sym.INCREMENTO, yytext());
}
"-=" { 
    /*Resta y asignación */
    return symbol(sym.RESTA_ASIGNACION, yytext());
}
"/=" { 
    /*División y asignación */
    return symbol(sym.DIVISION_ASIGNACION, yytext());
}
"%=" { 
    /*Módulo y asignación */
    return symbol(sym.MODULO_Y_ASIGNACION, yytext());
}
"--" { 
    /*Decremento */
    return symbol(sym.DECREMENTO, yytext());
}
"<=" { 
    /*Menor o igual que */
    return symbol(sym.MENOR_O_IGUAL_QUE, yytext());
}
">=" { 
    /*Mayor que o igual que */
    return symbol(sym.MAYOR_O_IGUAL_QUE, yytext());
}
"==" { 
    /*Igual que */
    return symbol(sym.IGUAL_QUE, yytext());
}
"!=" { 
    /*Diferente que / No igual que */
    return symbol(sym.DIFERENTE_QUE, yytext());
}
"<=>" { 
    /*Comparación a tres sentidos */
    return symbol(sym.COMPARACION_TRES_SENTIDOS, yytext());
}
"&&" { 
    /*Y lógico (AND) */
    return symbol(sym.AND, yytext());
}
"||" { 
    /*O lógico (OR)*/
    return symbol(sym.OR, yytext());
}
"<<" { 
    /*Desplazamiento a la izquierda */
    return symbol(sym.DESPLAZAMIENTO_IZQUIERDA, yytext());
}
"<<=" { 
    /*Asignación con desplazamiento a la izquierda */
    return symbol(sym.ASIGNACION_DESPLAZAMIENTO_IZQUIERDA, yytext());
}
">>" { 
    /*Desplazamiento a la derecha */
    return symbol(sym.DESPLAZAMIENTO_DERECHA, yytext());
}
">>=" { 
    /*Asignación con desplazamiento a la derecha */
    return symbol(sym.ASIGNACION_DESPLAZAMIENTO_DERECHA, yytext());
}
"&=" { 
    /*Asignación con AND binario */
    return symbol(sym.ASIGNACION_AND, yytext());
}
"^=" { 
    /*Asignación con XOR binario */
    return symbol(sym.ASIGNACION_XOR, yytext());
}
"()" { 
    return symbol(sym.LLAMADA_A_FUNCION, yytext());
}
"[]" {
    return symbol(sym.LIST, yytext());
}
"*=" { 
    /*Multiplicación y asignación */
    return symbol(sym.MULTIPLIACION_Y_ASIGNACION, yytext());
}
"/" { 
    /*Division */
    return symbol(sym.DIVISION, yytext());
}
"%" { 
    /*Módulo */
    return symbol(sym.MODULO, yytext());
}
"|" { 
    /*OR binario */
    return symbol(sym.OR_BINARIO, yytext());
}
"&" { 
    /*AND binario*/
    return symbol(sym.AND_BINARIO, yytext()); 
}
"*" { 
    /*Multiplicacion */
    return symbol(sym.MULTIPLICACION, yytext()); 
}
"=" { 
    /*Asignación básica */
    return symbol(sym.IGUAL, yytext());
}
"<" { 
    /*Menor que */
    return symbol(sym.MENOR_QUE, yytext()); 
}
">" { 
    /*Mayor que */
    return symbol(sym.MAYOR_QUE, yytext()); 
}
"!" { 
    /*Negación lógica (NOT) */
    return symbol(sym.NEGACION_LOGICA, yytext()); 
}
"-" { 
    /*Resta */
    return symbol(sym.RESTA, yytext()); 
}
"^" { 
    /*XOR binario */
    return symbol(sym.XOR_BINARIO, yytext()); 
}
"~" { 
    /*Complemento a uno */
    return symbol(sym.COMPLEMENTO_A_UNO, yytext());
}
"+" { 
    /*Suma */
    return symbol(sym.SUMA, yytext());
}
";" { 
    return symbol(sym.PUNTO_COMA, yytext());
}
":" {
    return symbol(sym.DOS_PUNTOS, yytext());
}
"," {
    return symbol(sym.COMA, yytext());
}
"{" { 
    return symbol(sym.BRACKET_LEFT, yytext());
}
"}" {  
    return symbol(sym.BRACKET_RIGHT, yytext());
}
"(" { 
    return symbol(sym.PARENTHESES_LEFT, yytext());
}
")" { 
    return symbol(sym.PARENTHESES_RIGHT, yytext());
}

/* FUNCIONES */
"main" { 
    return symbol(sym.MAIN, yytext());
}

"printf" {  
    return symbol(sym.PRINTF, yytext());
}

/* EXPRESIONES */
[ \n\t\r] { /* Acciones específicas para salto de línea */ }

(\/\*(\s*|.*?)*\*\/)|(\/\/.*) { /* Comentarios multilinea y unilinea */ }

("\"".*?"\"") { 
    /* STRINGS */
    return symbol(sym.STRINGS, yytext());
}

(<)[a-z]*.h(>) {
    return symbol(sym.LIB, yytext());
}

("\'".*?"\'") { 
    return symbol(sym.CHARS, yytext());
}

[0-9]* { 
    return symbol(sym.INTS, yytext());
}
(true|false) { 
    return symbol(sym.BOOLS, yytext());
}

[0-9]+.[0-9]+ { 
    return symbol(sym.FLOATS, yytext());
}

[a-zA-Z0-9]+ {
    return symbol(sym.VAR_NAME, yytext());
}

. { System.out.println("Simbolo no reconocido: " + yytext()); }