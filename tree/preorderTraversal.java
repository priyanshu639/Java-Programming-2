class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }

}
public class preorderTraversal {
    public static void main(String[] args) {
        Node root =new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d =new Node(4);
        Node e =new Node(5);
        Node f =new Node(6);
        Node g =new Node( 7);
        root.left=b; root.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        System.out.print(" Preorder : " ) ;
        preorder(root);
        System.out.println();
        System.out.print(" Inorder : " ) ;
        Inorder(root);
        System.out.println();

        System.out.print(" Postorder : " ) ;
        postorder(root);



    }
    private static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void Inorder(Node root){
        if(root==null) return ;
        System.out.print(root.val+ " ");
        Inorder(root.left);
        Inorder(root.right);
    }
    private static void postorder(Node root){
        if(root==null) return ;
        System.out.print(root.val+ " ");
        postorder(root.left);
        postorder(root.right);
    }
}

    
