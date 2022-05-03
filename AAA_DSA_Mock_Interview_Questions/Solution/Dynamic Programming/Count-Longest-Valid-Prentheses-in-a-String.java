class Solution {
    public int longestValidParentheses(String s) {
        int length = s.length();
        int [] dp = new int [length];
        int maximum = 0;
        for (int i=1; i<s.length() ; i++) {
            if (s.charAt(i) == '(')
                dp[i] = 0;
            else if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = i - 2 >= 0 ? dp[i - 2] + 2 : 2;
                }
                else if (i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + 2 + ((i - dp[i-1] - 2 >= 0) ? dp[i - dp[i - 1] - 2]: 0);
                }
                maximum = Math.max(dp[i], maximum);
            }
        }
        return maximum;
    }
}