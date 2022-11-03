class Solution {
    public int[] plusOne(int[] digits) {
        int digt= digits.length ;
        int[] temparr= new int[digt+1];
        temparr[0]=1;
        for(int i= digt-1 ;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            if(temparr[i+1]==9){
                temparr[i+1]=0;
            }
            }else{
                digits[i]+=1;
                temparr[i+01]+=1;
                    break;
            }
        }
        if(digits[0]!=0){
    return digits;
            
        }
        return temparr;
}
}