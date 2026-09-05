package Learning.Insertion.at_the_end;

class Node{
  int data;
  Node next;

  Node(int x){
    data =  x;
    next = null;
  }
}

public class Main {
  static Node insertAtEnd(Node head,int x){
    Node newNode = new Node(x);
    if(head==null){
      return newNode;
    }

    Node last = head;

    while(last.next!=null){
      last=last.next;
    }

    last.next=newNode;
    return head;

  }

  static void printList(Node head){
    if(head==null){
      System.out.println();
      return;
    }
    System.out.print(head.data);

    if(head.next!=null){
      System.out.print("->");
    }
    printList(head.next);
  }

   public static void main(String[] args) {
      
        // Create a linked list:
        // 1 -> 2 -> 3 -> 4 -> 5 
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = insertAtEnd(head, 6);

        printList(head);
    }
}
 