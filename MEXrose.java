
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MEXrose {

    static class FastScanner {

        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();

            boolean[] present = new boolean[n + 2];

            for (int i = 0; i < n; i++) {
                int val = fs.nextInt();
                if (val <= n) {
                    present[val] = true;
                }
            }

            // Find current MEX
            int currentMEX = 0;
            while (currentMEX <= n && present[currentMEX]) {
                currentMEX++;
            }

            int operations = 0;

            if (currentMEX == k) {
                // Already satisfied
                operations = 0;
            } else if (currentMEX < k) {
                // Need to make MEX larger
                // Count missing elements in [0, k-1]
                for (int i = 0; i < k; i++) {
                    if (!present[i]) {
                        operations++;
                    }
                }
                // Also need to remove k if it exists
                if (present[k]) {
                    operations++;
                }
            } else { // currentMEX > k
                // Need to make MEX smaller
                // Just need to add k to the array
                if (!present[k]) {
                    operations = 1;
                } else {
                    // k is present but MEX > k, impossible scenario
                    operations = 0;
                }
            }

            out.println(operations);
        }

        out.flush();
        out.close();
    }
}
