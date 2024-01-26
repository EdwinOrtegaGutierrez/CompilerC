/*
    ALVAREZ VELAZQUEZ EDOSN ALI
    ORTEGA GUTIERREZ EDWIN OMAR
    SANCHEZ REYES DANIA GUADALUPE
*/

package lexico;

import java_cup.runtime.*;

%%
%class Scanner
%unicode
%cup
%line
%column

%%

/* keywords */
"auto" { System.out.println(" Declara una variable local que se almacena en el stack "); }
"break" { System.out.println(" Termina la ejecucion del bucle o la sentencia switch actual "); }
"case" { System.out.println(" Especifica un caso en una sentencia switch "); }
"char" { System.out.println(" Declara una variable de tipo caracter "); }
"const" { System.out.println(" Declara una variable que no puede ser modificada "); }
"continue" { System.out.println(" Salta a la siguiente iteracion del bucle actual "); }
"default" { System.out.println(" Especifica un caso por defecto en una sentencia switch "); }
"do" { System.out.println(" Especifica el inicio de un bucle do-while "); }
"double" { System.out.println(" Declara una variable de tipo doble precision "); }
"else" { System.out.println(" Especifica la parte else de una instruccion if "); }
"enum" { System.out.println(" Declara un conjunto de constantes enteras numeradas "); }
"extern" { System.out.println(" Declara una variable global que esta definida en otro archivo "); }
"float" { System.out.println(" Declara una variable de tipo coma flotante "); }
"for" { System.out.println(" Especifica un bucle for "); }
"goto" { System.out.println(" Salta a una etiqueta especifica "); }
"if" { System.out.println("Especifica una condicion"); }
"int" { System.out.println("Declara una variable de tipo entero"); }
"long" { System.out.println("Declara una variable de tipo entero largo"); }
"register" { System.out.println("Declara una variable que se almacena en el registro"); }
"return" { System.out.println("Devuelve un valor de una funcion"); }
"short" { System.out.println("Declara una variable de tipo entero corto"); }
"signed" { System.out.println("Declara una variable de tipo entero con signo"); }
"sizeof" { System.out.println("Devuelve el tamano de un tipo de dato"); }
"static" { System.out.println("Declara una variable local que se mantiene en la memoria despues de que la funcion termine"); }
"struct" { System.out.println("Declara una estructura"); }
"switch" { System.out.println("Especifica una sentencia switch"); }
"typedef" { System.out.println("Declara un nuevo tipo de dato"); }
"union" { System.out.println("Declara una union"); }
"unsigned" { System.out.println("Declara una variable de tipo entero sin signo"); }
"void" { System.out.println("Declara una funcion que no devuelve ningun valor"); }
"volatile" { System.out.println("Declara una variable que puede ser modificada por hardware"); }
"while" { System.out.println("Especifica un bucle while"); }

/* Operadores */ 

"+=" { System.out.println(" Suma y asignación "); }
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
"/" { System.out.println(" División "); }
"%" { System.out.println(" Módulo "); }
"|" { System.out.println(" OR binario "); }
"=" { System.out.println(" Asignación básica "); }
"&" { System.out.println(" AND binario "); }
"*" { System.out.println(" Multiplicación "); }
"*=" { System.out.println(" Multiplicación y asignación "); }
"<" { System.out.println(" Menor que "); }
">" { System.out.println(" Mayor que "); }
"!" { System.out.println(" Negación lógica (NOT) "); }
"-" { System.out.println(" Resta "); }
"^" { System.out.println(" XOR binario "); }
"~" { System.out.println(" Complemento a uno "); }
"+" { System.out.println(" Suma "); }

. { System.out.println("Simbolo no reconocido"); }