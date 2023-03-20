class WordDictionary {
HashSet<String> set = new HashSet<>();
    public WordDictionary() {
    }
    
    public void addWord(String word) {
        set.add(word);
    }
    
  public boolean search(String word) {
        if (!word.contains(".")) {
            return set.contains(word);
        } else {
            for (String st : set) {
                if (st.length() == word.length()) {
                    boolean match = true;
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) != '.' && word.charAt(i) != st.charAt(i)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
     

 /*
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */