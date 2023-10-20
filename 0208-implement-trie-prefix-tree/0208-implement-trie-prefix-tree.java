class TrieNode{
    private TrieNode[] children;
    private boolean end;
    
    public TrieNode(){
        children = new TrieNode[26];
    }
    
    public boolean containsKey(char c){
        return children[c - 'a'] != null;
    }
    public TrieNode get(char c){
        return children[c - 'a'];
    }
    public void put(char c, TrieNode node){
        children[c - 'a'] = node;
    }
    public void setEnd(){
        end = true;
    }
    public boolean isEnd(){
        return end;
    }
}

class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            char curr = word.charAt(i);
            if(!node.containsKey(curr)) node.put(curr,new TrieNode());
            node = node.get(curr);
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }
    
    public TrieNode searchPrefix(String word){
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            char curr = word.charAt(i);
            if(node.containsKey(curr)){
                node = node.get(curr);
            }else{
                return null;
            }
        }
        return node;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */