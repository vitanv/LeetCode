class Solution {
    public int strStr(String haystack, String needle) {
        for(int left = 0; left <= haystack.length() - needle.length(); left++){
            for(int right = 0; right < needle.length(); right++){
                if(needle.charAt(right) != haystack.charAt(left + right)) break;
                if(right == needle.length() - 1) return left;
            }
        }
        return -1;
    }
}