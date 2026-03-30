class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int minDifInd = -1, n = capacity.length, prev = 101;
        for (int i = 0; i < n; i ++) {
            int curr = capacity[i];
            if (curr < prev) {
                int dif = curr - itemSize;
                if (dif < 0) continue;
                else if (dif == 0) return i; 
                else {
                    if (minDifInd < 0) {
                        minDifInd = i;
                        prev = curr;
                    } else if (dif < (prev - itemSize)) {
                        minDifInd = i;
                        prev = curr;
                    }
                }
            }
        }
        return minDifInd;
    }
}