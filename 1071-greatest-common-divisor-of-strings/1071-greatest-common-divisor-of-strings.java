class Solution {
    public String gcdOfStrings(String str1, String str2) {
        for(int i = Math.min(str1.length(), str2.length()); i >= 1; i--){
            if(check(str1, str2, i)) return str1.substring(0, i);
        }
        return "";
    }
    public boolean check(String str1, String str2, int n){
        if(str1.length() % n > 0 || str2.length() % n > 0) return false;
        String base = str1.substring(0, n);
        return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
    }
}