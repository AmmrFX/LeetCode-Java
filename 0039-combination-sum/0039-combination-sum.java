class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    public  void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int target, int start) {
        if (target ==0){
            list.add(new ArrayList<>(tempList) );
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] >target) {
                continue;
            }
            tempList.add(candidates[i]);
            backtrack(list,tempList,candidates,target-candidates[i],i);
            tempList.remove(tempList.size()-1);
        }
    }
    
}