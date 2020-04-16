package collections.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

//
// ArrayDequeExample class implements the DequeExample interface. It facilitates us to use the DequeExample.
// Unlike queue, we can add or delete the elements from both the ends.
//
//ArrayDequeExample is faster than ArrayList and Stack and has no capacity restrictions.
//
public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");

        for (String str : deque) {
            System.out.println(str);
        }
    }
}
