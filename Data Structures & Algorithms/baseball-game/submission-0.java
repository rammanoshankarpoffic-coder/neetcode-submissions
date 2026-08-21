
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();

                stack.push(last);
                stack.push(last + secondLast);

            } else if (operations[i].equals("D")) {
                int n = stack.peek() * 2;
                stack.push(n);

            } else if (operations[i].equals("C")) {
                stack.pop();

            } else {
                int num = Integer.parseInt(operations[i]);
                stack.push(num);
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}