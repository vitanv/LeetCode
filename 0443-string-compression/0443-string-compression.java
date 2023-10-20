class Solution {
    public int compress(char[] chars) {
        int answer = 0,  index = 0;
        while(index < chars.length){
            int len = 1;
            while(index + len < chars.length && chars[index + len] == chars[index]) len++;
            chars[answer++] = chars[index];
            if(len > 1){
                for(char c : Integer.toString(len).toCharArray()){
                    chars[answer++] = c;
                }
            }
            index += len;
        }
        return answer;
    }
}