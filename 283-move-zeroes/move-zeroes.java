class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int nonZero = 0;
        int num  = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                swap(nums, i, nonZero);
                nonZero++;
            }
        }
        for (int i = nonZero+1; i < len; i++) {
            nums[i] = 0;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}