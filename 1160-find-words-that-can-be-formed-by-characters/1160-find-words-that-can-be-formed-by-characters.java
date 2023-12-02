class Solution {
    public int countCharacters(String[] words, String chars) {
        int answer = 0;
        int[] charFreq = new int[26];
        for(char c: chars.toCharArray()){
            charFreq[c - 'a'] +=1;
        }
        for(String word: words){
            if(compare(word, charFreq)) answer+= word.length();
        }
        return answer;
    }
    public boolean compare(String word, int[] charFreq){
        int[] wordFreq = new int[26];
        for(char c : word.toCharArray()){
            wordFreq[c - 'a'] += 1;
        }
        for(int i = 0; i < 26; i++){
            if(wordFreq[i] > 0 && wordFreq[i] > charFreq[i]) return false;
        }
        return true;
    }
}