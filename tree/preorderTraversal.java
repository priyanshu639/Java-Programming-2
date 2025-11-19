
import java.util.ArrayDeque;
import java.util.Queue;

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
        System.out.println();

        System.out.print(" levelorder : " ) ;
        levelorder(root);

        System.out.println();

        System.out.print(" Levelorder : " ) ;
        Levelorder(root);


        System.out.println();

        System.out.print(" NthLevelorder : " ) ;
        
        nthhLevel(root, 0);


        System.out.println();
        System.out.print(" Levelorder using dfs : " ) ;
        for(int x=0;x<=3;x++){  //ye jo 3 h wo number of total levels h tree ke
            
            LEVELORDER(root, 0,x);
        }
    }




    private static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void Inorder(Node root){
        if(root==null) return ;
        
        Inorder(root.left);
        System.out.print(root.val+ " ");
        Inorder(root.right);
    }
    private static void postorder(Node root){
        if(root==null) return ;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+ " ");
    }

    

    private static void levelorder(Node root){
        Queue<Node> l=new ArrayDeque<>();
        if(root!=null) l.add(root);
        
        while(l.size()>0){
            Node front =l.remove();
            System.out.print(front.val + " ");
            if(front.left!=null) l.add(front.left);

            if(front.right!=null) l.add(front.right);

            
        }
        
    }

    // level order from right to left;

    private static void Levelorder(Node root){
        Queue<Node> l=new ArrayDeque<>();
        if(root!=null) l.add(root);
        
        while(l.size()>0){
            Node front =l.remove();
            System.out.print(front.val + " ");
            if(front.right!=null) l.add(front.right);
            if(front.left!=null) l.add(front.left);

            

            
        }
        
    }


    private static void nthhLevel(Node root,int level){
        int m=2;
        if(root==null) return ;
        if(level==m)System.out.print(root.val+" ");
        nthhLevel(root.left,level+1);
        nthhLevel(root.right,level+1);
    }

    // level order traversal using dfs or preoder
    
    private static void LEVELORDER(Node root,int level,int lvl){//here level is for current level and lvl for destination level
        
        if(root==null) return ;
        if(level==lvl)System.out.print(root.val+" ");
        LEVELORDER(root.left,level+1,lvl);
        LEVELORDER(root.right,level+1,lvl);
    }
}

    
