package Lista_simple;
import java.util.Scanner;

public class Listas {
    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    Scanner teclado = new Scanner(System.in);

    public Listas() {
        primero = null;
        ultimo = null;
    }

    public void insertarNodo() {
        Nodo nuevo = new Nodo();
        System.out.print("Ingrese el dato para el nuevo Nodo: ");
        nuevo.dato = teclado.nextInt();
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = null;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
        System.out.println("Nodo ingresado exitosamente.");
    }

    public void desplegarLista() {
        Nodo actual = new Nodo();
        actual = primero;
        if (primero != null) {
            while (actual != null) {
                System.out.println(" " + actual.dato);
                actual = actual.siguiente;
            }
        } else {
            System.out.println("La lista se encuentra vacia.");
        }
    }

    public void buscarNodo() {
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;
        System.out.print("Ingrese el dato del nodo a buscar: ");
        int nodoBuscar = teclado.nextInt();
        if (primero != null) {
            while (actual != null && encontrado != true) {
                if (actual.dato == nodoBuscar) {
                    System.out.println("Nodo con el dato " + actual.dato + " encontrado");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println(" Nodo no encontrado.");
            }
        } else {
            System.out.println("La lista se encuentra vacia.");
        }
    }

    public void modificarNodo() {
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;
        System.out.print("Ingrese el dato del nodo a modificar: ");
        int nodoBuscar = teclado.nextInt();
        if (primero != null) {
            while (actual != null && encontrado != true) {
                if (actual.dato == nodoBuscar) {
                    System.out.println("Nodo con el dato " + actual.dato + " encontrado");
                    System.out.print("Ingrese un nuevo dato para este nodo: ");
                    actual.dato = teclado.nextInt();
                    System.out.println("Nodo modificado.");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println(" Nodo no encontrado.");
            }
        } else {
            System.out.println("La lista se encuentra vacia.");
        }
    }

    public void eliminarNodo() {
        Nodo actual = new Nodo();
        actual = primero;
        Nodo anterior = new Nodo();
        anterior = null;
        boolean encontrado = false;
        System.out.print("Ingrese el dato del nodo a eliminar: ");
        int nodoBuscar = teclado.nextInt();
        if (primero != null) {
            while (actual != null && encontrado != true) {
                if (actual.dato == nodoBuscar) {

                    if (actual == primero) {
                        primero = primero.siguiente;
                    } else if (actual == ultimo) {
                        anterior.siguiente = null;
                        ultimo = anterior;
                    } else {
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("Nodo eliminado.\n");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println(" Nodo no encontrado.");
            }
        } else {
            System.out.println("La lista se encuentra vacia.");
        }

    }
}