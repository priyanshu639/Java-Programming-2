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
        System.out.println();
        System.out.println(sum(root));
        System.out.println(product(root));

        System.out.println();
        System.out.println(Max(root));

        System.out.println(Minimum(root));
        System.out.println(Size(root));
        // lvel
        System.out.println(level(root));

        

    }
    private static  void display (Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
        
        


    }
    private static  int sum (Node root){
        if(root==null) return 0;
        int ans=root.val;
        return ans + sum(root.left) + sum(root.right);

    }
    private static  int product (Node root){
        if(root==null) return 1;
        int ans=root.val;
        return ans * product(root.left) * product(root.right);

    }
    
    private static  int Max (Node root){
        if(root==null) return Integer.MIN_VALUE;
        int ans=root.val;
        return Math.max(ans, Math.max(Max(root.left),Max(root.right)));

        
    }
    private static  int Minimum (Node root){
        if(root==null) return Integer.MAX_VALUE;
        int ans=root.val;
        return Math.min(ans, Math.min(Minimum(root.left),Minimum(root.right)));

        
    }

    private static  int Size (Node root){
        if(root==null) return 0;
        int ans=root.val;
        
        
        return  1 + Size(root.left) + Size(root.right);

        
    }
    private static  int level (Node root){
        if(root==null) return 1;
        int ans=root.val;
        int ans2 =level(root.left);
        int ans3 =level(root.right);
        if(ans2>ans3){
            int answer =level(root.left);
            return 1+answer;
        }
        else{
             int answer =level(root.right);
             return 1+answer;
        }

        

    }
    // private static  int level (Node root){
    //     if(root==null) return 0;
    //     return 1 + Math.max(level(root.left),level(root.right));

        

    // }
}
