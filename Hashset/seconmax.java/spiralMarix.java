public class spiralMarix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n=matrix.length;
        int m=matrix[0].length;
        while (true) { 
            // top
            int i=0;
            if(i==0){
                System.out.print(matrix[0][i]);
                
                i++;
                System.out.println();
            }
            else if(i==m){
                System.out.print(matrix[m][i]);
                i++;
                System.out.println();
            }
            else if(i==n){
                System.out.print(matrix[i][0]);
                i--;
            }
            else if(i==n){
                System.out.print(matrix[n][i]);
                i--;
            }
        }




    }
    
}
