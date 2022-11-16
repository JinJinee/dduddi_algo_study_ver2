import java.io.*;
import java.util.StringTokenizer;

public class BOJ_16139_H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int[] arr = new int[S.length()];
            int count = 0;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == a.charAt(0)) count++;
                arr[j] = count;
            }

            int answer = getCount(arr,l,r);
            bw.append(String.valueOf(answer)).append("\n");
        }
        bw.flush();
    }
    public static int getCount(int[] arr, int l, int r){
        if (l == 0){
            return arr[r];
        }
        else {
            return arr[r] - arr[l-1];
        }
    }
}
