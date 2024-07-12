class Solution {
    public int maxProduct(int[] nums) {
       int prod=0;
       Arrays.sort(nums);
       int a=nums[nums.length-1];
       int b=nums[nums.length-2];
       prod=((a-1)*(b-1));
       return prod;
    }
}