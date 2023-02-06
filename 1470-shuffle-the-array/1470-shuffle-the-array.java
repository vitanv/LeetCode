class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2*n];
        int x = 0, y = n, index = 0;
        while(x < n){
            answer[index++] = nums[x];
            answer[index++] = nums[y];
            x++;
            y++;
        }
        return answer;
    }
}