class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int count = 0;

        int sum = 0;
        int mod[] =new int[k];
        mod[0]=1;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; //subarray sum 0 to i

            //modulus stores remainder when current sum is divided by k
            int modulus = ((sum % k) + k) % k;//taking % twice as sum can negetive -ve
            count += mod[modulus];
            mod[modulus]++;
        }
        return count;
	}
}