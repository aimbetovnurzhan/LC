class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int minDifInd = -1, n = capacity.length;
        for (int i = 0; i < n; i ++) {
            int dif = capacity[i] - itemSize;
            if (dif < 0) continue;
            else if (dif == 0) return i; 
            else {
                if (minDifInd < 0) minDifInd = i;
                else if (dif < (capacity[minDifInd] - itemSize)) {
                    minDifInd = i;
                }
            }
        }
        return minDifInd;
    }
}