class Solution {
    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' ' && temp.length() != 0){
                
                answer.insert(0,temp);
                answer.insert(0,' ');
                temp.setLength(0);
                
            }
            if(s.charAt(i) != ' ') temp.append(s.charAt(i));
        }
        if(temp.length() > 0){
            answer.insert(0,temp);
        }
        if(answer.charAt(0) == ' ') answer.delete(0,1);
        return answer.toString();
    }
}