public class firstmax_secMAx {
    public static void main(String[] args) {
        int arr[]={4,5,2,5,2,6,8,5,9};
        int fmax=-1;
        int smax=-1;

        for(int i=0;i<arr.length;i++){
           
            if(fmax<arr[i]){
                
                smax=fmax;
                fmax=arr[i];
            }
            else if(smax<arr[i]){
                smax=arr[i];


            }
        }
        System.out.println("first maximum is : " + fmax +"and second maximum is " + smax);
    }
    
}
