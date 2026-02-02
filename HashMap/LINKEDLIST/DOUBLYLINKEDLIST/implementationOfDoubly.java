
class Node{
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val=val;
    }
    
}

class DLL{
    Node head;
    Node tail;
    int size;
    void display(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-> ");
            temp=temp.next;
        }
        System.out.println();
    }

    void insertAtTail(int val){
        Node temp=new Node(val);
        if(size==0)head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }

    void insertAthead(int val){
        Node temp=new Node(val);
        if(size==0)head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }

    void insertAtAnyIndex(int idx,int val){
        if(idx==0) insertAthead(val);
        if(idx==size) insertAtTail(val);
        if(idx<0 || idx>size){
            System.out.println("eror in index");
        }
            Node temp=new Node(val);
            Node x=head;
            for(int i=0;i<idx-1;i++){
                x=x.next;
                
            } 
            Node y=x.next;
            x.next=temp;
            temp.prev=x;
            y.prev=temp;
            temp.next=y;
    }


    void deleteAtHead() throws Error{
        if(head==null) throw new Error("not possible");
        head=head.next;
        head.prev=null;
        size--;
    }

    void deleteAtTail() throws Error{
        if(size==0) throw new Error("not possible");
        tail=tail.prev;
        tail.next=null;
        size--;
    }

    void deleteAtAnyIndex(int idx){
        if(idx==0) deleteAtHead();
        if(idx==size)deleteAtTail();
        if(idx<0 || idx>size){
            System.out.println("error in index");
        }
            
            Node x=head;
            for(int i=0;i<idx-1;i++){
                x=x.next;
                
            } 
            x.next=x.next.next;
            x=x.next;
            x.prev=x.prev.prev;
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
        DLL dl=new DLL();
        dl.display();
        dl.insertAtTail(2323);
        dl.insertAtTail(2223);
        dl.insertAtTail(2523);
        dl.insertAtTail(2623);
        dl.display();
        dl.insertAthead(45);
        dl.display();
        dl.insertAtAnyIndex(2, 67);
        dl.display();
        dl.deleteAtAnyIndex(2);
        dl.display();
        

        
    }
}
