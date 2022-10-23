class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> Map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(Map.containsKey(nums[i])){
                if((Map.get(nums[i])-i)*-1<=k){
                    return true;
                }
            }
            Map.put(nums[i],i);
        }
        return false;
    }
}