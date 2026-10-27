class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combination(0, candidates, target , new ArrayList<>(), result);
        return result;
    }
    public void combination(int i, int[] candidates, int target , List<Integer> list, List<List<Integer>> result)
    {
        if(i == candidates.length)
        {
            if(target == 0)
            {
                result.add(new ArrayList<>(list)); 
            }
            return;
        }
        if(candidates[i] <= target)
        {
            list.add(candidates[i]);
            combination(i , candidates ,target-candidates[i], list, result);
            list.remove(list.size()-1);
        }
        combination(i+1, candidates, target, list, result);
    }
}