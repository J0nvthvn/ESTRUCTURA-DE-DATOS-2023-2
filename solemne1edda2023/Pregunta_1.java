package solemne_1_edda_2023;
import java.util.Stack;

public class ejercicio1 {
    public static void main(String[] args) {
        String s = "felicitaciones"; //"yyz","abccba","casas","felicitaciones"
        String newS = AlgoritmoMisterioso(s);
        System.out.println(newS);
    }

    static String AlgoritmoMisterioso (String s) {
        Stack <Character> st = new Stack <>() ;
        st.push (s.charAt(0));
        for(int i = 1; i < s. length () ; i ++) {
            if(!st.isEmpty() && st.peek() == s. charAt(i)) {
                st.pop();
                continue;
            }
            st.push(s.charAt (i));
        }
        
        String newS = "";
        while (!st.isEmpty()) {
            newS = st.pop() + newS;
        }
        return newS;
    }
}
