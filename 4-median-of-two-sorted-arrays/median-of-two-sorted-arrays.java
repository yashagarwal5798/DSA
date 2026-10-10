class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum[] = new int[nums1.length + nums2.length];
        
        for(int i = 0; i<nums1.length;i++)
        {
            sum[i] = nums1[i];
        }
        for(int i =0;i<nums2.length;i++)
        {
            sum[nums1.length+i] = nums2[i];
        }

        Arrays.sort(sum);
        int mid = sum.length/2;
        if(sum.length%2==0)
        {
            return (sum[mid]+sum[mid-1])/2.0;
        }
        return sum[mid];
    }
}