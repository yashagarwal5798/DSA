class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int left = 0;
        int right = n-1;
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        
        int l = 0;
        int r = k-1;
        while(l < r)
        {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--; 
        }

        int le = k;
        int ri = n-1;
        while(le < ri)
        {
            int temp = nums[le];
            nums[le] = nums[ri];
            nums[ri] = temp;

            le++;
            ri--; 
        }
        

    }
}