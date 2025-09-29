public class transposeMatrix {
    // given a matrix find a tranpose matrix in resultant matrix

    public static void main(String[] args) {
        int[][] arr1={{1,2},{2,44},{7,9},{16,34},{5,23},{8,4}};
        int n=arr1.length;
        int m=arr1[0].length;
        int[][] res=new int[2][6];
        for (int j = 0; j <m; j++) { 
            for (int i = 0; i < n; i++) {
                res[j][i]=arr1[i][j];       
            }
            System.out.println();        
        }
        for(int[] ele:res){
            for(int x : ele){
                System.out.print(x + " ");
            }
        }




        

       
    }
    
}
