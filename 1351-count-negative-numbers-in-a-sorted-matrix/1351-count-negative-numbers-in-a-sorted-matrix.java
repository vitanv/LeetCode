class Solution {
    public int countNegatives(int[][] grid) {
        int answer = 0;
        for(int[] numbers : grid){
            int i = numbers.length - 1;
            while(i >= 0){
                if(numbers[i] >= 0) break;
                answer++;
                i--;
            }
        }
        return answer;
    }
}