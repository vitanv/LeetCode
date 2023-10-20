class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length(), l = 0, r = 0; 
        int count[] = new int[26], curCount[] = new int[26]; 
        List<Integer> res = new ArrayList<Integer>(); 
        for(char i:p.toCharArray()) count[i-'a']++; 
        while(r < n){
            curCount[s.charAt(r)-'a']++; 
            if((r-l) >= m) curCount[s.charAt(l++)-'a']--; 
            if(Arrays.equals(count, curCount)) res.add(l); 
            r++; 
        }
        return res; 
    }
}