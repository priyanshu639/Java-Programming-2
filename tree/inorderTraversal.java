
public class inorderTraversal {

    static class Node{
        int data;
        Node left;
        Node right;
         
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class  Binarytree{
        static int indx =-1;
        public static  Node buildtree(int node[]){
            indx++;
            if(node[indx]==-1){
                return null;
            }
            Node newNode =new Node(node[indx]);
            newNode.left=buildtree(node);
            newNode.right=buildtree(node);
        
            return newNode;
        }

    }


 
    public static void main(String[] args) {
        int node[] ={1,2,-1,-1,3,-1,5,-1,-1,4,-1,-1};
        
        Node root =Binarytree.buildtree(node);
        System.out.println(root.data);
    }
}
