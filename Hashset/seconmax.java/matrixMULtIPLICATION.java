public class matrixMULtIPLICATION {

    public static void main(String[] args) {
          int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int c[][] =new int [A.length][B[0].length];
        for(int i=0;i<c.length;i++){
            for (int j = 0; j < c[0].length; j++) {

                for (int j2 = 0; j2 < A[0].length; j2++) {
                    c[i][j]+=A[i][j2]*B[j2][j];
                    
                }
                System.out.print(c[i][j]+" ");
                
            }
            System.out.println();
        }

    }
    
}
