class Node{
    int val;
    Node next;
    Node(int val ){
        this.val=val;
    }
}

public class shallowCopyOfNode {
    public static void main(String[] args) {
        // Node a=new Node(10);
        // Node temp=a;// shallow copy ->isme hum changes kr skte h like
        // temp.val=22;
        // System.out.println(temp);
        // System.out.println(a);
        // System.out.println();
        // System.out.println(temp.val);
        // System.out.println(a.val);


        // deep copy
        Node a=new Node(10);
        Node temp=new Node(10);
        // dono ka addres alag hoga aur change ek sath dono me nhi honge
        System.out.println(a);
        System.out.println(temp);
        a.val=20;
        System.out.println(a.val);
        System.out.println(temp.val);


        
        
    }
    
}
