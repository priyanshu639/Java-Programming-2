
public class secondmax {
    public static void main(String[] args) {
        int m1 = 0;
        int m2 = -1;
        int arr[] = {1,5,2,6,9,3};
        for(int i = 0;i<6;i++){
            if(arr[i]>m1){
                m1 = arr[i];
            }
            if(arr[i]>m2 && m2<m1){
                m2 = arr[i];
            }
        }
        System.out.print(m2);

    }
    
}
