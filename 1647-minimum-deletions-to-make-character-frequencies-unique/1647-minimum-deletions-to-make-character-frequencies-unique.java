class Solution {
    public int minDeletions(String s) {
        int answer = 0;
        int[] freq = new int[26];
        for(char c: s .toCharArray()) freq[c - 'a']++;
        Arrays.sort(freq);
        int temp = freq[25];
        for(int i = 25;i>=0;i--){
            if(freq[i] == 0) break;
            if(freq[i] > temp){
                answer += freq[i] - temp;
            }else{
                temp = freq[i];
            }
            if(temp > 0) temp--;
        }
        

        return answer;
    }
}