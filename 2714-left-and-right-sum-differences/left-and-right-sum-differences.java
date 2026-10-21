class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int rightsum =0;
        int leftsum =0;
        for(int i =0;i<n;i++)
        {
            rightsum += nums[i];
        }

        int arr[] = new int[n];
        for(int j =0;j<n;j++)
        {
            rightsum -= nums[j];
            arr[j] = Math.abs(leftsum -rightsum);
            leftsum += nums[j];
        }
        return arr;

    }
}