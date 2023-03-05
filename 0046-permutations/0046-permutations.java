class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> BigList = new ArrayList<>();
         recursive(nums, BigList, new ArrayList<>());
        return BigList;
    }

    public static void recursive(int[] nums, List<List<Integer>> BigList, List<Integer> tempList) {
        if(tempList.size()== nums.length){
            BigList.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                recursive(nums,BigList,tempList);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}