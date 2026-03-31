class Solution {
    public boolean hasDuplicate(int[] nums) {
        int k = nums.length;

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}