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
    void insertAtmiddle(int idx,int val){
        Node temp=new Node(val);
        if(idx==0){//insert at begin
            insertAtbegin(val);
            return;//return isliye kr rhe h taki niche wale condition chale hi na
        };
        if(idx==size){//insert at end
            insertAtend(val);
            return;
        };
        if(idx>size){//insertion is not possible
            System.out.println("insertion is not possible");
            return;
        };
    
            Node x=head;
            for(int i=1;i<idx;i++){
                x=x.next;     
            }
            // insertion
            temp.next=x.next;
            x.next=temp;

        
        size++;
    }

    void getElement(int idx){
        
        if(idx==0){
            System.out.println(head.val);
            return;//return isliye kr rhe h taki niche wale condition chale hi na
        };
        if(idx==size){
            System.out.println(tail.val);
            return;
        };
        if(idx>size){
            System.out.println(" not possible");
            return;
        };
    
            Node x=head;
            for(int i=1;i<idx;i++){
                x=x.next;     
            }
            System.out.println(x.next.val);

        
        size++;
    }

    void setElement(int idx,int val){
        
        if(idx==0){
            head.val=val;
            return;
        };
        if(idx==size){
            tail.val=val;
            return;
        };
        if(idx>size){
            System.out.println("not possible");
            return;
        };
            Node x=head;
            for(int i=1;i<idx;i++){
                x=x.next;     
            }
            x.next.val=val;
    }


    void deleteAtHead() throws Error{
        if(head==null) throw new Error("not possible");
        head=head.next;
        size--;
    }
    

    void deleteAtindex(int idx) throws Error{
        
        if(idx==0) deleteAtHead();
        if(idx<0 || idx >size) throw new Error("invalid index");
        Node x=head;
        for (int i = 1; i < idx; i++) {
            x=x.next;
            
        }
        if(x.next==tail) tail=x;
        x.next=x.next.next;
        
        size--;
    }



}
public class Insert {

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

        System.out.println();
        list.insertAtmiddle(2,543);
        list.print();
        System.out.println();
        list.size();

        list.insertAtmiddle(0,01);
        list.print();
        System.out.println();
        list.insertAtmiddle(7,07);
        list.print();
        System.out.println();
        list.insertAtmiddle(11,543);

        System.out.println();
        list.getElement(2);
        list.getElement(5);
        System.out.println();
        list.setElement(2, 45678);
        list.print();

        System.out.println();
        list.deleteAtHead();
        list.print();

        System.out.println();
        list.deleteAtindex(7);
        list.print();
        System.out.println();
        System.out.println(list.tail.val);

        


        
    }
    
}
