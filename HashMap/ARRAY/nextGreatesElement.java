

public class nextGreatesElement {
    

    public static void main(String[] args) {
        int arr[]={12,8,41,37,2,49,16,28,21};
        int n=arr.length;
        int ans[]=new int[n];
        ans[ n-1]=-1;
        int max=arr[n-1];

        for (int i = n-2; i >=0; i--) {
            ans[i]=max;
            
            max=Math.max(max, arr[i]);
            
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }

        // for(int i=arr.length-2;i>=0;i--){
        //     int max=-1;
        //     if(arr[i]>max){
        //         ans[i]=arr[i];
        //         max=arr[i];
        //     }
        //     else{
        //         ans[i]=max;


        //     }
        // }
        // for(int ele:ans){
        //     System.out.print(ele+" ");
        // }
    
}
