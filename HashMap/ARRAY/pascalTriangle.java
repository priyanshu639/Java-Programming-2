public class pascalTriangle {
    public static void main(String[] args) {
        int n = 5; // number of rows

        int[][] pascal = new int[n][n];

        for (int i = 0; i < n; i++) {
            
            // first and last position = 1
            pascal[i][0] = 1;
            pascal[i][i] = 1;

            // fill middle values
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        // print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
