class Solution {
    public int maximumGain(String s, int x, int y) {
        int answer = 0;
        String bigScore, smallScore;
        if(x > y){
            bigScore = "ab";
            smallScore = "ba";
        }else{
            bigScore = "ba";
            smallScore = "ab";
        }
        String firstRemaining = remove(s, bigScore);
        answer += ((s.length() - firstRemaining.length()) / 2) * Math.max(x,y);
        String secondRemaining = remove(firstRemaining, smallScore);
        answer += ((firstRemaining.length() - secondRemaining.length()) / 2) * Math.min(x,y);;
        return answer;
    }
    public String remove(String input, String target){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            if(!stack.isEmpty() && stack.peek() == target.charAt(0) && input.charAt(i) == target.charAt(1)){
                stack.pop();
            }else{
                stack.push(input.charAt(i));
            }
        }
        StringBuilder remaining = new StringBuilder();
        while(!stack.isEmpty()){
            remaining.append(stack.pop());
        }
        return remaining.reverse().toString();
    }
}