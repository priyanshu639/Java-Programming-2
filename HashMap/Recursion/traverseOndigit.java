public class traverseOndigit {

    public static void print(int i,int arr[]){
        if(i==arr.length)return;
        print(i+1,arr);
        System.out.print(arr[i]+" ");
        

    }

    public static void main(String[] args) {
        int arr[]={1,2,34,5,66,6};
        print(0,arr);
    }
    
}
