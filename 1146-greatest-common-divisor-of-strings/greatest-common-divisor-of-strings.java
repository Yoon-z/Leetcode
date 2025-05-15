class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = 0;
        int maxLen = 0;
        String shortS = "";
        String longS = "";
        int i = 1;
        if(len1 < len2) {
            minLen = len1;
            maxLen = len2;
            shortS = str1;
            longS = str2;
        } else {
            minLen = len2;
            maxLen = len1;
            shortS = str2;
            longS = str1;
        }
        while (i <= minLen) {
            if (minLen%i == 0 && shortS.equals(shortS.substring(0, minLen/i).repeat(i))) {
                if(maxLen%(minLen/i) == 0 && longS.equals(shortS.substring(0, minLen/i).repeat(maxLen/(minLen/i)))) {
                    return shortS.substring(0, minLen/i);
                }
            }
            i++;
        }
        return "";
    }
}