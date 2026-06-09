class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }
        int[]pc = new int[100];
        int[]wc = new int[100];
        for (char c : p.toCharArray()) {
            pc[c - 'a']++;
        }
        int k = p.length();
        for (int i = 0; i < s.length(); i++) {          
            wc[s.charAt(i) - 'a']++;
            if (i >= k) {
                wc[s.charAt(i - k) - 'a']--;
            }
            if (Arrays.equals(pc, wc)) {
                result.add(i - k + 1);
            }
        }
        return result;
    }
}
