class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                carry = 0;
                digits[i] += 1;
                break;
            }else{
                digits[i] = 0;
                carry = 1;
            }
        }
        if(carry == 0) return digits;
        int[] answer = new int[digits.length + 1];
        answer[0] = 1;
        for(int i = 1; i < answer.length; i++){
            answer[i] = digits[i - 1]; 
        }
        return answer;
    }
}