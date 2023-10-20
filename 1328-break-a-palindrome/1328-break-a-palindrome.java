class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() <= 1) return "";
        char[] answer = palindrome.toCharArray();
        for(int i = 0; i< palindrome.length()/2 ;i++){
            if(answer[i] != 'a') {
                answer[i] = 'a';
                return String.valueOf(answer);
            }
        }
        answer[palindrome.length()-1] = 'b';
        return String.valueOf(answer);
    }
}