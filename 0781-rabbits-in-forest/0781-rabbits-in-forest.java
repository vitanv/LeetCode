class Solution {
    public int numRabbits(int[] answers) {
        int[] freq = new int[1000];
        for(int a: answers) {
            freq[a]++;
        }
        int answer = 0;
        for(int i = 0; i < 1000; i++){
            answer += Math.floorMod(-freq[i], i + 1) + freq[i];
        }
        return answer;
    }
}