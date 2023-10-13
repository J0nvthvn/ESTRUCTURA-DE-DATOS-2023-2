package Ejercicios_recursividad;

public class BuscarElemento {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=3;
        int posición = buscarPosicion(arr,target,0);
        System.out.println(posición);
    }

    public static int buscarPosicion(int array[], int target, int indice){
        if(indice==array.length || array[indice]==target){
            if(indice==array.length){
                return -1;
            }else{
                return indice;
            }
        }else{
            return buscarPosicion(array, target, indice+1);
        }
    }
}
