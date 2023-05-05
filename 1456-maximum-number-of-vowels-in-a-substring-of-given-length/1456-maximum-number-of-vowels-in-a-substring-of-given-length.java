class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = Set.of('a','e','i','o','u');
        int left = 0, right = 0, answer = 0, curr = 0;
        while(right < k){
            if(set.contains(s.charAt(right))) answer++;
            right++;
        }
        curr = answer;
        while(right < s.length()){
            System.out.println(curr);
            if(set.contains(s.charAt(right))) curr++;
            if(set.contains(s.charAt(left))) curr--;
            right++;
            left++;
            
            answer = Math.max(curr, answer);
        }
        return answer;
    }
}