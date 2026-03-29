class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        if (n < 2) return -1;
        int minDif = n;
        for (int i = 0; i < n; i ++) {
            if (nums[i] == 1) {
                for (int j = n - 1; j >= 0; j--) {
                    if (nums[j] == 2) {
                        minDif = Math.min(minDif, Math.abs(i - j));
                    }
                }
            }
        }
        if (minDif != n) return minDif;
        else return -1;
    }
}