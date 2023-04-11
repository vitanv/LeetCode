class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            stack.add(c);
            if(c == '*'){
                stack.pop();
                if(!stack.isEmpty()) stack.pop();
            }
        }
        String answer = "";
        while(!stack.isEmpty()){
            answer =  stack.pop() + answer;
        }
        return answer;
    }
}