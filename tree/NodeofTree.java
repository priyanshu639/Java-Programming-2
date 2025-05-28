class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }

}
public class NodeofTree {
    public static void main(String[] args) {
        Node root =new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d =new Node(4);
        Node e =new Node(5);
        Node f =new Node(6);
        
        // System.out.println(b.left);
        // System.out.println(b.right);
        // join tree

        root.left=b ; root.right=c;
        b.left=d;b.right=e;
        c.right=f;
        // System.out.println(b.right.val);
        // System.out.println(root.left.right.val);
        // System.out.println(c.right.val);

        display(root);



        

    }
    private static  void display (Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);


    }
    
}
