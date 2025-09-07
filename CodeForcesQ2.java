
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class CodeForcesQ2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cnt = 0;

            while (cnt < n) {
                if (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int p = Integer.parseInt(st.nextToken());
                int q = n + 1 - p;
                sb.append(q);
                cnt++;
                if (cnt < n) {
                    sb.append(' '); 
                }else {
                    sb.append('\n');
                }
            }
        }

        System.out.print(sb.toString());
    }
}
