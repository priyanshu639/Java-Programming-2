class Node{
    Node data;
    Node next;

    Node(int data ){
        this.data=data;
        this.next=null;
    }

}

public class implementSingly {
    Node head;
    public static void main(String[] args) {
        
    }
   public void insertatBegining(int data){
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void display(int data){
        Node current=head;
        while(current!=null){
            System.out.println(current.data +" -> ");
            current=current.next;
        }
        System.out.println("null");
        
    }
    
}
