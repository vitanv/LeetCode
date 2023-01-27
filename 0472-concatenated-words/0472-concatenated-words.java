class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> dict = new HashSet<>(Arrays.asList(words));
        List<String> answer = new ArrayList<>();
        for(String word: words){
            boolean[] dp = new boolean[word.length() + 1];
            dp[0] = true;
            for(int i = 1; i <= word.length();i++){
                for(int j = (i == word.length() ? 1: 0); !dp[i] && j < i; j++){
                    dp[i] = dp[j] && dict.contains(word.substring(j, i));
                }
            }
            if(dp[word.length()]) answer.add(word);
        }
        return answer;
    }
}