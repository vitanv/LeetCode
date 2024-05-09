class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int count = 0, idx = happiness.length - 1;
        long answer = 0;
        Arrays.sort(happiness);
        while(k > 0){
            answer += (happiness[idx] - count > 0)? happiness[idx] - count : 0;
            count++;
            idx--;
            k--;
        }
        return answer;
    }
}