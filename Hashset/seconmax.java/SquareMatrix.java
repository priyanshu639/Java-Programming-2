public class SquareMatrix {
    public static void main(String[] args) {
        
        int matrix[][]={{1,2,9},{2,44,6},{7,9,4}};
        int n=matrix.length;
        // int m=matrix[0].length;
       
        for(int i=0;i<n;i++){
            for (int j = 0; j <i; j++) {
                
                    
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                    System.out.println();
                
                
                 
                
            }
        }
        for(int i=0;i<n;i++){
            for (int k = 0; k < n; k++) {
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
        }
        

    }
    
}
