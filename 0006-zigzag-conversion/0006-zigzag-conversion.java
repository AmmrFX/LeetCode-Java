class Solution {
    public String convert(String s, int numRows) {
         if (s.length() == 1 || numRows == 1) {
        return s;
    }
    int betweenEachLetter = (numRows) + (numRows - 2);
    StringBuilder convertedWord = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
        int betweenZigzagsLetters = (numRows) + (numRows - 2) - (i * 2);
        for (int column = i; column < s.length(); column += betweenEachLetter) {
            convertedWord.append(s.charAt(column));
            if (i != 0 && i != numRows - 1 && column + betweenZigzagsLetters < s.length()) {
                convertedWord.append(s.charAt(column + betweenZigzagsLetters));
            }
        }
    }
    return convertedWord.toString();
    }
}