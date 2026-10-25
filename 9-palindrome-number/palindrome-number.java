class Solution {
    public boolean isPalindrome(int x) {
        int sum =0,rev=0,original;
        original=x;
        if (x<0) return false;
        while (x!=0){
            int d = x%10;
            rev= rev*10+d;
            x=x/10;
    }
    return original==rev;
  }
}