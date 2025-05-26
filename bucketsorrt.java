
import java.util.ArrayList;
import java.util.Collections;

public class bucketsorrt {
    public static void bucketsort(float[] arr){
        int n= arr.length;
        // create bucket
        ArrayList<Float>[] bucket =new ArrayList[n];
        // create empty buckets
        for(int i=0;i<n;i++){
            bucket[i]=new ArrayList<Float>();
        }

        // add elements into bucket
        for(int i=0;i<n;i++){
            int bucketIndex=(int)arr[i]*n;
            bucket[bucketIndex].add(arr[i]);
        }
        // sort each bucket indvidualy
        for(int i=0;i<bucket.length;i++)
        {   
            Collections.sort(bucket[i]);

        }
        // merge all buckets to get final sorted array
        int index=0;
        for(int i=0;i<bucket.length;i++){
            ArrayList<Float> curbucket=bucket[i];
            for(int j=0;j<curbucket.size();j++){
                arr[index++]=curbucket.get(j);

            }
        }





    }
    public static void main(String[] args) {
        float[] arr ={0.42f,0.32f,0.25f,0.52f,0.23f,0.47f,0.51f};
        bucketsort(arr);
        for(float val:arr){
            System.out.println( val + " ");
        }

    }
    
}
