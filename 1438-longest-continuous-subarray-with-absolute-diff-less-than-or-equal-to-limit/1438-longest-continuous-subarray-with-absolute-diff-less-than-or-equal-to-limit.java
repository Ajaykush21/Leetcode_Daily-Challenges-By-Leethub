class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;

        TreeMap<Integer, Integer> st = new TreeMap<>();
        int i = 0;
        int j = 0;
        int maxLength = 0;

        while (j < n) {
            st.put(nums[j], st.getOrDefault(nums[j], 0) + 1);

            while (st.lastKey() - st.firstKey() > limit) {
                st.put(nums[i], st.get(nums[i]) - 1);
                if (st.get(nums[i]) == 0) {
                    st.remove(nums[i]);
                }
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }

        return maxLength; 
    }
}