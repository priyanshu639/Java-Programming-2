

public class dutchFlagAlgo {

    

    public static void main(String[] args) {

        
    //     int zeroes=0;
    //     int ones=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==0) zeroes++;
    //         else ones++;
    //     }
    //     System.out.println(zeroes);
    //     System.out.println(ones);
    //     for(int i=0;i<arr.length;i++){
    //         if(zeroes>i) arr[i]=0;
    //         else{
    //             arr[i]=1;
    //         }
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i]+" ");
            
    //     }
    int arr[]={1,1,1,1,0,2,2,2,2,0,0,1,1,0,2,};
    int low=0;
    int end=arr.length-1;
    int mid=0;
    
    while(mid<=end){
        
        if(arr[mid]==0) {
            
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            
        }
        else if(arr[mid]==1){
            mid++;
        }
        else{
           
            
                int tem=arr[mid];
                arr[mid]=arr[end];
                arr[end]=tem;
                
                end--;
        
        }
        
    }
    for(int i = 0;i < arr.length ;i++){
        System.out.print(arr[i]+" ");
    }
        

    }
    
}
