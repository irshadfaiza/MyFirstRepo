class Solution {
    public int countPairs(int[] nums, int k) {
        int i,j,m=0,count=0;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(i!=j){
                 if(nums[i]==nums[j] && i<j){
                     m=i*j;
                     if(m%k == 0){
                         count++;
                     }
                 }
                }
            }
        }
        return count;
    }
}