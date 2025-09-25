

public class medianOfArray {
    public static void main(String[] args) {
        int arr1[]={12,4,5,6,7,8};
        int arr2[]={4,7,13,56,22};
        int n=arr1.length+arr2.length;
        int arr[] =new int[n];
        int median ;
        for(int i=0;i<n;i++){
            int p1=arr2[0];
            int p2=arr2[0];
            if(p1<p2){
                p1=arr[i];
                p1++;
                 
            }
            else if(p2>p1){
                p2=arr[i];
                p2++;
            }
            
            if(n%2==0){
                median=arr[n/2];
            }
            else{
                median=arr[n/2]/2+arr[n/2-1]/2;
            }
            
        }
        System.out.println(median);
        
    }
    
}
