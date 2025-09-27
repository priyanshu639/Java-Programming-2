public class largestIn2dArray {
    public static void main(String[] args) {
        // write a program to print the largest element in this array

        int[][] arr={{1,2},{2,44},{7,9},{16,34},{5,23},{8,4}};
        int n=arr.length;
        int m=arr[0].length;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max=Math.max(max, arr[i][j]);
                
            }
            
        }
        System.out.println(max);


        // wap to find sum of all number in this 2d array

        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum+= arr[i][j];
                
            }
            
        }
        System.out.println(sum);

    }
    
}
