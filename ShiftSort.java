
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShiftSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder ans = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            int cntZero = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    cntZero++;
                }
            }

            int misplacedOnes = 0;
            for (int i = 0; i < cntZero; i++) {
                if (s.charAt(i) == '1') {
                    misplacedOnes++;
                }
            }

            ans.append(misplacedOnes).append('\n');
        }

        System.out.print(ans);
    }
}
