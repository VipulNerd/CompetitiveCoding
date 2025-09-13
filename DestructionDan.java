
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

public class DestructionDan {

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long sumEven = 0;
            ArrayList<Long> odds = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long a = fs.nextLong();
                if ((a & 1) == 0) {
                    sumEven += a;
                } else {
                    odds.add(a);
                }
            }
            if (odds.isEmpty()) {
                out.append(0).append('\n');
            } else {
                // sort odds descending
                Collections.sort(odds, Collections.reverseOrder());
                int m = (odds.size() + 1) / 2; // ceil(k/2)
                long sumOdds = 0;
                for (int i = 0; i < m; i++) {
                    sumOdds += odds.get(i);
                }
                out.append(sumEven + sumOdds).append('\n');
            }
        }
        System.out.print(out.toString());
    }

    static class FastScanner {

        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) {
            in = is;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) {
                    return -1;
                }
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) {
                    return Long.MIN_VALUE;
                }
            }
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}
