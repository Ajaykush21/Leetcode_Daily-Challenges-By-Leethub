class Solution {
    public int[] shuffle(int[] nums, int n) {
       int [] ans= new int [nums.length];
       int i=0;
       int j=0;
       while(i<2*n){
        ans[i]=nums[j];
        ans[i+1]=nums[j+n];
        i=i+2;
        j++;
       }
       return ans;
    }
}