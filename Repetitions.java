package CompetitiveCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int cnt = 1;
        int maxi = 1;
        for (int i = 0; i < st.length() - 1; i++) {
            char c = st.charAt(i);
            char cn = st.charAt(i + 1);
            if (c == cn) {

                cnt++;
                maxi = Math.max(cnt, maxi);

            } else {
                cnt = 1;
            }

        }
        System.out.println(maxi);
    }
}
