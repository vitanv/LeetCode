class Solution {
    public int minOperations(String[] logs) {
        int answer = 0;
        for(String log: logs){
            if(log.equals("../")){
                answer = Math.max(0, answer - 1);
            }else if(!log.equals("./")){
                answer++;
            }
        }
        return answer;
    }
}