// implementation of linked list 
class Node{
    int val;
    Node next;
    Node(int val ){
        this.val=val;
    }
}
class SLL{
    Node head;
    Node tail;
    int size;

    void insertAtend(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;

        }
        
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;

        }
    }
    void size(){
        System.out.println(size);
    }
    void insertAtbegin(int val){
        Node temp=new Node(val);
        
        if(head==null){
            head=temp;
            tail=temp;

        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }


}
public class insertAtEnd {

    public static void main(String[] args) {
        SLL list=new SLL();
        list.insertAtend(12);
        list.insertAtend(22);
        list.insertAtend(42);
        list.insertAtend(152);
        list.insertAtend(62);
        list.print();
        System.out.println();
        // System.out.println(list.size);
        list.size();

        list.insertAtbegin(3);
        list.print();
        System.out.println();
        list.size();


        
    }
    
}
