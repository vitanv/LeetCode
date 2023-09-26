class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastPosition = new int[26];
        int n = s.length();
        boolean[] seen = new boolean[26];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            lastPosition[s.charAt(i) - 'a'] = i;
        }
        for(int i = 0; i < n; i++){
            int curr = s.charAt(i) - 'a';
            if(seen[curr]){
                continue;
            }
            while(!stack.isEmpty() && stack.peek() > curr && i < lastPosition[stack.peek()]){
                seen[stack.pop()] = false;
            }
            stack.push(curr);
            seen[curr] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append((char)(stack.pop() + 'a'));
        }
        return sb.reverse().toString();
    } 
}