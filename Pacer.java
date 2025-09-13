
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pacer {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            long a[] = new long[n];
            int b[] = new int[n];

            for (int idx = 0; idx < n; idx++) {
                String line[] = br.readLine().trim().split(" ");
                a[idx] = Long.parseLong(line[0]);
                b[idx] = Integer.parseInt(line[1]);
            }

            long prevT = 0;
            long res = 0;
            int prevS = 0;

            for (int i = 0; i < n; i++) {
                long dist = a[i] - prevT;
                int neededParity = prevS ^ b[i];
                if (dist % 2 == neededParity) {
                    res += dist;
                } else {
                    res += Math.max(0, dist - 1);
                }
                prevT = a[i];
                prevS = b[i];
            }
            res += (m - prevT);

            ans.append(res).append("\n");
        }
        System.out.print(ans);
    }
}
