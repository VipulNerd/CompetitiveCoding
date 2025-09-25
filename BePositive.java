
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BePositive {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        long t = Long.parseLong(br.readLine());

        while (t-- > 0) {
            long res = 0;
            long n = Long.parseLong(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cnt0 = 0, cntN = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) {
                    cnt0++;
                } else if (num == -1) {
                    cntN++;
                }
            }

            res = cnt0;
            if (cntN % 2 == 1) {
                res += 2;
            }

            ans.append(res).append("\n");
        }
        System.out.print(ans);
    }
}
