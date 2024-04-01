class Solution {
    public int lengthOfLastWord(String s) {
        int answer = 0, index = s.length() - 1;
        while(index >= 0 && s.charAt(index) == ' '){
            index--;
        }
        while(index >= 0 && s.charAt(index) != ' '){
            answer++;
            index--;
        }
        return answer;
    }
}