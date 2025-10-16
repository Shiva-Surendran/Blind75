class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=0;
        int max=nums[0];

        for(int i=0;i<nums.length;i++){
            if(currsum<0){
                currsum=0;
            }

            currsum=currsum+nums[i];
            max=Math.max(currsum,max);
        }return max;
        
    }
}
