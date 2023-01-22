class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> answer = new ArrayList<>();
        ArrayList<String> current = new ArrayList<>();
        dfs(0, answer, current, s);
        return answer;
    }
    
    public void dfs(int start, List<List<String>> answer, List<String> current, String s){
        if(start >= s.length()) answer.add(new ArrayList<String>(current));
        for(int end = start; end < s.length(); end++){
            if(isPalindrome(s, start, end)){
                current.add(s.substring(start, end + 1));
                dfs(end + 1, answer, current, s);
                current.remove(current.size() - 1);
            }
        }
    }
    
    public boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}