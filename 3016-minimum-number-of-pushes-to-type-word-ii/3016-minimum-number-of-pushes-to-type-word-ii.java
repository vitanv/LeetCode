class Solution {
    public int minimumPushes(String word) {
        int answer = 0;
        int[] freq = new int[26];
        for(char c: word.toCharArray()){
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int[] arr = new int[26];
        for(int i = 0; i < 26; i++){
            arr[i] = freq[25 - i];
        }
        for(int i = 0; i < 26; i++){
            if(arr[i] == 0) break;
            answer += (i/8 + 1) * arr[i];
        }
        return answer;
    }
}