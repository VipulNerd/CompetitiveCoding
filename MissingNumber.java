package CompetitiveCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MissingNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long xorAll = 0l;
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        long xorPred = 0l;
        for (int i = 0; i < n - 1; i++) {
            xorPred ^= Long.parseLong(st.nextToken());
        }

        System.out.println(xorAll ^ xorPred);
    }
}
