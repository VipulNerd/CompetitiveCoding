
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinPiles {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());
        StringBuilder ans = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            if ((a + b) % 3 == 0 && Math.min(a, b) * 2 >= Math.max(a, b)) {
                ans.append("YES\n");
            } else {
                ans.append("NO\n");
            }

        }
        System.out.println(ans);
    }
}
