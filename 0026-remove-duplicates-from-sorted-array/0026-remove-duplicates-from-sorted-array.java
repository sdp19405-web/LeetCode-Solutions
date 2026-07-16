class Solution {
    public int removeDuplicates(int[] nums) {
        int rd=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[rd]){
                rd++;
                nums[rd]=nums[i];
            }
        }
        return rd+1;
    }
    
}