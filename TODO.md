# TODO 
## Expresiones

1. Comentarios multi        \/\*(?:.|[\r\n])*?\*\/
2. Comentarios uni          \/\/[^\r\n]*
3. Espacios                 [ \n\t\r]+
4. Cadenas                  \"(?:[^\"]|\\.)*\"
5. Caracteres               \"(?:[^\"\\]|\\.)\"
6. Enteros                  ^-?\d+$
7. Decimales                ^-?\d*\.\d+$
8. Boleanos                 (true|false)
9. Identificadores          [a-zA-Z_][a-zA-Z0-9_]*

Añadir yytext()

# Material
<ul>
    <li>
        <a href="https://baulderasec.wordpress.com/programando-2/programando-con-javascript/introduccion-a-la-programacion/expresiones-regulares/">Expresiones regulares</a>
    </li>
    <li>
        <a href="https://regex101.com">Regex</a>
    </li>
</ul>