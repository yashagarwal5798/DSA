class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        

        int product1 = nums[0] * nums[1];
        int product2 = nums[n-1] * nums[n-2];

        int diff = product2 - product1;

        return diff;
    }
}