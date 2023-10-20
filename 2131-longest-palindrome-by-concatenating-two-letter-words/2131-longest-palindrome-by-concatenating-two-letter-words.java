class Solution {
    public int longestPalindrome(String[] words) {
        int answer = 0;
        boolean middle = false;
        HashMap<String, Integer> map = new HashMap<>();
        for(String w : words) map.put(w, map.getOrDefault(w, 0)+1);
        for(Map.Entry<String, Integer> m : map.entrySet()){
            String word = m.getKey();
            int count = m.getValue();
            if(word.charAt(0) == word.charAt(1)){
                if(count % 2 == 0){
                    answer += count;
                }else{
                    answer += count - 1;
                    middle = true;
                }
            }else if(word.charAt(0) < word.charAt(1)){
                String reversed = new StringBuilder(word).reverse().toString();
                if(map.containsKey(reversed)){
                    answer += 2 * Math.min(count, map.get(reversed));
                }
            }
        }
        if(middle) answer++;
        return answer * 2;
    }
}