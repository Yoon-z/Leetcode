class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int num  = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                if(i+1 < len) {
                    for(int j = i+1; j<len; j++) {
                        if (nums[j] != 0) {
                            swap(nums, i, j);
                            break;
                        }
                    }
                }
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}