
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SocialExperiment {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());
        StringBuilder ans = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            if (n == 2) {
                ans.append(2).append("\n");
            } else if (n == 3) {
                ans.append(3).append("\n");
            } else if ((n & 1) == 1) {
                ans.append(1).append("\n");
            } else {
                ans.append(0).append("\n");
            }

        }
        System.out.print(ans.toString());
    }
}
