class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       HashMap<Integer,String> map=new HashMap<>();
       int n=names.length;
       for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
       } 
       Arrays.sort(heights);
       int j=0,k=n-1,i=0;
       while(j<k){
        i=heights[j];
        heights[j]=heights[k];
        heights[k]=i;
        j++;
        k--;
       }
       for( i=0;i<n;i++){
        names[i]=map.get(heights[i]);
       }
          return names;
    }
}