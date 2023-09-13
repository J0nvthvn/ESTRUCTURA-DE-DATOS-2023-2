package Lista_simple;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Listas l = new Listas();
        int opcionMenu = 0;

        do {
            System.out.println("\n|----------------------------|");
            System.out.println("|    *CONCEPTO DE LISTA*     |");
            System.out.println("|--------------|-------------|");
            System.out.println("| 1. Insertar  | 4. Eliminar |");
            System.out.println("| 2. Buscar    | 5.Desplegar |");
            System.out.println("| 3.Modificar  | 6. Salir    |");
            System.out.println("|--------------|-------------|");
            System.out.print("Elige una opcion: ");
            opcionMenu = teclado.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("\n\n INSERTA NODO EN LA LISTA \n");
                    l.insertarNodo();
                    break;
                case 2:
                    System.out.println("\n\n BUSCAR UN NODO EN LA LISTA \n");
                    l.buscarNodo();
                    break;
                case 3:
                    System.out.println("\n\n MODIFICAR UN NODO EN LA LISTA \n");
                    l.modificarNodo();
                    break;
                case 4:
                    System.out.println("\n\n ELIMINR UN NODO DE LA LISTA \n");
                    l.eliminarNodo();
                    break;
                case 5:
                    System.out.println("\n\n DESPLEGAR LISTA DE NODOS \n");
                    l.desplegarLista();
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
