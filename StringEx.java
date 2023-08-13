import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        //Leer un string desde la consola
        System.out.print("Ingresa un string: ");
        String input = stdin.nextLine();
        stdin.close();
    }
}
