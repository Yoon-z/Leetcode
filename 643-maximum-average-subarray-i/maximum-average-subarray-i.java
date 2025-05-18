class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        double max = getAverage(nums, 0, k, k);
        for (int i = 1; i <= len-k; i++) {
            double average = getAverage(nums, i, i+k, k);
            if (average > max) {
                max = average;
            }
        }
        return max;
    }

    public double getAverage(int[] nums, int i, int j, int k) {
        int sum = 0;
        for (int m = i; m < j; m++) {
            sum += nums[m];
        }
        return (double)sum/k;
    }
}