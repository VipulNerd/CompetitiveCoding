
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UnconventionalPairs {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] parts = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(parts[i]);
            }

            Arrays.sort(a);

            int maxDiff = 0;
            for (int i = 0; i < n; i += 2) {
                maxDiff = Math.max(maxDiff, a[i + 1] - a[i]);
            }

            ans.append(maxDiff).append("\n");
        }

        System.out.print(ans);
    }
}
