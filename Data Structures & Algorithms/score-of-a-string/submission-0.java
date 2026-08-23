class Solution {
    public int scoreOfString(String s) {
        int total = 0;
        for(int i = 0;i<s.length()-1;i++){
            char firstchar = s.charAt(i);
            char secondchar = s.charAt(i+1);

            int difference = Math.abs(firstchar - secondchar);
            total = total + difference;
        }
        return total;
    }
}