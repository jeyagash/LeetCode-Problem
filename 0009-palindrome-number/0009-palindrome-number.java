public class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        if (x < 0) return false;

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

