class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder answer = new StringBuilder(words.length);
        for(String word: words){
            int weight = 0;
            for(int i = 0; i < word.length(); i++){
                weight += weights[word.charAt(i) - 'a'];
            }
            answer.append((char)('z' - (weight % 26)));
        }
        return answer.toString();
    }
}