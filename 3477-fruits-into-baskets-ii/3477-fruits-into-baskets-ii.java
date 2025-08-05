class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int answer = 0, n = baskets.length;
        for (int fruit : fruits) {
            int unset = 1;
            for (int i = 0; i < n; i++) {
                if (fruit <= baskets[i]) {
                    baskets[i] = 0;
                    unset = 0;
                    break;
                }
            }
            answer += unset;
        }
        return answer;
    }
}