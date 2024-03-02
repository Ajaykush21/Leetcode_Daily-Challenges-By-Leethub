class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp[]=new int[nums.length];
       for(int i=0;i<nums.length;i++)
       {
           temp[i]=nums[i]*nums[i];
       }
     Arrays.sort(temp);
        return temp;
    }
}