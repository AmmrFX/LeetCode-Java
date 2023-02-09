class Solution {
    public int threeSumClosest(int[] nums, int target) {
         if (nums.length == 0) return target;
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int closestSum = 0;
        for (int leftPointer = 0; leftPointer < nums.length - 2; leftPointer++) {
            int movingCursor = leftPointer + 1;
            int rightPointer = nums.length - 1;
            while (movingCursor < rightPointer) {
                int currentSum = nums[leftPointer] + nums[movingCursor] + nums[rightPointer];
                int currentDiff = Math.abs(currentSum - target);
                if (currentDiff < minDiff) {
                    minDiff = currentDiff;
                    closestSum = currentSum;
                }
                if (currentSum > target) {
                    rightPointer--;

                } else if (currentSum < target) {
                    movingCursor++;
                } else {
                    return target;
                }
            }
        }
        return closestSum;
    }
}