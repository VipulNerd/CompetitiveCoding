
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
            return;
        }
        for (int i = 2; i <= n; i += 2) {
            ans.append(i).append(" ");
        }
        for (int i = 1; i <= n; i += 2) {
            ans.append(i).append(" ");
        }

        System.out.println(ans);
    }
}
