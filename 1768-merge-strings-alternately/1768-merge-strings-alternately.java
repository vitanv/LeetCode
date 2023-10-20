class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(),word2.length());
        String answer = "";
        for (int i = 0; i< min;i++){
            answer = answer + word1.charAt(i) + word2.charAt(i);
        }
        if(word1.length() > min) answer = answer + word1.substring(min);
        if(word2.length() > min) answer = answer + word2.substring(min);
        return answer;
    }
}