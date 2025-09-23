import java.util.*;
class Pair implements Comparable<Pair>{
    int num;
    int diff;

    public Pair(int num,int diff)  {
        this.num=num;
        this.diff=diff;
    }
    public int compareTo(Pair p){
        if(diff!=num){
            return this.diff - p.diff;
        }
        else{
            return this.num - p.num;
        }
}

    
}
public class FindKclosestEle {
    PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<arr.length;i++){
        pq.add(arr[i]);
        if(pq.size()>k){
            pq.remove();
        }
    }
    while(pq.size>0){
        ans.add(pq.remove);
    }
    
}
