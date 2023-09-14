package Pila;
import java.util.Scanner;

public class Pila {

    Scanner teclado = new Scanner(System.in);
    Nodo primero;

    public Pila() {
        primero = null;
    }

    public void ingresarNodo() {
        Nodo nuevo = new Nodo();
        System.out.print("Ingrese el dato que contendrá el nuevo nodo: ");
        nuevo.dato = teclado.nextInt();

        nuevo.siguiente = primero;
        primero = nuevo;
        System.out.println("\nNodo ingresado correctamente.\n");
    }

    public void buscarNodo() {
        Nodo actual;
        actual = primero;
        boolean encontrado = false;

        System.out.print("Ingrese el nodo a buscar: ");
        int nodoBuscar = teclado.nextInt();
        if (primero != null) {
            while (actual != null && !encontrado) {
                if (actual.dato == nodoBuscar) {
                    System.out.println("\nNodo con el dato " + nodoBuscar + " encontrado.\n");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println("\nNodo no encontrado.\n");
            }
        } else {
            System.out.println("\nLa pila se encuentra vacia.\n");
        }
    }

    public void modificarNodo() {
        Nodo actual;
        actual = primero;
        boolean encontrado = false;

        System.out.print("Ingrese el nodo a modificar: ");
        int nodoBuscar = teclado.nextInt();
        if (primero != null) {
            while (actual != null && !encontrado) {
                if (actual.dato == nodoBuscar) {
                    System.out.println("\nNodo con el dato " + nodoBuscar + " encontrado.\n");
                    System.out.print("Ingrese el nuevo dato para este nodo: ");
                    actual.dato = teclado.nextInt();
                    System.out.println("\nNodo modificado\n");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println("\nNodo no encontrado.\n");
            }
        } else {
            System.out.println("\nLa pila se encuentra vacia.\n");
        }
    }

    public void eliminarNodo(){
        Nodo actual;
        actual = primero;
        Nodo anterior;
        anterior = null;
        boolean encontrado = false;

        System.out.print("Ingrese el nodo a eliminar: ");
        int nodoBuscar = teclado.nextInt();
        if (primero != null) {
            while (actual != null && !encontrado) {
                if (actual.dato == nodoBuscar) {

                    if(actual.equals(primero)){
                        primero = primero.siguiente;
                    } else {
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("\nNodo con el dato " + nodoBuscar + " eliminado.\n");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println("\nNodo no encontrado.\n");
            }
        } else {
            System.out.println("\nLa pila se encuentra vacia.\n");
        } 
    }

    public void desplegarPila() {
        Nodo actual;
        actual = primero;
        if (primero != null) {
            while (actual != null) {
                System.out.println(" " + actual.dato);
                actual = actual.siguiente;
            }
        } else {
            System.out.println("\nLa pila se encuentra vacia.\n");
        }
    }
}