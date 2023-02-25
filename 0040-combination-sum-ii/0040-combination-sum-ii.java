class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          Arrays.sort(candidates);
        List<List<Integer>> BigList = new ArrayList<>();
        BackTrack(candidates,target,BigList,0,new ArrayList<>());
        return BigList;
    }

    private static void BackTrack(int[] candidates, int target, List<List<Integer>> bigList,int start, List<Integer> tempList) {
        if(target<0 )return;
        if (target==0) {
            if (!bigList.contains(tempList))
            bigList.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i>start&&candidates[i]==candidates[i-1] ){
                continue;
        }
            tempList.add(candidates[i]);
            BackTrack(candidates,target-candidates[i],bigList,i+1,tempList);
            tempList.remove(tempList.size()-1);
    }
}
}