class Solution {
    public int countSeniors(String[] details) {
        int answer = 0;
        for(String detail: details){
            String temp = detail.substring(11,13);
            if(Integer.parseInt(temp) > 60) answer++;
        }
        return answer;
    }
}