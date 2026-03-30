class Solution {
    public int firstUniqueEven(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i ++) {
            int target = nums[i];
            if (target % 2 == 0 && target != 0) {
                int cntr = 0;
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] % 2 != 0) nums[j] = 0;
                    else if (nums[j] == target) {
                        nums[j] = 0;
                        cntr ++;
                    }
                }
                if (cntr == 0) return target;
            }
        }
        return -1;
    }
}