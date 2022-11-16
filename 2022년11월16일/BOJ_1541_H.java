import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class BOJ_1541_H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("-");
        int total = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
                String[] tmp = arr[i].split("\\+");
                for (int j = 0; j < tmp.length; j++) {
                    sum += Integer.parseInt(tmp[j]);
                }
                if (total == Integer.MAX_VALUE){
                    total = sum;
            }
                else total -= sum;
        }
        System.out.println(total);
    }
}
