class Solution {
    public char kthCharacter(int k) {
        StringBuilder answer = new StringBuilder("a");
        while(answer.length() < k){
            int size = answer.length();
            for(int i = 0; i < size; i++){
                answer.append((char)('a' + ((answer.charAt(i) - 'a') + 1) % 26));
            }
        }
        return answer.charAt(k - 1);
    }
}