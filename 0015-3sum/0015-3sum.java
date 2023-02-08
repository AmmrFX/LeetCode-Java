class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> listsOutput  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(listsOutput);
        Arrays.sort(nums);
        for (int leftPointer = 0; leftPointer < nums.length-2; leftPointer++) {
            int movingPointer = leftPointer + 1;
            int rightPointer=nums.length-1;

            while (movingPointer < rightPointer) {
                int sum = nums[leftPointer] + nums[movingPointer] + nums[rightPointer];
                if (sum == 0)
                    listsOutput.add(Arrays.asList(nums[leftPointer], nums[movingPointer++], nums[rightPointer--]));
               else if (sum > 0) rightPointer--;
               else if (sum < 0)  movingPointer++;
            }
        }
        return new ArrayList<>(listsOutput);
    }

}