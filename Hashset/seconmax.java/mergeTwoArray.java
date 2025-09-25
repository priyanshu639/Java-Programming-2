// merge two sorted array
public class mergeTwoArray {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9,11,13,15};
        int[] arr2={2,4,6,8,10};
        int n=arr1.length+arr2.length;
        int ans[]=new int[n];
        int i=0;
        int j=0;
        int k=0;

            while(i<arr1.length && j<arr2.length){
                    if(arr1[i]<arr2[j]){
                        ans[k]=arr1[i];
                        i++;
                        
                        
                    }
                    else{
                        ans[k]=arr2[j];
                        j++;
                    }
                    k++;
            
                }
                if(i==arr1.length){
                    // means arr1 waala array ktm hogaya and baki ke rest  another array wale ke value ko add kar do answer wale array me
                    while(j<arr2.length){
                        ans[k]=arr2[j];
                        j++;
                        k++;
                    }

                }
                if(j==arr2.length){
                    // means arr2 waala array ktm hogaya and baki ke rest  another array wale ke value ko add kar do answer wale array me
                    while(i<arr1.length){
                        ans[k]=arr1[i];
                        i++;
                        k++;
                    }

                }

        
        System.out.println();
        for(int l=0;l<n;l++){
            System.out.print(ans[l]+" ");
        }
    }
    
}
