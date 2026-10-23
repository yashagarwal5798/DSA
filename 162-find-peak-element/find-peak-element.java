class Solution {
    public int findPeakElement(int[] nums) {
        int max =nums[0];
        int index =0;
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
            if(nums[i]>=max){
                max=nums[i];
                index = i;
            }
        }
        return index;
    }
}