class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int[] answer = new int[2];
        while(left != right){
            if(numbers[left] + numbers[right] == target) {
                answer[0] = left+1;
                answer[1] = right+1;
                return answer;
            }
            if(numbers[left] + numbers[right] > target) right--;
            if(numbers[left] + numbers[right] < target) left++;
        }
        return answer;
    }
}