class Solution {
    public int maxProductDifference(int[] nums) {
      int prod=0;
      Arrays.sort(nums);
      prod=((nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]));
      return prod;
    }
}