package Learning.Traversal.Recursive_approch;

class Node{
  int data;
  Node next;
  Node(int new_data){
    data = new_data;
    next = null;
  }
}

public class Main {
  static void traverseList(Node head){
    if(head==null){
      return;
    }
    System.out.print(head.data);
    if(head.next!=null){
      System.out.print("->");
    }
    traverseList(head.next); // recursive call 
  }
      public static void main(String[] args) {
      
        // create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        traverseList(head);
    }
}
