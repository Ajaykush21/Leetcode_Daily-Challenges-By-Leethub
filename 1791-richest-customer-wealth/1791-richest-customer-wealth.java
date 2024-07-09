class Solution {
    public int maximumWealth(int[][] accounts) {
       int max=0;
       for(int i=0;i<accounts.length;i++){
        int localmax=0;
        for(int j = 0 ;j<accounts[0].length;j++){
            localmax+=accounts[i][j];
        }
        if(max<localmax){
            max=localmax;
        }
       }
       return max;
    }
}