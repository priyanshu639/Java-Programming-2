public class sumOf2dArray {
    public static void main(String[] args) {
        int[][] arr1={{1,2},{2,44},{7,9},{16,34},{5,23},{8,4}};
        int[][] arr2={{1,2},{2,44},{7,9},{16,34},{5,23},{8,4}};
        int[][] res=new int[6][2];
        int n=arr1.length;
        int m=arr1[0].length;
        int p=arr2[0].length;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int[] ele:res){
            for(int x : ele){
                System.out.print(x+" ");

            }
        }
       

    }
    
}
