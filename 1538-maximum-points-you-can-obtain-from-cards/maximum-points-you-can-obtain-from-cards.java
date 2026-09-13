class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum =0;
        int n = cardPoints.length;
        for(int i =0;i<k;i++)
        {
            sum += cardPoints[i];
        }
        int maxsum =sum;
         for(int i =1;i<=k; i++)
         {
            sum  =sum-cardPoints[k-i];
            sum = sum + cardPoints[n-i];
            maxsum = Math.max(maxsum , sum );
         }
         return maxsum;
    }
}