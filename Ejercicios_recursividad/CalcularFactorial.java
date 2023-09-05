package Ejercicios_recursividad;

public class CalcularFactorial {
    public static void main(String[] args) {
       int n=5;
       int resultado=factorial(n);
       System.out.println(resultado); 
    }

    public static int factorial(int numero){
        int res;

        if(numero==1){
            return 1;
        }else{
            res=numero*factorial(numero-1);
        }
        return res;
    }
}
