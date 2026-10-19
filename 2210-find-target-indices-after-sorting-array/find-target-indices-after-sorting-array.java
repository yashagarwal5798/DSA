class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int c1 =0;
        int c2 =0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] < target)
            {
                c1++;
            }
            else if(nums[i] == target)
            {
                c2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i =c1 ; i<c1+c2;i++)
        {
            list.add(i);
        }
        return list;
    }
}