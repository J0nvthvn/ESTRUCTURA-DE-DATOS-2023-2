package Ejercicios_recursividad;

public class InvertirPalabra {
    public static void main(String[] args) {
        String string = "Jonathan 1234";
        System.out.println(invertir(string, string.length()-1));
    }

    public static String invertir(String string, int longitud){
        if(longitud==0){
            return string.charAt(longitud) + "";
        }else{
            return string.charAt(longitud) + invertir(string, longitud-1);
        }
    }
}
