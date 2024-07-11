class Solution {
    public String firstPalindrome(String[] words) {
         for (String s : words ) {
            if ( check(s) ) {
                return s;
            }
        }

        return "";
    }
     public boolean check(String str) {
        int start = 0;
        int end = str.length() - 1;

        while ( start <= end ) {
            if ( str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }
}