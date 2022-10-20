class Solution {
    public String intToRoman(int num) {
        String[] st ={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int [] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i = 0;
        StringBuilder answer = new StringBuilder();
        while( num > 0){
            while(num >= arr[i]){
                num -= arr[i];
                answer.append(st[i]);
            }
            i++;
        }
        return answer.toString();
    }
}