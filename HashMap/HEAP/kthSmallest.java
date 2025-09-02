// package HashMap.HEAP;
// using min heap 

import java.util.PriorityQueue;

public class kthSmallest {
    public static void main(String[] args) {
        int arr[]={10,2,3,5,19,44,45};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
        }
        for(int i=1;i<=k-1;i++){
            pq.remove();
        }
        System.out.println(pq.peek());
    }
    
}
