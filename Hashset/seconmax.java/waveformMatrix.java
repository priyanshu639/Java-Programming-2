public class waveformMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n=matrix.length;
        int m=matrix[0].length;

        for (int i = 0; i < n; i++) {
            if(i%2==0){
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j]+" ");
                
            }
            // System.out.println();
                
            }
            else{
                for(int k=m-1;k>=0;k--){
                    System.out.print(matrix[i][k]+" ");
                }
                // System.out.println();
            }
            
        }
        

    }
    
}
