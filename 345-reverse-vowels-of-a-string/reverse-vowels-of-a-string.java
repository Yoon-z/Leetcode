class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        List<Character> vowels = new ArrayList<Character>();
        String result = "";
        for(int i = len-1; i >=0; i--) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u' ) {
                vowels.add(s.charAt(i));
            }
        }
        int j = 0;
        for(int i = 0; i<len; i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u') {
                result += vowels.get(j);
                j++;
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }
}