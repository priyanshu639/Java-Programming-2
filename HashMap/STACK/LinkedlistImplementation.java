
public class LinkedlistImplementation {
    public static class Node{ //user defined data type
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }

}
    public static class Stack{   //user defined data structure 
        Node head=null;
        int size=0;

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;

        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            size--;
            int x=head.data;
            head=head.next;
            return x;

        }
        int size(){
            return size;

        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data  + "->");
                temp=temp.next;
            }
            System.out.println();

        }
    }



    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(2);
        st.push(23);
        st.push(25);
        st.push(26);
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.display();
        
    }
    
}
