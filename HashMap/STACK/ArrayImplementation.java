public class ArrayImplementation {
    public static class Stack{
        int arr[]=new int[5];
        int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("stack is full");
                return ;
            }
            arr[idx]=x;
            idx++;

        }
        int peek(){
            if(idx==0){
                System.out.println("Empty Stack");
                return -1;
            }
            return arr[idx-1];

        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;

        }
        int size(){
            return idx;

        }
        int capacity(){
            return arr.length;

        }
        boolean isFull(){
            if(idx==arr.length) {
                return true;
            }
           return false;
            


        }
        boolean isEmpty(){
            if(idx==0) {
                return true;
            }
           return false;
            

        }
        void display(){
            for (int i = 0; i <=idx-1; i++) {
                System.out.print(arr[i]+"-->");
                
            }

        }

    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.push(9);
        System.out.println(st.isFull());
        
    }
    
}
