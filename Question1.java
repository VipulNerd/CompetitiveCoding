
class Question1 {

    static final long MOD = 1_000_000_007L;

    public static long method(String s) {
        int n = s.length();
        long dp[][][] = new long[n + 1][n + 1][2];
        dp[0][0][0] = 1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            for (int j = 0; j <= n; j++) {
                for (int u = 0; u <= 1; u++) {
                    long val = dp[i][j][u] % MOD;
                    if (val == 0) {
                        continue;
                    }
                    dp[i + 1][j][u] = dp[i + 1][j][u] + val;
                    if (c == '(') {
                        if (j + 1 <= n) {
                            dp[i + 1][j + 1][1] = dp[i + 1][j + 1][1] + val;
                        }
                    } else {
                        if (j > 0) {
                            dp[i + 1][j - 1][1] = dp[i + 1][j - 1][1] + val;
                        }
                    }
                }
            }
        }
        return dp[n][0][1] % MOD;

    }

    public static void main(String[] args) {
        System.out.println(method("()()")); // Example test
        System.out.println(method("(()"));  // Example test
    }
}
