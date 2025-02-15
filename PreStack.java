import java.util.*;
import java.util.Stack;
public class PreStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Check whether it is empty: " + stack.empty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("stack: " + stack);
        System.out.println("Top element: "  + stack.peek());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Top element: "  + stack.peek());
        System.out.println("search: " + stack.search(40));    // distance from the top
    }
}
