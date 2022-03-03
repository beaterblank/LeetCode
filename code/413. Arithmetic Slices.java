class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)return 0;
        int slices = 0;
        int total = 0;
        for(int i=2;i<nums.length;i++){
            total += (nums[i]-nums[i-1] == nums[i-1]-nums[i-2])?(slices+=1):(slices=0);
        }
        return total;
    }
}
