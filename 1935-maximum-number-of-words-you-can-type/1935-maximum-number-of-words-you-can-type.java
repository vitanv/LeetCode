class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0, answer = 0;
        int[] broken = new int[26];
        for(char c: brokenLetters.toCharArray()){
            broken[c - 'a'] = 1;
        }
        for(char c: text.toCharArray()){
            if(c == ' '){
                if(count == 0) answer++;
                count = 0;
            }else{
                if(broken[c - 'a'] > 0) count++;
            }
        }
        if(count == 0) answer++;
        return answer;
    }
}