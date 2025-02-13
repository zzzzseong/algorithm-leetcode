class Trie {

    private Trie[] children = new Trie[26];
    private boolean endOfWord = false;

    public Trie() {}
    
    public void insert(String word) {
        Trie currentTrie = this;
        for(char c : word.toCharArray()) {
            if(Objects.isNull(currentTrie.children[c-'a'])) currentTrie.children[c-'a'] = new Trie();
            currentTrie = currentTrie.children[c-'a'];
        }
        currentTrie.endOfWord = true;
    }
    
    public boolean search(String word) {
        Trie currentTrie = this;
        for(char c : word.toCharArray()) {
            if(Objects.isNull(currentTrie.children[c-'a'])) return false;
            currentTrie = currentTrie.children[c-'a'];
        }
        if(!currentTrie.endOfWord) return false;
        return true;
    }
    
    public boolean startsWith(String prefix) {
        Trie currentTrie = this;
        for(char c : prefix.toCharArray()) {
            if(Objects.isNull(currentTrie.children[c-'a'])) return false;
            currentTrie = currentTrie.children[c-'a'];
        }
        return true;
    }
}