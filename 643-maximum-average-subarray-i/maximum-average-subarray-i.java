class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int sum = getSum(nums, 0, k);
        int max = sum;
        for (int i = 1; i <= len-k; i++) {
            sum = sum - nums[i-1] + nums[i+k-1];
            if (sum > max) {
                max = sum;
            }
        }
        return (double)max/k;
    }

    public int getSum(int[] nums, int i, int j) {
        int sum = 0;
        for (int m = i; m < j; m++) {
            sum += nums[m];
        }
        return sum;
    }
}