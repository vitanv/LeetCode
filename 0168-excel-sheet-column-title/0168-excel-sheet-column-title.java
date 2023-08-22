class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder answer = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            answer.append((char)(columnNumber % 26 + 65));
            columnNumber /= 26;
        }
        return answer.reverse().toString();
    }
}