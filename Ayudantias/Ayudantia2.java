package Ayudantias;
import java.util.*;

public class Ayudantia2 {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};

        int result = countStudents(students, sandwiches);
        System.out.println("Numero de estudiantes sin almuerzo: " + result);
    }

    public static int countStudents(int[] st, int[] sand){
        Queue<Integer> sandwich = new LinkedList<>();
        Queue<Integer> student = new LinkedList<>();

        for (int i = 0; i < sand.length; i++) {
            sandwich.add(sand[i]);
        }

        for (int i = 0; i < st.length; i++) {
            student.add(st[i]);
        }

        int count = 0;
        while (!sandwich.isEmpty()) {
            if (count > st.length) {
                break;
            } 
            if (sandwich.peek().equals(student.peek())) {
                sandwich.remove();
                student.remove();
            } else {
                student.add(student.remove());
                count++;
            }
        }
        return student.size();
    }
}
