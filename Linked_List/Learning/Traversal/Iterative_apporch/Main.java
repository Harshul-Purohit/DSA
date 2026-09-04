package Learning.Traversal.Iterative_apporch;

// a linked list node
class Node {
    int data;
    Node next;
    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

public class Main {

    // function to traverse and print the singly linked list
    public static void traverseList(Node head){

        while(head!=null){
            System.out.print(head.data);
            if(head.next !=null){
                System.out.print("->");
            }
            head= head.next;
        }
        System.out.println();
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
