class Solution {
    public boolean check(int[] nums) {
        int count= 0;
        for(int i =0; i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                    count++;
            }
            }
            if(count>1) return false;
        if(count>=1 &&nums[nums.length-1]>nums[0]) return false;
        
        return true;
    }
}