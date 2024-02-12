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
        return new Symbol(type, yyline, yycolumn);|
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
}%

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

/* Operadores */ 

"+=" { System.out.println(" Suma y asignacion "); }
"++" { System.out.println(" Incremento "); }
"-=" { System.out.println(" Resta y asignación "); }
"/=" { System.out.println(" División y asignación "); }
"%=" { System.out.println(" Módulo y asignación "); }
"--" { System.out.println(" Decremento "); }
"<=" { System.out.println(" Menor o igual que "); }
">=" { System.out.println(" Mayor que o igual que "); }
"==" { System.out.println(" Igual que "); }
"!=" { System.out.println(" Diferente que / No igual que "); }
"<=>" { System.out.println(" Comparación a tres sentidos "); }
"&&" { System.out.println(" Y lógico (AND) "); }
"||" { System.out.println(" O lógico (OR) "); }
"<<" { System.out.println(" Desplazamiento a la izquierda "); }
"<<=" { System.out.println(" Asignación con desplazamiento a la izquierda "); }
">>" { System.out.println(" Desplazamiento a la derecha "); }
">>=" { System.out.println(" Asignación con desplazamiento a la derecha "); }
"&=" { System.out.println(" Asignación con AND binario "); }
"^=" { System.out.println(" Asignación con XOR binario "); }
"()" { System.out.println(" Llamada a función "); }
"/" { System.out.println(" Division "); }
"%" { System.out.println(" Módulo "); }
"|" { System.out.println(" OR binario "); }
"=" { System.out.println(" Asignación básica "); }
"&" { System.out.println(" AND binario "); }
"*" { System.out.println(" Multiplicacion "); }
"*=" { System.out.println(" Multiplicación y asignación "); }
"<" { System.out.println(" Menor que "); }
">" { System.out.println(" Mayor que "); }
"!" { System.out.println(" Negación lógica (NOT) "); }
"-" { System.out.println(" Resta "); }
"^" { System.out.println(" XOR binario "); }
"~" { System.out.println(" Complemento a uno "); }
"+" { System.out.println(" Suma "); }

/* EXPRESIONES */
[\r\n] { /* Acciones específicas para salto de línea */ }
"\\/\\*(?:.|[\\r\\n])*?\\*\\/" { System.out.println("Comentarios multi: " + yytext()); }
"\\/\\/[^\r\n]*" { System.out.println("Comentarios unilinea: " + yytext()); }
"[ \\n\\t\\r]+" { System.out.println("Espacios: " + yytext()); }
"\"(?:[^\"]|\\.)*\"" { System.out.println("Cadenas: " + yytext()); }
"\'(?:[^\']|\\.)*\'" { System.out.println("Caracteres: " + yytext()); }
"^-?\\d+$" { System.out.println("Enteros: " + yytext()); }
"^-?\\d*\\.\\d+$" { System.out.println("Decimales: " + yytext()); }
"(true|false)" { System.out.println("Boleanos: " + yytext()); }
"[a-zA-Z_][a-zA-Z0-9_]*" { System.out.println("Identificadores: " + yytext()); }

. { System.out.println("Simbolo no reconocido: " + yytext()); }