public class traverseArray {

    public static void print(int i,int arr[]){
        if(i==arr.length)return;
            System.out.println(arr[i]+" ");
        print(i+1,arr);

    }

    public static void main(String[] args) {
        int arr[]={1,2,34,5,66,6};
        print(0,arr);
    }
    
}
