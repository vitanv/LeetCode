class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consonant = new HashMap<>();
        for(char c: s.toCharArray()){
            if(c == 'a'|| c == 'e' || c == 'i' || c == 'o'|| c == 'u'){
                vowel.put(c, vowel.getOrDefault(c, 0) + 1);
            }else{
                consonant.put(c, consonant.getOrDefault(c, 0) + 1);
            }
        }
        int maxVowel = 0, maxConsonant = 0;
        for(char key: vowel.keySet()){
            maxVowel = Math.max(maxVowel, vowel.get(key));
        }
        for(char key: consonant.keySet()){
            maxConsonant = Math.max(maxConsonant, consonant.get(key));
        }
        return maxVowel + maxConsonant;
    }
}