class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        String vowels = "aeiou";
        boolean hasVowel = false;
        boolean hasConsonat = false;
        for(char c: word.toCharArray()){
            if(Character.isLetter(c)){
                char ch = Character.toLowerCase(c);
                if(vowels.indexOf(ch) != - 1){
                    hasVowel = true;
                }else{
                    hasConsonat = true;
                }
            }else if(!Character.isDigit(c)){
                return false;
            }
        }
        return hasConsonat && hasVowel;
    }
}