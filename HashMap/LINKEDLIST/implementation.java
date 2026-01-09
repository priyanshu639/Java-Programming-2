class Node{
    int val;
    Node next;
    Node(int val ,String next){
        this.val=val;
        this.next=null;//by default hi wo null ho ta h to iski koi jarrat nhi h
    }
}

public class implementation {
    
    public static void printRecursively(Node head){
        Node temp=head;
        if(temp==null) {
            return;
        }
        System.out.println(temp.val);
        printRecursively(temp.next);
        
        
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    
    public static void main(String[] args) {
        Node c1=new Node(5, "kia");
        Node c2=new Node(4, "nia");
        Node c3=new Node(3, "jia");
        Node c4=new Node(2, "pia");
        // System.out.println(c1);//addres deta h ye 
        // System.out.println(c2.val);//value dega
        // System.out.println(c3);
        // System.out.println(c4);


        // System.out.println(c1.val);
        // System.out.println(c2.val);
        // System.out.println(c3.val);
        // System.out.println(c4.val);

        // abbb sabko link karna paedga 
        c1.next=c2;
        c2.next=c3;
        c3.next=c4;
        System.out.println(c1);
        System.out.println(c1.next);//ye c2 ka address h
        System.out.println(c2);
        System.out.println(c4);
        System.out.println();

        //aise bhi kar skte ho sirf ek node ke use karke
         System.out.println(c1);
        System.out.println(c1.next);//ye c2 ka address h
        System.out.println(c1.next.next);
        System.out.println(c1.next.next.next);

        System.out.println();

        // value print karna ek node ka use karke
        System.out.println(c1.val);
        System.out.println(c1.next.val);
        System.out.println(c1.next.next.val);
        System.out.println(c1.next.next.next.val);


        System.out.println("printing while loop");
        print(c1);
        System.out.println("printing recursively");
        printRecursively(c1);
        

    }
    
}
