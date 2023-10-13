#Ayudantia 3

## Bubble Sort

Bubble Sort es uno de los algoritmos de ordenamiento más simples. Funciona comparando pares de elementos adyacentes y resalizando intercambios si es necesario. El proceso se repite hasta que el arreglo esté completamente ordenado. Bubble Sort no es la opción más eficiente para arreglos grandes, ya que su complejidad de tiempo es de 0(n^2) en el peor caso.

https://www.toptal.com/developers/sorting-algorithms/bubble-sort

## Selection Sort

Encuentra el elemento mínimo en el arreglo y lo coloca en la posición correcta. Luego, busca el siguiente elemento mínimo en el subarreglo restante y lo coloca en su posición, y así sucesivamente. Selection Sort también tiene una complejidad de O(n^2), es una opción útil cuando los intercambios son costosos, ya que minimiza el número de intercambios. La simplicidad de Selection Sort lo hace una buena opción para arreglos pequeños.

https://www.toptal.com/developers/sorting-algorithms/selection-sort

## Insertion Sort

Insertion Sort es otro algoritmo de ordenamiento simple, que encuentra el elemento mínimo en el arreglo y lo coloca en la posición correcta. Luego, busca el siguiente elemento mínimo en el subarreglo restante y lo coloca en su posición, y así sucesivamente. Aunque Selection Sort también tiene una complejidad de tiempo de O(n^2) en el peor caso, es una opción útil cuando los datos están parcialmente ordenados.

https://www.toptal.com/developers/sorting-algorithms/insertion-sort

## Ejercicio

El ejercicio consiste en ordenar un conjunto de nombres de mayor a menor altura de las personas asociadas a esos nombres. Se proporcionan dos arreglos, uno que contiene los nombres y otro que contiene las alturas correspondientes. Se debe retornar un arreglo con los nombres ordenados. Además se debe crear una clase persona que contenga estos 2 atributos, y ordenar en base al objeto persona implementando Bubble Sort, Insertion Sort y Selection Sort.
