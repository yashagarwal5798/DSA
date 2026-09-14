class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n<2) return 0;
        int c=0;
        for(int  i =0 ;i<n-1;i++)
        {
            int gap = nums[i+1] - nums[i];
            if(gap > c) 
            {
                c = gap;
            }
        }
        return c;
    }
}