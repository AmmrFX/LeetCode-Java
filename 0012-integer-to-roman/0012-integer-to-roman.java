class Solution {
    public String intToRoman(int num) {
                    LinkedList<Integer> stack = new LinkedList<Integer>();
        while (num > 0) {
            stack.push(num % 10);
            num = num / 10;
        }
        String Roman = "";

        HashMap<Integer, String> RomanNumbers = new HashMap<Integer, String>();
        while (!stack.isEmpty()) {
            if (stack.size() == 1) {
                RomanNumbers.clear();
                RomanNumbers.put(1, "I");
                RomanNumbers.put(0, "I");
                RomanNumbers.put(2, "II");
                RomanNumbers.put(3, "III");
                RomanNumbers.put(4, "IV");
                RomanNumbers.put(5, "V");
                RomanNumbers.put(6, "VI");
                RomanNumbers.put(7, "VII");
                RomanNumbers.put(8, "VIII");
                RomanNumbers.put(9, "IX");
            }
            if (stack.size() == 2) {
                RomanNumbers.clear();
                RomanNumbers.put(1, "X");
                RomanNumbers.put(0, "X");
                RomanNumbers.put(5, "L");
                RomanNumbers.put(4, "XL");
                RomanNumbers.put(9, "XC");
                RomanNumbers.put(3, "XXX");
                RomanNumbers.put(2, "XX");
                RomanNumbers.put(8, "LXXX");
                RomanNumbers.put(7, "LXX");
                RomanNumbers.put(6, "LX");

            }
            if (stack.size() == 3) {
                RomanNumbers.clear();
                RomanNumbers.put(1, "C");
                RomanNumbers.put(2, "CC");
                RomanNumbers.put(3, "CCC");
                RomanNumbers.put(0, "");
                RomanNumbers.put(6, "DC");
                RomanNumbers.put(7, "DCC");
                RomanNumbers.put(8, "DCCC");
                RomanNumbers.put(5, "D");
                RomanNumbers.put(4, "CD");
                RomanNumbers.put(9, "CM");
            }
            if (stack.size() == 4) {
                RomanNumbers.clear();
                RomanNumbers.put(1, "M");
                RomanNumbers.put(2, "MM");
                RomanNumbers.put(3, "MMM");
            }
            RomanNumbers.put(0, "");
            Roman += RomanNumbers.get(stack.pop());

        }
        return Roman;
    }
}