public class subsetSum {

    public static  boolean  helper(int arr[],int target,int i){
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        boolean skip=helper(arr, target, i+1);
        boolean pick=helper(arr, target-arr[i], i+1);
        return pick || skip;
    }

    public static void main(String[] args) {
        int arr[]={8,3,2,4};
        int target=17;
        boolean k=helper(arr,target,0);
        System.out.println(k);

    }
    
}
