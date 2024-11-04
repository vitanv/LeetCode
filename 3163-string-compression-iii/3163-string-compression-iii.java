class Solution {
    public String compressedString(String word) {
        StringBuilder answer = new StringBuilder();
        int count = 0, last = 0;
        for(int i = 1; i < word.length(); i++){
            count++;
            if(word.charAt(i) != word.charAt(i - 1) || count == 9){
                answer.append(count);
                answer.append(word.charAt(i - 1));
                count = 0;
                last = i;
            }
        }
        answer.append(word.length() - last);
        answer.append(word.charAt(last));
        return answer.toString();
    }
}