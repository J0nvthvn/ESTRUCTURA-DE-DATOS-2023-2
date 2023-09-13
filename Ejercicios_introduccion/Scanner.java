package Ejercicios_introduccion;
import java.util.Scanner;  

class Io {
    public static void main(String args[]){
        // Crea un objeto Scanner
        Scanner stdin = new Scanner(System.in);  
        System.out.println("Ingresa dos ints:");

        int x = stdin.nextInt();
        int y = stdin.nextInt();
        stdin.close();
        
        System.out.println("el primer numero es: " + x);
        System.out.println("el segundo numero es: " +  y);

        System.out.println("La suma de los numeros es: " + (x+y));
    }
}