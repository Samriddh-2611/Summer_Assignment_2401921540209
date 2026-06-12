class Solution {
    public String longestPalindrome(String s) {
        String l = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int left = i;
                int right = j;
                boolean isPalindrome = true;
                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (isPalindrome && (j - i + 1) > l.length()) {
                    l = s.substring(i, j + 1);
                }
            }
        }
        return l;
    }
}
