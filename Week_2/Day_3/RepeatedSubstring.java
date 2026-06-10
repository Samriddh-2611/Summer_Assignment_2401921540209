class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int l = 1; l <= n / 2; l++) {
            if (n % l == 0) {  
                String s1 = s.substring(0, l);
                boolean a = true;
                for (int i = l; i < n; i += l) {
                    if (!s.substring(i, i + l).equals(s1)) {
                     a = false;
                        break;
                    }
                }
                if (a) {
                    return true;
                }
            }
        }
        return false;
    }
}
