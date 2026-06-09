package stack;

import java.util.Stack;

public class ReverseAStack {

    public static void addTobottom(int data, Stack<Integer> s) {
        // Base case: if the stack is empty, push the data at the bottom and return
        if (s.isEmpty()) {
            s.push(data);
            return; // Fix: added return statement to avoid further recursion
        }

        // Pop the top element, call addTobottom recursively, then push the element back
        int top = s.pop();
        addTobottom(data, s);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        // Base case: if the stack is empty, return
        if (s.isEmpty()) {
            return;
        }

        // Pop the top element, reverse the rest of the stack, and add the popped element at the bottom
        int top = s.pop();
        reverseStack(s);
        addTobottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
