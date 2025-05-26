public class radixSort {
    static int findmax(int[] arr){
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return  max;
}
    static void countsort(int arr[] ,int place){
        int n=arr.length;
        int[] output= new int[n];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/place)%10]++;
        }

        // 3. make prefix sum array of count array
       
        for (int i = 1; i < count.length; i++) {
            count[i] +=count[i-1];

            }

        for(int i=n-1; i>=0;i--){
            int idx =count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;

        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
        
  
    }
    public static void main(String[] args) {
        int arr[]={43,453,626,894,0,3};
        int max=findmax(arr);
        for(int place =1;max/place>0;place*=10){
            countsort(arr, place);

        }
        for(int val:arr){
            System.out.println(val + " ");
        }
        System.out.println(" ");
        
    }
    
}
