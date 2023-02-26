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
            map.put(word,map.get(word)+1);
            if (max<map.get(word)+1 &&!set.contains(word)) {
                max= map.get(word)+1;
                maxWord= word;
            }
        }


        return maxWord;
    }
}