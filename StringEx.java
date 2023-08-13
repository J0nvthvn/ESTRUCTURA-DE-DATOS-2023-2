import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        //Leer un string desde la consola
        System.out.print("Ingresa un string: ");
        String input = stdin.nextLine();


        //Leer un string desde la consola
        System.out.println("El string ingresado es: " + input);

        //Mostrar el string ingresado
        System.out.println("La longitud del string es: " + input.length());

        //Convertir el string a mayúsculas y mostrarlo
        System.out.println("El string en mayúsculas es: " + input.toUpperCase());

        //Convertir el string en minúsculas y mostrarlo
        System.out.println("El string en minúsculas es: " + input.toLowerCase());

        //Buscar la posición de un carácter en el string
        System.out.print("Ingresa un carácter a buscar: ");
        char searchChar = stdin.next().charAt(0);
        int searchIndex = input.indexOf(searchChar);
        if(searchIndex == -1){
            System.out.println("El carácter " + searchChar + " no se encontró en el string.");
        } else {
            System.out.println("El carácter " + searchChar + "se encontró en la posición " + searchIndex + " del string.");
        }

        //Reemplazar un carácter en el string
        System.out.print("Ingresa un carácter a reemplazar: ");
        char replaceChar = stdin.next().charAt(0);
        System.out.print("Ingresa un carácter de reemplazo: ");
        char replacement = stdin.next().charAt(0);
        String replaced = input.replace(replaceChar, replacement);
        System.out.println(
            "El string con el carácter " + replaceChar + " reemplazado por " + replacement + " es " + replaced);
        
        //Dividir el string en subcadenas utilizando un delimitador
        System.out.print("Ingresa un delimitador para dividir el string: ");
        String delimiter = stdin.next();
        String[] parts = input.split(delimiter);
        System.out.print("El string dividido utilizando el delimitador '" + delimiter + "' es: ");
        for(int i=0;i<parts.length;i++){
            System.out.print(parts[i]);
            if(i < parts.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        //Concatenar strings utilizando la función concat()
        System.out.print("Ingresa un string para concatenar  con el string original: ");
        String append = stdin.next();
        String concatenated1 = input.concat(append);
        System.out.println("El string concatenado utilizando la función concat() es: " + concatenated1) ;

        //Concatenar strings utilizando la iperación de +
        System.out.print("Ingresa otro string para concatenar con el string original: ");
        String append2 = stdin.next();
        String concatenated2 = input + append2;
        System.out.println("El string concatenado utilizando la operación de + es: " + concatenated2);

        stdin.close();
    }
}
