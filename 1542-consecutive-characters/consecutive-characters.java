class Solution {
    public int maxPower(String s) {
        
        return consecutive(s,1,1,0);
    }
    static int consecutive(String s, int i, int count, int max)
    {
        if(i==s.length()){
            return Math.max(count,max);
        }
        if(s.charAt(i)==s.charAt(i-1)){
            count = count +1;
        }
        else{
            count=1;
        }
         return consecutive(s, i + 1, count, Math.max(max, count));
    }
}