import re

# Texto con el código fuente
codigo_fuente = """
#include <stdio.h>
int main() {
   // Comentario
   printf("Hello, World!");

   // Create variables
   int myNum = 15;            // Integer (whole number)
   float myFloatNum = 5.99;   // Floating point number
   char myLetter = 'D';       // Character
   int anotherNum;            // Another integer variable without initialization

   return 0;
}
"""

# Expresión regular para encontrar nombres de variables int, float y char
patron_variables = r'\b(int|float|char)\s+(\w+)\s*=?[^;\n]*;'

# Buscar coincidencias en el código fuente
coincidencias = re.findall(patron_variables, codigo_fuente)

# Mostrar los nombres de las variables encontradas
for tipo, nombre in coincidencias:
    print(f"Tipo: {tipo}, Nombre: {nombre}")
