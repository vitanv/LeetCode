class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int answer = 0, n = cost.length;
        for (int i = n - 1; i >= 0; --i) {
            if ((n - 1 - i) % 3 != 2) {
                answer += cost[i];
            }
        }
        return answer;
    }
}