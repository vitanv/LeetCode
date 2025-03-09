class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] answer = new int[nums.length];
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for(int num: nums){
            if(num < pivot) less.add(num);
            if(num == pivot) equal.add(num);
            if(num > pivot) greater.add(num);
        }
        less.addAll(equal);
        less.addAll(greater);
        int index = 0;
        for(int num: less){
            answer[index] = num;
            index++; 
        }
        return answer;
    }
}