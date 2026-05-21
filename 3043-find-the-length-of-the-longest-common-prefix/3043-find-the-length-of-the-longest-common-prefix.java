class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr1){
            while(!set.contains((num)) && num > 0){
                set.add(num);
                num /= 10;
            }
        }
        for(int num: arr2){
            while(!set.contains((num)) && num > 0){
                num /= 10;
            }
            if(num > 0){
                answer = Math.max(answer, (int)Math.log10(num) + 1);
            }
        }
        return  answer;
    }
}