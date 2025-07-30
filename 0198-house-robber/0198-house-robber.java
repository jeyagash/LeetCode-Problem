class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
      int sum=0;
      int Rob=0;
      for(int arr:nums){
       int temp =Math.max(sum,Rob+arr);
       Rob=sum;
       sum=temp;
      }
      return sum;
    }
}