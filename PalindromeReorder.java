
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeReorder {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        int freq[] = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'A']++;
        }

        int oddCnt = 0;
        int oddIdx = -1;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCnt++;
                oddIdx = i;
            }
        }

        if (oddCnt > 1) {
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder middle = new StringBuilder();
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            int len = freq[i] / 2;
            for (int j = 0; j < len; j++) {
                left.append((char) ('A' + i));
            }
        }

        if (oddIdx != -1) {
            for (int i = 0; i < freq[oddIdx] % 2; i++) {
                middle.append((char) ('A' + oddIdx));
            }
        }
        right.append(left).reverse();
        String ans = left.toString() + middle.toString() + right.toString();
        System.out.println(ans);
    }
}
