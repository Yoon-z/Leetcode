class Solution {
    public boolean isSubsequence(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        if (lenS > lenT) {
            return false;
        }   
        int i = 0;
        int flag = lenS;
        for (int j = 0; j < lenS; j++) {
            while (i < lenT) {
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