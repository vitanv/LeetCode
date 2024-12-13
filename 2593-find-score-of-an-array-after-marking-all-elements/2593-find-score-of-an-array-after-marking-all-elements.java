class Solution {
    public long findScore(int[] nums) {
        long answer = 0;
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(new int[]{nums[i], i});
        }
        Collections.sort(list, (a,b) -> Integer.compare(a[0], b[0]));
        for(int i = 0; i < nums.length; i++){
            int n = list.get(i)[0];
            int idx = list.get(i)[1];
            if(nums[idx] != -1){
                answer += n;
                nums[idx] =-1;
                if(idx > 0){
                    nums[idx - 1] = -1;
                }
                if(idx < nums.length - 1){
                    nums[idx + 1] = -1;
                }
            }
        }
        return answer;
    }
}