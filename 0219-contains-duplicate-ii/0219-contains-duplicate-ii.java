class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(count.containsKey(nums[i])) {
                if(i - count.get(nums[i]) <= k) return true;
            }
            count.put(nums[i], i);
        }
        return false;
    }
}