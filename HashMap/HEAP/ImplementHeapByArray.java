class MinHeap{
    int arr[];
    int size;

    public MinHeap(int capacity) {
        arr=new int[capacity];
        size=0;
    }
    public void add(int num){
        if(size==arr.length) return ;
        arr[size]=num;
        size++;
        upheapify(size-1);

    }
    public void swap(int indx,int parent){
        int temp=arr[indx];
        arr[indx]=arr[parent];
        arr[parent]=temp;

    }
    public void upheapify(int indx){
        if(indx==0) return;
        int parent=(indx-1)/2;
        if(arr[indx]< arr[parent]){
            swap(indx,parent);
            upheapify(parent);
        }
        

    }
    public int peek(){
        // if(size==0){
        //     System.out.println("no element");
        // }
        
    
        return arr[0];
        
    }
    public int size(){
        return size;
    }
    public int remove(){
        int peek=arr[0];
        swap(0,size-1);
        size--;
        downHeapyfy(0);
        return peek;
    }
    public void  downHeapyfy(int i){

        if(i>=size-1) return ;
        int leftchild=2*i+1,rightchild=2*i+2;
        int minIndx=i;
        if(leftchild<size && arr[leftchild]<arr[minIndx]) minIndx=leftchild;
        if(rightchild<size && arr[rightchild]<arr[minIndx]) minIndx=rightchild;
        if(i==minIndx) return;
        swap(i, minIndx);
        downHeapyfy(minIndx);

    }

}
public class ImplementHeapByArray {
    public static void main(String[] args) {
        MinHeap pq=new MinHeap(10);
        System.out.println(pq.size());

        pq.add(2);
        pq.add(12);
        pq.add(22);
        pq.add(5);
       System.out.println(( pq.peek()));
       pq.add(3);
       pq.add(1);
       System.out.println(( pq.peek()));
       System.out.println(( pq.remove()));
       System.out.println(( pq.remove()));

        
    }
    
}
