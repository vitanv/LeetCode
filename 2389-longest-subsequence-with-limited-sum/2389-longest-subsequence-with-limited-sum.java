class Solution {
    
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        for(int i  = 0; i < queries.length; i++){
            int count = 0;
            int sum = 0;
            for(int num: nums){
                sum+= num;
                count++;
                if(sum == queries[i]){
                    break;
                };
                if(sum > queries[i]){
                    count--;
                    break;
                }
                
            }
            answer[i] = count;
        }
        return answer;
    }
    
}