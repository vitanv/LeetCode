class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && Math.abs(s.charAt(i) - stack.peek()) == 32 ){
                
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
            
        }
        String answer = "";
        while(!stack.isEmpty()){
            answer = stack.pop() + answer;
        }
        return answer;
    }
}