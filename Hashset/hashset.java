// package Hashset;
import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(50);
        for(int ele : set){
            System.out.println( ele +" ");
        }
        System.out.println();


        System.out.println(set.contains(10));
        set.remove(20);
        System.out.println(set);
        set.add(40);

        System.out.println(set.size());
        Object[] arr=set.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
}
