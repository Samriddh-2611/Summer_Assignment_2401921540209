class Solution {
    public String reverseWords(String s) {
        String[] w = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String w1 : w) {
            ans.append(new StringBuilder(w1).reverse()).append(" ");
        }
        return ans.toString().trim();
    }
}
