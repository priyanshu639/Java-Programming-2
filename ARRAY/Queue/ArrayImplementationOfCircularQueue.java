
public class ArrayImplementationOfCircularQueue {
    static class CircularQueue{
        int f=-1;
        int r=-1;
        int size=0;
        int arr[]=new int[5];
        int n=arr.length;
        void add(int val) throws Exception{
            
            if(size==arr.length) {
                throw new Exception("queue is empty");
            }
            else if(size==0){
                f=0;
                r=0;
                arr[r]=val;
            }
            else if(r<n-1){
                arr[r+1]=val;
                r++;
            }
            else if(r==n-1){
                r=0;
                arr[r]=val;
            }
            size++;

        }

        int remove() throws Exception{
            if(size==0){
                throw new Exception("queue is empty");
            }
            else if(f==n-1){
                int v=arr[f];
                f=0;
                size--;
                return v;
            }
            else{
                int v=arr[f];
                f++;
                size--;
                return  v;
            }
        }

        void display(){
            if(f<=r){
                for (int i = f; i <=r; i++) {
                    System.out.print(arr[i]+" ");
                    
                }
            }
            if(r<f){
                for (int i = f; i <= n-1; i++) {
                    System.out.print(arr[i]+" ");
                    
                }
                for (int i = 0; i <=r; i++) {
                    System.out.print(arr[i]+" ");
                    
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {
        CircularQueue cq=new CircularQueue();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.display();
        System.out.println();
        cq.remove();
        System.out.println();
        cq.display();
        


        
        
    }
    
}
