class Solution {
    public int longestStrChain(String[] words) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        for(String word: words){
            int max = 0;
            for(int i = 0; i < word.length(); i++){
                String prev = word.substring(0, i) + word.substring(i + 1);
                max = Math.max(max, map.getOrDefault(prev, 0) + 1);
            }
            map.put(word, max);
            answer = Math.max(answer, max);
        }
        return answer;
    }
}