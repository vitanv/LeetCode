class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        StringBuilder answer = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() &&  c == stack.peek()){
                stack.pop();
            }else{
                stack.add(c);
            }
        }
        while(!stack.isEmpty()){
            answer.insert(0,stack.pop());
        }
        return String.valueOf(answer);
    }
}