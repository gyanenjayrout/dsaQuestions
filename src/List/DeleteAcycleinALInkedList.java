package List;

public class DeleteAcycleinALInkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode detectCycleMeetingPoint(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow; // Meeting point in cycle
            }
        }

        return null;
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode meetNode = detectCycleMeetingPoint(head);
        if (meetNode == null) {
            return null; // No cycle
        }

        ListNode start = head;
        while (start != meetNode) {
            start = start.next;
            meetNode = meetNode.next;
        }

        return start; // Start of the cycle
    }

    public static void removeCycle(ListNode head) {
        ListNode detectNode = detectCycle(head);

        if (detectNode == null) {
            System.out.println("No cycle found");
            return; // Exit method if no cycle
        }

        ListNode ptr = detectNode;

        while (ptr.next != detectNode) {
            ptr = ptr.next;
        }

        ptr.next = null; // Break the cycle
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates a cycle

        ListNode node = detectCycle(head);

        if (node != null) {
            System.out.println("Cycle is present at node with value: " + node.val);
        } else {
            System.out.println("No cycle");
        }

        removeCycle(head);

        printList(head);
    }
}
