class Solution {

    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length, answer = Integer.MIN_VALUE;
        for (int i = n - k; i < n; i++) {
            int sum = 0;
            for (int j = i; j >= 0; j -= k) {
                sum += energy[j];
                answer = Math.max(answer, sum);
            }
        }
        return answer;
    }
}