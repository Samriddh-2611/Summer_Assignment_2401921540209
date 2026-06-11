class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String curr = "";
        int num = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                numStack.push(num);
                strStack.push(curr);
                num = 0;
                curr = "";
            }
            else if (ch == ']') {
                int times = numStack.pop();
                String prev = strStack.pop();
                for (int i = 0; i < times; i++) {
                    prev += curr;
                }
                curr = prev;
            }
            else {
                curr += ch;
            }
        }
        return curr;
    }
}
