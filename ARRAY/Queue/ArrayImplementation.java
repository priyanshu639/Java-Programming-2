
public class ArrayImplementation {
    public static class queue{
        int size=0;
        int arr[]=new int[10];
        private int front=-1;
        private int rear=-1;
        void add(int val){
            if(rear==arr.length-1){
                System.out.println("Queue is empty");
                return ;
            }
            if(front==-1){
                rear=front=0;
                arr[0]=val;
            }
            else{
                arr[rear+1]=val;
                rear++;
            }
            size++;
        }

        void display(){
            if(size==0) System.out.println("Queu is empty");
            else{
                for (int i = front; i <=rear; i++) {
                    System.out.print(arr[i]+"->");
 
                }
            }

        }
        int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            front++;
            size--;
            return arr[front-1];

        }
        int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }

            return (arr[front]);

        }

    }
    public static void main(String[] args) {
        queue q=new queue() ;
        q.add(5);
        q.add(4);
        q.display();
        System.out.println();
        System.out.println(q.peek());
        System.out.println();
        System.out.println(q.remove());
        System.out.println();
        q.add(3);
        q.add(2);
        q.display();
        System.out.println();
        System.out.println(q.size);
            
        
        
        
    }
    
}
