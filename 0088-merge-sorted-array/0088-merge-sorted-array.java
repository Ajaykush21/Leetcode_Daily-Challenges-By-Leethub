class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int nums[] = new int[m+n];
    int k=0;
    for(int i=0;i<m;i++){
    nums[k] = nums1[i];
    k++;
    }
    for(int j=0;j<n;j++) {
       nums[k] = nums2[j];
        nums1[k] = nums2[j];
        k++;
    }
    Arrays.sort(nums);
   Arrays.sort(nums1);
    for(int i: nums){
        System.out.print(i + ",");
    } 
    }
}