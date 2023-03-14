class Solution {
    public int rob(int[] nums) {
        if (nums.length==1) return nums[0];
        int[] db = new int[nums.length];
        int[] db2 = new int[nums.length + 1];
        db[0] = 0;
        db[1] = nums[0]; ;
        
        for (int i = 1; i < nums.length-1; i++) {
            db[i + 1] = Math.max(db[i], db[i - 1] + nums[i]);
        }
        db2[0] = 0;
        db2[1] = 0;
        for (int i = 1; i < nums.length; i++) {
            db2[i + 1] = Math.max(db2[i], db2[i - 1] + nums[i]);
        }
        return Math.max(db[nums.length-1],db2[nums.length]);
    }
}