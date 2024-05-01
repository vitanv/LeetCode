class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }
        if(index == -1) return word;
        answer.append(word.substring(0, index + 1));
        answer.reverse();
        answer.append(word.substring(index + 1));
        return answer.toString();
    }
}