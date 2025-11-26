
public class SortArray {
    public static void sort(int arr[],int n){
        if(n==1){
            return;
        }
       int remove=arr[n-1];
        sort(arr,n-1);
        insert(arr,remove,n-1);

    }
    public static void insert(int arr[],int remove,int n){
        if(n==0||arr[n-1]<=remove){
            arr[n]=remove;
            return ;
        }
        int temp=arr[n-1];
        insert(arr,remove,n-1);
        arr[n]=temp;        
        
    }
public static void main(String[] args) {

    int arr[]={1,3,6,8,4,36,2};
    int n=arr.length;
    sort(arr,n);


    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        
    }
   
    
    
}    
}
