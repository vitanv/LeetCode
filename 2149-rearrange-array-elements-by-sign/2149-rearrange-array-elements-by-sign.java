class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive = 0, negative = 0, n = nums.length;
        int[] arrP = new int[n/2];
        int[] arrN = new int[n/2];
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                arrP[positive] = nums[i];
                positive++;
            }else{
                arrN[negative] = nums[i];
                negative++;
            }
        }
        positive = 0;
        negative = 0;
        for(int i = 0; i < n - 1; i+= 2){
            answer[i] = arrP[positive];
            answer[i+1] = arrN[negative];
            positive++;
            negative++;
        }
        return answer;
    }
}



