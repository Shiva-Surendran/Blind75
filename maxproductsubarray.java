class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int result=max;
        int min=nums[0];

        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int temp=Math.max(curr,Math.max(curr*max,curr*min));

            min=Math.min(curr,Math.min(curr*max,curr*min));
            result=Math.max(result,max);
            max=temp;



        }return result;
        
    }
}
