package Tarea_1;

import java.util.Scanner;

public class EntoncesSiQuede {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++) {
            int num = scan.nextInt();
            arr[i]=num;
        }
        scan.close();

        int[] subarr = subarreglo(arr, m, s);
        System.out.println(subarr[0]);
    }

    public static int[] subarreglo(int arr[], int indice, int tamanio){
        int[] subarr = new int[tamanio];
        if(indice != arr.length){
            subarr[indice] = indice;
            subarreglo(subarr, indice+1, tamanio);
        }
        return subarr;
    }

    // public static void subarregloRecursivo(int arr[], int start, int longitud){
    //     /*N es el tamanio del arreglo
    //       M es el indice inicial desde donde se
    //       desea hacer el sub-arreglo
    //       S representa el tamanio del sub-arreglo
    //     */
    //     int subarr[];
    //     if(start != arr.length){
            
    //         System.out.println(arr[start]);
    //         subarregloRecursivo(arr, start+1, longitud);
    //     }

    // }
}
