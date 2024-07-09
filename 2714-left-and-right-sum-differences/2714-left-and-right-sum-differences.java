class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n =nums.length;
        int [] left=new int [n];
        int [] right=new int [n];
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            left[i]=leftSum;
            leftSum+=nums[i];
            
        }
         for(int i=n-1;i>=0;i--){
            right[i]=rightSum;
            rightSum+=nums[i];
            
        }
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(left[i] - right[i]);
        }
        return nums;



         
    }
}