class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i,j;

       
        for ( i = 0; i < n; i++) {
            for ( j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }
}
