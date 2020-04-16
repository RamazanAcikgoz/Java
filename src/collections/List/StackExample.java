package collections.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Example 1 :

        Stack<String> newStac = new Stack<>();
        newStac.push("Ranczo");
        newStac.push("Hasanowski");
        newStac.push("Marzin");
        newStac.push("Ozgurro");
        newStac.push("Alex");

        Iterator<String> itr = newStac.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next() + ",");
        }

        // Example 2 :

        Stack<String> st = new Stack<>();
        st.push("1");
        st.push("2");
        st.push("3");
        st.push("4");
        st.push("5");
        st.push("6");

        System.out.println("Stack's Elements : " + st);
        Enumeration e = st.elements();
        while (e.hasMoreElements()){
            System.out.println("Stack's Element : " + e.nextElement());
        }

        System.out.println("Last element of Stack : " + st.peek());
        System.out.println("Last element of Stack : " + st.pop());
        System.out.println("Last Version of Stack : " + st);

    }
}
