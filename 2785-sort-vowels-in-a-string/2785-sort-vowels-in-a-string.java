class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for(char c:s.toCharArray()){
            if(set.contains(c)) list.add(c);
        }
        Collections.sort(list);
        StringBuilder answer = new StringBuilder();
        int index = 0;
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                answer.append(list.get(index));
                index++;
            }else{
                answer.append(c);
            }
        }
        return answer.toString();
    }
}