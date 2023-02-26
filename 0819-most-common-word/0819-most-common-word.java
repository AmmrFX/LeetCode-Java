class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
             String[] words= paragraph.toLowerCase().split("[\\s!?',;.]+");
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>(Arrays.asList(banned));
        int max= 0;
        String maxWord=null;
        for (String word:words
             ) {
            if (!map.containsKey(word)){
                map.put(word,0);
            }
  int count =  map.getOrDefault(word,0)+1;
            map.put(word,count);
            if (max<count &&!set.contains(word)) {
                max= map.get(word);
                maxWord= word;
            }
        }
        return maxWord;
    }
}