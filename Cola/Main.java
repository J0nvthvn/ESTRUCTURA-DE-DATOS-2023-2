package Cola;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cola c = new Cola();
        Scanner teclado = new Scanner(System.in);
        int opcionMenu = 0;
    
        do {
            System.out.println("\n|----------------------------|");
            System.out.println("|    *CONCEPTO DE COLA*      |");
            System.out.println("|--------------|-------------|");
            System.out.println("| 1. Insertar  | 4. Eliminar |");
            System.out.println("| 2. Buscar    | 5.Desplegar |");
            System.out.println("| 3.Modificar  | 6. Salir    |");
            System.out.println("|--------------|-------------|");
            System.out.print("Elige una opcion: ");
            opcionMenu = teclado.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            switch (opcionMenu) {
                case 1:
                    System.out.println("\n\n INSERTA NODO EN LA COLA \n");
                    c.insertarNodo();
                    break;
                case 2:
                    System.out.println("\n\n BUSCAR UN NODO EN LA COLA \n");
                    c.buscarNodo();
                    break;
                case 3:
                    System.out.println("\n\n MODIFICAR UN NODO EN LA COLA \n");
                    c.modificarNodo();
                    break;
                case 4:
                    System.out.println("\n\n ELIMINAR UN NODO DE LA COLA \n");
                    c.eliminarNodo();
                    break;
                case 5:
                    System.out.println("\n\n DESPLEGAR COLA DE NODOS \n");
                    c.desplegarCola();
                    break;
                case 6:
                    System.out.println("\n\n Programa finalizado. \n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\n Opcion no valida. \n");
                    break;
            }

        } while (opcionMenu != 6);
        teclado.close();   
    }
}
