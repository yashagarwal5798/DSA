class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        for (int i = 0; i < n; i++) {
            int count1 = 0;
            for (int j = i; j < n; j++) {
                count1++;
            }
            if (count1 <= citations[i]) {
                h = Math.max(h, count1);
            }
        }
        return h;
    }
}