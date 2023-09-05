/*EJERCICIO. Sumar los números naturales hasta N
(Se los damos nostros) de forma recursiva.*/

public class SumaRecursiva {
    public static void main(String[] args) {
        int n=10;
        //guardamos el resultado en una variable
        int resultado=sumaRecursiva(n);
        //mostramos el resultado
        System.out.println(resultado);
    }

    public static int sumaRecursiva(int numero){
        int res;
        
        if(numero==1){
            return 1;
        }else{
            res=numero+sumaRecursiva(numero-1);
        }
        return res;
    }
}
