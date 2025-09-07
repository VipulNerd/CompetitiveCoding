
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeForcesQ3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        long arr[] = new long[t];
        int idx = 0;

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long maxi = -1;
            if ((b & 1) == 1) {
                if ((a & 1) == 1) {
                    maxi = a * b + 1;
                } else {
                    maxi = -1;
                }
            } else {
                long bb = b;
                int vb = 0;
                while ((bb & 1) == 0) {
                    vb++;
                    bb >>= 1;
                }

                // if vb == 1 and a is odd, impossible
                if (vb == 1 && (a & 1) == 1) {
                    maxi = -1;
                } else {
                    long k = b / 2;
                    maxi = a * k + 2;
                }
            }

            arr[idx++] = maxi;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
