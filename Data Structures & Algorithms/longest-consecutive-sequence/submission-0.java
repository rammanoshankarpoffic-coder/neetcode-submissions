class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int max = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currlength = 1;
                
                while (set.contains(num + currlength)) {
                    currlength++;
                }

                max = Math.max(max, currlength);
            }
        }

        return max;
    }
}
