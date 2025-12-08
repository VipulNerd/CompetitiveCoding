
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZero {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int cnt = 0;
        // check if div by 5 means have trailing zero
        while (n > 0) {
            n /= 5;
            cnt += n;
        }
        System.out.println(cnt);
    }
}
