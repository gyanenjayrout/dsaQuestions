package Queue;

public class CircularQueueUsingArray {

    static class Queue {
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        public Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        // Check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Check if the queue is full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add an element to the queue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // If queue is initially empty
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove an element from the queue
        public static int remove() {
            if (isEmpty()) {
                System.err.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            
            // Check if only one element was left in the queue
            if (rear == front) {
                rear = front = -1; // Reset queue to empty state
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek the front element of the queue
        public static int peek() {
            if (isEmpty()) {
                System.err.println("Queue is empty");
                return -1;
            }

            return arr[front]; // Return the front element
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Removed element: " + q.remove());
        q.add(6); // This should work in a circular manner
        q.add(7); // This will show "Queue is full" as it's at capacity

        while (!q.isEmpty()) {
            System.out.println("Front element: " + q.peek());
            q.remove();
        }
    }
}
