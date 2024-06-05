class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];
        int[] currFreq = new int[26];
        List<String> answer = new ArrayList<>();
        for(char w : words[0].toCharArray()){
            freq[w - 'a']++;
        }
        for(int i = 1; i < words.length; i++){
            Arrays.fill(currFreq, 0);
            for(char w: words[i].toCharArray()){
                currFreq[w - 'a']++;
            }
            for(int j = 0; j < 26; j++){
                freq[j] = Math.min(freq[j], currFreq[j]);
            }
        }
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < freq[i]; j++){
                answer.add(String.valueOf((char)(i + 'a')));
            }
        }
        return answer;
    }
}