import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1932_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        int[][] dp = new int[N][N];
        int count = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < count; j++) {
                arr[i][j] = sc.nextInt();
            }count++;
        }
        dp[0][0] = arr[0][0];
        int dpCount = 2;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < dpCount; j++) {
                if (j == 0){
                    dp[i][j] = dp[i-1][j] + arr[i][j];
                }
                else if (j == dpCount-1){
                    dp[i][j] = dp[i-1][j-1] + arr[i][j];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1]) + arr[i][j];
                }
            }dpCount++;
        }
        Arrays.sort(dp[N-1]);
        System.out.println(dp[N-1][N-1]);
    }
}

