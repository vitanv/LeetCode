class Solution {
    public int minChanges(String s) {
        int count = 0, answer = 0;
        char curr = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == curr){
                count++;
                continue;
            }
            if(count % 2 == 0) {
                count = 1;
            }else{
                count = 0;
                answer++;
            }
            curr = s.charAt(i);
        }
        return answer;
    }
}