class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<Boolean>();
        int max = 0;
        for (int numCandies : candies) {
            if (numCandies > max) {
                max = numCandies;
            }
        }
        for (int numCandies: candies) {
            if (numCandies + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}