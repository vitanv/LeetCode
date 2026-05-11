class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = nums.length - 1; i>= 0; i--){
            int n = nums[i];
            while (n > 0){
                list.add(n % 10);
                n /= 10;
            }
        }
        Collections.reverse(list);
        int[] answer = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}