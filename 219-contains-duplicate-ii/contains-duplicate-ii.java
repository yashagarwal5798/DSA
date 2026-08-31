class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> sc =   new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(sc.contains(nums[i]))
            {
                return true;
            }  
             sc.add(nums[i]);
            if(sc.size()>k)
             {
            sc.remove(nums[i-k]);
             }
        }
       
        return false;
    }
}