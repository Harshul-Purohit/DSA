package Linked_List_Cycle;

// Linked List Cycle - Full VS Code Solution

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Main {

    // Function to detect cycle using Floyd's Algorithm
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move slow by 1
            fast = fast.next.next;     // move fast by 2

            if (slow == fast) {
                return true; // cycle detected
            }
        }

        return false; // no cycle
    }

    // Helper method to create a linked list with a cycle
    public static ListNode createListWithCycle() {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeMinus4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = nodeMinus4;
        nodeMinus4.next = node2; // cycle here

        return head;
    }

    // Helper method to create a linked list without a cycle
    public static ListNode createListWithoutCycle() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        head.next = node2;
        node2.next = node3;
        node3.next = null; // no cycle

        return head;
    }

    // Main method to test in VS Code
    public static void main(String[] args) {
        Main sol = new Main();

        // Test case 1: List with cycle
        ListNode cycleList = createListWithCycle();
        System.out.println("Cycle detected (expected true): " + sol.hasCycle(cycleList));

        // Test case 2: List without cycle
        ListNode noCycleList = createListWithoutCycle();
        System.out.println("Cycle detected (expected false): " + sol.hasCycle(noCycleList));
    }
}

