class Solution {
    public int search(int[] nums, int target) {
        int c = 0;
        int a = nums.length - 1;
        while (c <= a) {
            int d = c + (a- c) / 2;
            if (nums[d] == target)
                return d;
            else if (nums[d] < target)
                c = d + 1;
            else
                a = d - 1;
        }
        return -1;
    }
}