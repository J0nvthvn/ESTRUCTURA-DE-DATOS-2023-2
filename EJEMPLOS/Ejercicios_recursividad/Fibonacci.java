package Ejercicios_recursividad;

public class Fibonacci {
    public static void main(String[] args) {
        //serie Fibonacci
        // 1 1 2 3 5 8 13 21 34 55

        //llamada inicial
        int posicion = 55;
        int resultado = mostrarFibonacci(posicion);
        System.out.println(resultado);
    }

    public static int mostrarFibonacci(int n){
        //CASO BASE, si es cero devuelve un cero
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return mostrarFibonacci(n-1) + mostrarFibonacci(n-2);
        }
    }
}
