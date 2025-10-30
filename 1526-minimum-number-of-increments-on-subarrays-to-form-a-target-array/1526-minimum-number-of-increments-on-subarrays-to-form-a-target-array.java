class Solution {
    public int minNumberOperations(int[] target) {
        int n=target.length, answer=target[0];
        for(int i = 1; i < n; i++)
            answer+=Math.max(target[i]-target[i-1], 0);
        return answer;
    }
}