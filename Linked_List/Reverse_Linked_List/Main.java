package Reverse_Linked_List;

class ListNode{
  int val;
  ListNode next;
  ListNode(int val){
    this.val = val;
  }
}


public class Main {
  
  public ListNode reverseList(ListNode head){
    ListNode prev = null;
    ListNode curr = head;

    while(curr!=null){
      ListNode nextTemp = curr.next;
      curr.next = prev;
      prev=curr;
      curr = nextTemp;
    }
    return prev;
  }

  public void printList(ListNode head){
    ListNode curr = head;
    while(curr !=null){
      System.out.print(curr.val + "->");
      curr = curr.next;
    }
    System.out.print("null");
  }

  public static void main(String[] args) {
        Main solution = new Main();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        solution.printList(head);

        // Reverse the list
        ListNode reversed = solution.reverseList(head);

        System.out.println("Reversed List:");
        solution.printList(reversed);


}

}
