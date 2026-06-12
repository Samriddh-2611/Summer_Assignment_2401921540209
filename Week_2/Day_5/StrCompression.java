class Solution {
    public int compress(char[] chars) {
        int x = 0;
        int i = 0;
        while (i < chars.length) {
            char a = chars[i];
            int c = 0;
            while (i < chars.length && chars[i] == a) {
                i++;
                c++;
            }
           chars[x++] = a;
            if (c > 1) {
                for (char b : String.valueOf(c).toCharArray()) {
                    chars[x++] = b;
                }
            }
        }
        return x;
    }
}
