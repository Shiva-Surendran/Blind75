class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hp=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hp.contains(nums[i])){
                return true;
            }
            else{hp.add(nums[i]);}
        }
        return false;
        
    }
}
