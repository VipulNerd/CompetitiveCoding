
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class CodeForcesQ1 {

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(b.readLine().trim());
        long[] arr = new long[t];
        int idx = 0;

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(b.readLine());
            int k = Integer.parseInt(st.nextToken());
            long num = Long.parseLong(st.nextToken());

            for (int i = 0; i < k; i++) {
                num *= 2;
            }
            arr[idx++] = num;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
