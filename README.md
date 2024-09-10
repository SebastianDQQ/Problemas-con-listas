# Programa MezclasListas

## Descripción

Este programa en Java toma como entrada dos listas de números enteros ordenados en orden ascendente, los combina y produce una lista final también ordenada. Las dos listas se pasan como argumentos de la línea de comandos, separadas por comas.

## Funcionalidad

1. **Argumentos de entrada**: Se espera que el usuario proporcione dos listas de números ordenados en formato de cadena, separadas por comas, a través de la línea de comandos.
   
2. **Conversión de cadenas a listas**: El método `CadenaAlista` toma cada cadena de números, la divide por comas, y convierte cada elemento en un entero, devolviendo una lista de enteros.

3. **Combinación de las listas**: El método `merge` combina las dos listas de números enteros ordenados en una nueva lista también ordenada. Para ello, compara los elementos de ambas listas uno por uno y los añade a la lista final.

4. **Manejo de casos restantes**: Si una lista se termina antes que la otra, los elementos restantes de la lista no vacía se añaden directamente al final de la lista resultante.
