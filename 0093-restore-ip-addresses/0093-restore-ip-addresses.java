class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> answer = new ArrayList<>();
        dfs(s, answer, 0, "", 0);
        return answer;
    }
    public void dfs(String s, List<String> answer, int index, String restored, int count){
        if(count > 4) return;
        
        if(count == 4 && index == s.length()) answer.add(restored);
        
        for(int i = 1; i < 4; i++){
            if(index + i > s.length()) break;
            String str = s.substring(index, index + i);
            if((str.startsWith("0") && str.length() > 1) || (i == 3 && Integer.parseInt(str) >= 256)) continue;
            dfs(s, answer, index+i, restored + str +(count == 3? "" : "."), count + 1);
        }
        
    }
}