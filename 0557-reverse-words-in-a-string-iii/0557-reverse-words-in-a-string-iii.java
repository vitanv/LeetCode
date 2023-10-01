class Solution {
    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            temp.append(s.charAt(i));
            if(s.charAt(i) == ' '|| i == s.length() - 1){
                temp.reverse();
                if(i == s.length() - 1) answer.append(' ');
                answer.append(temp);
                temp.delete(0, temp.length());
            }
        }
        if(answer.charAt(0) == ' ') answer.deleteCharAt(0);
        return answer.toString();
    }
}