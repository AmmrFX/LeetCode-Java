class Solution {
    public int[] sortArrayByParityII(int[] nums) {
               int[] odd = new int[nums.length / 2];
        int[] even = new int[nums.length/2];
        int firstpointer=-1;
        int firstpointereven=-1;
        for (int num: nums
             ) {
            if (num%2!=0){
                firstpointer++;
                odd[firstpointer]=num;
            }
            else{
                firstpointereven++;
                even[firstpointereven] =num;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                nums[i]=even[i/2];
            }else{
                nums[i]=odd[i/2];
            }
        }
        return nums;
    }
}