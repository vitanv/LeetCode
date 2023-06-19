class Solution {
    public int largestAltitude(int[] gain) {
        int answer = 0, current = answer;
        for(int i = 0; i < gain.length; i++){
            current += gain[i];
            answer = Math.max(current, answer);
        }
        return answer;
    }
}