import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11053_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int dp[] = new int[N];
        dp[0] = 1;
        for (int i = 1; i < N; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]){
                    if (dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            if (max == 0) dp[i] = 1;
            else dp[i] = max+1;
            max = 0;
        }
        Arrays.sort(dp);
        System.out.println(dp[N-1]);
    }
}