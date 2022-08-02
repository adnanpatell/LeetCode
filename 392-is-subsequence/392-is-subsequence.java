class Solution {
    public boolean isSubsequence(String s, String t) {
        for (int idx = 0; idx < t.length(); idx++) {
             if(s.length() == 0)
                break;
            if (s.charAt(0) == t.charAt(idx))
                s = s.substring(1, s.length());
        }
        return (s.length() == 0);
    }
}