import java.util.Arrays;

public class ejercicio {
    
    //Clase para combinar nombre y altura
    static class Person {
        private String nombre;
        private int altura;
        public Person(String nombre, int altura) {
            this.nombre = nombre;
            this.altura = altura;
        }

        //Getters
        public String getNombre() {return nombre;}

        public int getAltura() {return altura;}
    }

    public static void main(String[] args) {
        // TEST
        // String[] names = { "Mary", "John", "Emma", "Jose" };
        // int[] heights = { 180, 165, 170, 169 };

        String[] names = { "Alice", "Bob", "Charlie", "David", "Eleanor", "Fiona",
                        "George", "Helen", "Isabel", "Jack", "Katherine", "Liam", "Megan",
                        "Nathan", "Olivia", "Peter", "Quinn", "Rachel", "Sarah", "Thomas",
                        "Ursula", "Victoria", "William", "Xander", "Yasmine", "Zachary" };
        int[] heights = { 185, 170, 175, 190, 165, 180, 160, 175, 168, 185, 162, 190,
                        163, 175, 168, 172, 178, 183, 167, 160, 185, 175, 170, 180, 165, 162, 185 };

        String[] SortResult = SortPersonFunction(names, heights);
        System.out.println("Nombres: " + Arrays.toString(SortResult));
    }

    public static String[] SortPersonFunction(String[] names, int[] heights) {
        int n = names.length;
        //Paso 1: Crear una matriz de objetos Person para combinar nombres y alturas.
        
        Person[] persona = new Person[n];
        for (int i = 0; i < n; i++) {
            persona[i] = new Person(names[i], heights[i]);
        }

        //Paso 2: Algoritmo de Ordenamiento

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (persona[j].getAltura() < persona[j + 1].getAltura() ) {
                    Person temp = persona[j];
                    persona[j] = persona[j + 1];
                    persona[j + 1] = temp;
                }
            }
        }

        //Paso 3: Extraer los nombres ordenados en ese orden

        String[] nombresOrdenados = new String[n];
        for (int i = 0; i < n; i++) {
            nombresOrdenados[i] = persona[i].getNombre();
        }
        
        return nombresOrdenados;
    }
}
