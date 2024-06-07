class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        if(dictionary == null || dictionary.size() == 0) return sentence;
        HashSet<String> set = new HashSet<>();
        for(String word: dictionary){
            set.add(word);
        }
        StringBuilder answer = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for(String word: words){
            String root = "";
            for(int i = 1; i <= word.length(); i++){
                root = word.substring(0, i);
                if(set.contains(root)) break;
            }
            answer.append(" " + root);
        }
        return answer.deleteCharAt(0).toString();
    }
}