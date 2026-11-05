class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int answer = 0;
        for(int num1: arr1){
            boolean check = true;
            for(int num2 : arr2){
               check &= Math.abs(num1 - num2) >d;
            }
            if(check) answer++;
        }
        return answer;
    }
}