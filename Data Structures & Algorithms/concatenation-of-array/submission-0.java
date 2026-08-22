class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        int[] arr = new int[2*n];
        for(int i = 0;i<nums.length;i++){
            list.add(nums[i]);
            list1.add(nums[i]);
        }
        list.addAll(list1);
        for(int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;

        
    }
}