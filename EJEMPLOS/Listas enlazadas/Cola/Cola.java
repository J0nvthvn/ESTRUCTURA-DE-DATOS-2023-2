package Cola;
import java.util.Scanner;

public class Cola {

    Nodo primero;
    Nodo ultimo;
    Scanner teclado = new Scanner(System.in);

    public Cola() {
        primero = null;
        ultimo = null;
    }

    public void insertarNodo() {
        Nodo nuevo = new Nodo();
        System.out.print("Ingrese el dato que contendra el nodo: ");
        nuevo.dato = teclado.nextInt();
        if(primero == null){
            primero = nuevo;
            primero.siguiente = null;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
        System.out.println("\nNodo ingresado con exito.\n");
    }

    public void buscarNodo() {
        Nodo actual;
        actual = primero;
        boolean encontrado = false;
        System.out.print("Ingrese el dato del nodo a buscar: ");
        int nodoBuscar = teclado.nextInt();
        
        if (primero != null) {
            while (actual != null && !encontrado) {
                if (actual.dato == nodoBuscar) {
                    System.out.println("\nNodo con el dato " + actual.dato + " encontrado.\n");
                    encontrado = true;
                }
                System.out.print("[" + actual.dato + "]");
                actual = actual.siguiente;
                if(!encontrado) {
                    System.out.println("\nNodo no encontrado.\n");
                }
            }
        } else {
            System.out.println("\nLa cola se encuentra vacia\n");
        }
    }

    public void modificarNodo() {
                Nodo actual;
        actual = primero;
        boolean encontrado = false;
        System.out.print("Ingrese el dato del nodo a modificar: ");
        int nodoBuscar = teclado.nextInt();
        if (primero != null) {
            while (actual != null && !encontrado) {
                if (actual.dato == nodoBuscar) {
                    System.out.println("\nNodo con el dato " + actual.dato + " encontrado.\n");
                    System.out.println("Ingrese el nuevo dato para este nodo: ");
                    actual.dato = teclado.nextInt();
                    System.out.println("\nNodo modificado.\n");
                    encontrado = true;
                }
                actual = actual.siguiente;
                if(!encontrado) {
                    System.out.println("\nNodo no encontrado.\n");
                }
            }
        } else {
            System.out.println("\nLa cola se encuentra vacia\n");
        }
    }

    public void eliminarNodo() {
        Nodo actual;
        actual = primero;
        Nodo anterior;
        anterior = null;
        boolean encontrado = false;
        System.out.print("Ingrese el dato del nodo a eliminar: ");
        int nodoBuscar = teclado.nextInt();
        
        if (primero != null) {
            while (actual != null && !encontrado) {
                if (actual.dato == nodoBuscar) {
                    
                    if(actual.equals(primero)) {
                        primero = primero.siguiente;
                    } else if(actual.equals(ultimo)) {
                        anterior.siguiente = null;
                        ultimo = anterior;
                    } else {
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("\nNodo eliminado.\n");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if(!encontrado) {
                System.out.println("\nNodo no encontrado.\n");
            }
        } else {
            System.out.println("\nLa cola se encuentra vacia\n");
        }
    }

    public void desplegarCola() {
        Nodo actual;
        actual = primero;
        if(primero != null) {
            while (actual != null) {
                System.out.print("[" + actual.dato + "]");
                actual = actual.siguiente;
            }
        } else {
            System.out.println("\nLa cola se encuentra vacia\n");
        }
    }
}

