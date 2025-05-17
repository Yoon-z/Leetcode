class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }   
        int i = 0;
        int flag = s.length();
        for (int j = 0; j < s.length(); j++) {
            while (i < t.length()) {
                if (t.charAt(i) == s.charAt(j)) {
                    flag --;
                    i++;
                    break;
                }
                i++;
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }
}