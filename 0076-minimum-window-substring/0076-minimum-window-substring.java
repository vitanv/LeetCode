class Solution {
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        if(m == 0 || n == 0) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        int size = map.size();
        int left = 0, right = 0, formed = 0;
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int[] arr = {-1, 0, 0};
        
        while(right < m){
            
            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c,0)+1);
            if(map.containsKey(c) && count.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }
            while(left <= right && formed == size){
                
                c = s.charAt(left);
                if(arr[0] == -1 || right - left + 1 < arr[0]){
                    arr[0] = right - left + 1;
                    arr[1] = left;
                    arr[2] = right;
                    
                }
                count.put(c, count.get(c) - 1);
                if(map.containsKey(c) && count.get(c).intValue() < map.get(c).intValue()) formed--;
                left++;
            }
            right++;
        }
        return arr[0] == -1 ? "" : s.substring(arr[1],arr[2] + 1);
    }
}