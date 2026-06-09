 package LinkedList;

public class Deletecycleinalinkedlist {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Method to detect the meeting point in the cycle (if there is one)
    public ListNode detectCycleMeetingPoint(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list with two pointers moving at different speeds
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Slow pointer moves one step
            fast = fast.next.next;     // Fast pointer moves two steps

            // If they meet, there is a cycle
            if (slow == fast) {
                return slow;
            }
        }

        // If we reach here, there is no cycle
        return null;
    }

    // Method to detect the starting node of the cycle
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        // Find the meeting point in the cycle
        ListNode meet = detectCycleMeetingPoint(head);

        // If there is no cycle, return null
        if (meet == null) {
            return null;
        }

        // Move one pointer from the head and one from the meeting point
        ListNode start = head;
        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }

        // When they meet, it is the start of the cycle
        return start;
    }

    // Method to remove the cycle from the linked list
    public void removeCycle(ListNode head) {
        ListNode cycleStart = detectCycle(head);

        if (cycleStart == null) {
            // No cycle detected, nothing to remove
            return;
        }

        // Find the last node in the cycle
        ListNode ptr = cycleStart;
        while (ptr.next != cycleStart) {
            ptr = ptr.next;
        }

        // Break the cycle by setting the last node's next pointer to null
        ptr.next = null;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Example linked list with a cycle
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates a cycle

        Deletecycleinalinkedlist solution = new Deletecycleinalinkedlist();
        ListNode cycleStart = solution.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }

        solution.removeCycle(head);

        if (solution.detectCycle(head) == null) {
            System.out.println("Cycle successfully removed.");
        } else {
            System.out.println("Cycle not removed.");
        }
    }
}
