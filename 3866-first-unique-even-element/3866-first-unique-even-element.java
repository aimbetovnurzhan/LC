class Solution {
    public int firstUniqueEven(int[] nums) {
        int target = -1;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] % 2 == 0 && nums[i] != 0) {
                int cntr = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0) nums[j] = 0;
                    else if (nums[j] == nums[i]) {
                        nums[j] = 0;
                        cntr ++;
                    }
                }
                if (cntr > 0) nums[i] = 0;
                else {
                    target = nums[i];
                    break;
                }
            }
        }
        return target;
    }
}