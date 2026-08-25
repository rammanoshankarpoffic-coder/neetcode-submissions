

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        int majorityElement = nums[0];
        int maxCount = 0;
        
        for (int key : map.keySet()) {
            int currentCount = map.get(key);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                majorityElement = key;
            }
        }
        
        return majorityElement;
    }
}
