class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int max1 = nums[len-1]-1;
        int max2 = nums[len-2]-1;
        int res = max1*max2;
        return res;
    }
}
