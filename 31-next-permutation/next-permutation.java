class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i = nums.length -2; i>=0;i--)
        {
            if(nums[i] < nums[i+1])
            {
                pivot = i;
                break;
            }
        }
        if(pivot == -1)
        {
            int l =0;
            int r = nums.length -1;
            while(l<r)
            {
                int temp =  nums[l];
                nums[l] = nums[r];
                nums[r] = temp;

                l++;
                r--;
            }
            return;
        }
        int replace = -1;
        for(int i = nums.length -1; i>pivot;i--)
        {
            if(nums[pivot] < nums[i])
            {
                replace = i;
                break;
            }
        }
        int temp = nums[pivot];
         nums[pivot] = nums[replace];
         nums[replace] = temp;

         int l = pivot+1;
         int r = nums.length -1;
         while(l<r)
         {
            int tempe = nums[l];
            nums[l] = nums[r];
            nums[r] = tempe;

            l++;
            r--;
         }
         
    }
}