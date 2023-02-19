class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
          char[] chars = s.toCharArray();
        HashMap<Character, Integer> dublicatedletters = new HashMap<>();
        int max = -2;
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!dublicatedletters.containsKey(chars[i])) {
                dublicatedletters.put(chars[i], i);

            } else {
                 sum = i - dublicatedletters.get(chars[i])-1;
                if (max < sum) max = sum;
            }
        }
        if (max>=0) return max;
        return -1;
    }
}