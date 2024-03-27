class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       return sub(nums,k);
    }
    public int sub(int [] arr,int k){
         int si = 0;
		int ei = 0;
		int count = 0;
		int p = 1;
		while (ei < arr.length) {
			// growing
			p = p * arr[ei];
			// shrinking
			while (p >= k && si<=ei) {
				p /= arr[si];
				si++;
			}
			// answer
			count += (ei - si + 1);
			ei++;

		}
		return count;
    }
}