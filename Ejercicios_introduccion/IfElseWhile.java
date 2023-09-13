package Ejercicios_introduccion;
import java.util.Scanner;

class IfElseWhile{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Numero de iteraciones:");
        int n = stdin.nextInt();
        int i = 1;
        stdin.close();
        if(n % 2 == 0){
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }

        System.out.println("Numero par");
        while(i < n){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

        System.out.println("Divisible por 3");
        for(i=1;i<n;i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}