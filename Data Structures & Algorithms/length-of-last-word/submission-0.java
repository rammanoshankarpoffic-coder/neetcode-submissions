class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        int n = words.length;
        int j = n-1;
        String s1 = words[j];
        return s1.length();

        
    }
}