
class Node{
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val=val;
    }
    
}
public class implementationOfDoubly {
    public static void print(Node a){
        Node temp=a;//head
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }

    }

    public static void printReverse(Node d){
        Node temp=d;//tail
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.prev;
        }
        
    }public static void printFromAnyNode(Node b){
        Node temp=b;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        // now temp is at head
        print(temp);
        
    }

    
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        a.next=b;  b.prev=a;
        b.next=c;  c.prev=b;
        c.next=d;  d.prev=c;

        print(a);
        System.out.println();
        printReverse(d);
        System.out.println();
        printFromAnyNode(b);
        

        
    }
}
