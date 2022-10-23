class Solution {
    public int searchInsert(int[] nums, int target) {
    HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
                       map.put(nums[i],i);
            if(!map.containsKey(target)){
            if(nums[i]>target){
                return i;
            }if(nums[nums.length-1]<target){
                return nums.length;
            }
                
            }if(map.containsKey(target)){
                return map.get(target);
            }
        }
        return 0;
    }
}