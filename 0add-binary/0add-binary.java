class Solution {
    public String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0){
                sum+= a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum+= b.charAt(j) - '0';
                j--;
            }
            answer.append(sum % 2);
            carry = sum / 2;
        }
        if(carry == 1) answer.append(carry);
        return answer.reverse().toString();
    }
}