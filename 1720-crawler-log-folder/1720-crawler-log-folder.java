class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;

        for (String s : logs) {
            if (s.equals("../")) {
                depth = Math.max(0, depth - 1);// taki depth -ve na ho 
            } else if (!s.equals("./")) {
                depth++;
            }
        }

        return depth;
    }
}