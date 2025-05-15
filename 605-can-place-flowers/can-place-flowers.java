class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int len = flowerbed.length;
        int i = 0;
        while (i < len) {
            if (flowerbed[i] == 0) {
                if ((i+1 < len && flowerbed[i+1] == 0) || i+1 == len) {
                    if ((i-1 >= 0 && flowerbed[i-1] == 0) || i-1 < 0 ) {
                        n -= 1;
                    } else if ((i-1 >= 0 && flowerbed[i-1] == 1)){
                        i += 1;
                        continue;
                    }
                }
            }
            if (n == 0) {
                 return true;
            }
            i += 2;
        }
        return false;
    }
}