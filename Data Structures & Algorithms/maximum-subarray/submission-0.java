class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null||nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int current_max =0;

        for(int num : nums){
            current_max +=num;
            if(current_max>max){
                max=current_max;
            }
            if(current_max<0){
                current_max=0;
            }
        }
        return max;
        
    }
}
