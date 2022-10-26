class Solution {
    public List<String> letterCombinations(String digits) {
       List<String> list = new ArrayList<>();
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String[] charArray = new String[4];
        for (int i = 0; i < digits.length(); i++) {
            charArray[i] = mapping[Integer.parseInt(String.valueOf(digits.charAt(i)))];
        }
        if (digits.length() == 0) {
        }
        if (digits.length() == 1) {
            for (int i = 0; i < charArray[0].length(); i++) {
                String amr = String.valueOf(charArray[0].charAt(i));
                list.add(amr);
            }
        }
        if (digits.length() == 2) {
            for (int i = 0; i < charArray[0].length(); i++) {
                for (int j = 0; j < charArray[1].length(); j++) {
                    String amr = String.valueOf(charArray[0].charAt(i) + String.valueOf(charArray[1].charAt(j)));
                    list.add(amr);
                }
            }
        }
        if (digits.length() == 3) {
            for (int i = 0; i < charArray[0].length(); i++) {
                for (int j = 0; j < charArray[1].length(); j++) {
                    for (int k = 0; k < charArray[2].length(); k++) {
                        String amr = String.valueOf(charArray[0].charAt(i)) + String.valueOf(charArray[1].charAt(j)) + String.valueOf(charArray[2].charAt(k));
                        list.add(amr);
                    }

                }
            }
        }
        if (digits.length() == 4) {
            for (int i = 0; i < charArray[0].length(); i++) {
                for (int j = 0; j < charArray[1].length(); j++) {
                    for (int k = 0; k < charArray[2].length(); k++) {
                        for (int l = 0; l < charArray[3].length(); l++) {
                            String amr = String.valueOf(charArray[0].charAt(i)) + String.valueOf(charArray[1].charAt(j)) + String.valueOf(charArray[2].charAt(k)) + String.valueOf(charArray[3].charAt(l));
                            list.add(amr);
                        }

                    }

                }
            }
        }
        return list;
    
    }
}