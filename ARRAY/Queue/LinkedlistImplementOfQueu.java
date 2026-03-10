
public class LinkedlistImplementOfQueu {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            
        }
    }
     static class linked_list{
        Node head=null;
        Node tail=null;
        int size=0;

        void add(int val){
            Node temp=new Node(val);
            if(size==0){
                head=temp;
                tail=temp;
   
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
            

        }

        public int peek(){
            if(size==0){
                System.out.println("queue empty");
                return -1;

            }
            return head.data;
        }

         public int remove(){
            if(size==0){
                System.out.println("queue empty");
                return -1;

            }
            head=head.next;
            size--;
            return  head.data;
        }




        void display(){
            if(size==0){
                System.out.println("queu is empty");
                return ;
            }
            Node x=head;
            while(x!=null){
                System.out.print(x.data+"->");
                x=x.next;
            }


        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        
     } 
    public static void main(String[] args) {
        linked_list l=new linked_list();
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(5);
        l.display();
        System.out.println();
        l.remove();
        System.out.println();
        l.display();
        System.out.println();
        System.out.println(l.peek());
        
    }
    
}
