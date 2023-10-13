package Ejercicios_recursividad;

public class RecorrerArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        recorrer(array, 0);
    }

    public static void recorrer(int[] array, int indice){
        if(indice != array.length){
            System.out.print(array[indice]+" ");
            recorrer(array, indice+1);
        }
    }
}
