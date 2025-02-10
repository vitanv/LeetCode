class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                st.pop();
            }else{
                st.add(c);
            }
        }
        StringBuilder answer = new StringBuilder();
        while(!st.isEmpty()){
            answer.append(st.pop());
        }
        return answer.reverse().toString();
    }
}