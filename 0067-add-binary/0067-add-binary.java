class Solution {
    public String addBinary(String a, String b) {
         int firstpointer = a.length() -1;
        int secondPointer = b.length()-1 ;
        int firstSum=0,secondSum = 0,carryone=0;

        StringBuilder sum = new StringBuilder();
        boolean finished = false;
        while (!finished) {
            if (firstpointer >= 0) {
                firstSum = Character.getNumericValue(a.charAt(firstpointer));
                if (secondPointer<0) secondSum=0;
            }
            if (secondPointer >= 0) {
                secondSum = Character.getNumericValue(b.charAt(secondPointer));
                if (firstpointer<0) firstSum=0;
            }
            firstpointer--;
            secondPointer--;
            if (firstpointer<0&&secondPointer<0){
                finished = true;
            }
    int summation = firstSum+secondSum+carryone;
            if (summation > 1) {
                if (carryone==1&&summation>2)sum.append(1);
               else sum.append(0);
                carryone = 1;
            }
            if (summation < 1) {
                sum.append(0);
                carryone = 0;
            }
            if (summation == 1) {
                sum.append(1);
                carryone = 0;
            }
        }
        if(carryone==1)  sum.append(1);
        return sum.reverse().toString();
    }
}