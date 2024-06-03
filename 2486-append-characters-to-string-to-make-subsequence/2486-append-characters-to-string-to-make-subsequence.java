class Solution {
    public int appendCharacters(String s, String t) {
        int idxS = 0, idxT = 0;
        while(idxS < s.length() && idxT < t.length()){
            if(s.charAt(idxS) == t.charAt(idxT)){
                idxS++;
                idxT++;
            }else{
                idxS++;
            }
        }
        return Math.max(t.length() - idxT, 0);
    }
}