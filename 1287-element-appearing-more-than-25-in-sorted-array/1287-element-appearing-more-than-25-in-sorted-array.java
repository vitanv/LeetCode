class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1) return arr[0];
        int count = 1, max = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i - 1]){
                count++;
                max = Math.max(count, max);
            }else{
                count = 1;
            }
            if(max > arr.length / 4) return arr[i];
        }
        return 0;
    }
}