package Queue;

public class QueueUsingLinkedList {

    // Node class for linked list implementation
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class implementing queue operations using linked list
    static class Queue {
        static Node head = null;
        static Node tail = null;

        // Check if the queue is empty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add an element to the queue
        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) { // Empty queue
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Remove an element from the queue
        public static int remove() {
            if (isEmpty()) {
                System.err.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            head = head.next;

            if (head == null) { // If the queue becomes empty after removal
                tail = null;
            }
            return front;
        }

        // Peek the front element of the queue
        public static int peek() {
            if (isEmpty()) {
                System.err.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Removed element: " + q.remove());

        while (!q.isEmpty()) {
            System.out.println("Front element: " + q.peek());
            q.remove();
        }
    }
}
