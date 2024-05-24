class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int n = words.length, answer = 0;
        int[] freq = new int[26];
        int[] subset = new int[26];
        for(char letter : letters){
            freq[letter - 'a']++;
        }
        for(int mask = 0; mask < 1 << n; mask++){
            Arrays.fill(subset, 0);
            for(int i = 0; i < n; i++){
                if((mask & (1 << i)) > 0){
                    for(int j = 0; j < words[i].length(); j++){
                        subset[words[i].charAt(j) - 'a']++;
                    }
                }
            }
            answer = Math.max(answer, subScore(subset, freq, score));
        }
        return answer;
    }
    public int subScore(int[] subset, int[] freq, int[] score){
        int total = 0;
        for(int i = 0; i < 26; i++){
            if(subset[i] > freq[i]) return 0;
            total += subset[i] * score[i];
        }
        return total;
    }  
}