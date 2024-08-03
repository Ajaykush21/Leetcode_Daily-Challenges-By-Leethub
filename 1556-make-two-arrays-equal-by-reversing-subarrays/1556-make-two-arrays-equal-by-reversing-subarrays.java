class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
      int count=0;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target[i]){
            count++;
            }
        }
        if(count==arr.length){
            return true;
        }else{
            return false;
        }
       

        
    }
}