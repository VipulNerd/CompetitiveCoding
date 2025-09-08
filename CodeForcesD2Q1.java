
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeForcesD2Q1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());
        StringBuilder ans = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            if (a == b) {
                ans.append(0).append("\n");
            } else if (a % b == 0 || b % a == 0) {
                ans.append(1).append("\n");
            } else {
                ans.append(2).append("\n");
            }

        }
        System.out.println(ans);
    }
}
