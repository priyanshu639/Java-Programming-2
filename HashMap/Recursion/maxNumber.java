
import java.util.*;
public class maxNumber {

    public static int helper(int arr[], int n, int max) {
        if (n < 0) {
            return max;
        }

        if(arr[n]>max){
            max=arr[n];
        }
        return helper(arr, n - 1, max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int next = sc.nextInt();
        int arr[] = new int[next];

        for (int i = 0; i < next; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        System.out.println(helper(arr, arr.length - 1, max));
    }
}

