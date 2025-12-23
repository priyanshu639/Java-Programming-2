import java.util.*;
// implementing tree using (bfs approach) Queue

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){

        this.val=val;
        left=right=null;
    }
}
public class implementationOfTree {
    static void bfs(Node root){
        if(root==null) return;

        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.val+" -> ");
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);

        }

    }

    public static void main(String[] args) {
        Node root=new Node(1);
        Node a1=new Node(2);
        Node a2=new Node(3);
        Node a3=new Node(4);
        Node a4=new Node(5);
        Node a5=new Node(6);
        Node a6=new Node(7);
       
        root.left=a1;root.right=a2;
        root.left.left=a3;root.left.right=a4;
        
        root.right.left=a5;root.right.right=a6;
        bfs(root);
        
        
    }
    
}
