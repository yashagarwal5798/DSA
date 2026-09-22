class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x = nums.length;
        int ans[] = new int[x];
        for(int i =0; i<x;i++)
        {
            if(i%2==0)
            {
                ans[i] =  nums[i/2];
            }
            else
            {
                ans[i] = nums[n+(i/2)];
            }
        }
        return ans;
    }
}