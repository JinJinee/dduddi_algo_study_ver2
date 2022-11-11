import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1149_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[N][3];
        dp[0] = arr[0];
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0){
                    dp[i][j] = Math.min(dp[i-1][1],dp[i-1][2]) + arr[i][j];
                }
                else if (j == 1){
                    dp[i][j] = Math.min(dp[i-1][0],dp[i-1][2]) + arr[i][j];
                }
                else if (j == 2){
                    dp[i][j] = Math.min(dp[i-1][0],dp[i-1][1]) + arr[i][j];
                }
            }
        }
        Arrays.sort(dp[N-1]);
        System.out.println(dp[N-1][0]);
    }
}
