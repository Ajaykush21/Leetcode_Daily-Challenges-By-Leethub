class Solution {
    public int lengthOfLastWord(String s) {
         if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        int n=s.length();
        int count=0;
        char space=' ';
        for(int i=n-1;i>=0;i--){
            count++;
            char curr=s.charAt(i);
            if(curr==space){
                count--;
                return count;
            }
        }
        return count;
    }
}