class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder answer = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                answer.append(c);
            }
            if (c == '(') {
                stack.push(c);
            }
        }
        return answer.toString();
    }
}