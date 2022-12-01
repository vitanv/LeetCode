class Solution {
    public boolean halvesAreAlike(String s) {
        int countA = 0, countB = 0;
        Character arr[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        HashSet<Character> set = new HashSet<>(Arrays.asList(arr));
        for(int i = 0; i < s.length()/2; i++){
            if(set.contains(s.charAt(i))) countA++;
            if(set.contains(s.charAt(s.length() - 1 - i ))) countB++;
        }
        return countA == countB;
    }
}