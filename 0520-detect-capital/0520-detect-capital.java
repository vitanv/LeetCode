class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) return true;
        if(!Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) return false;

        for(int i = 2; i < word.length(); i++){
            if(!Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(i))) return false;
            if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1)) && !Character.isUpperCase(word.charAt(i))) return false;
            if(Character.isUpperCase(word.charAt(0)) && !Character.isUpperCase(word.charAt(1)) && Character.isUpperCase(word.charAt(i))) return false;
        }
        return true;
    }
}