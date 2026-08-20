
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") ||
                    tokens[i].equals("*") || tokens[i].equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                if (tokens[i].equals("+")) {
                    result = a + b;
                }
                else if(tokens[i].equals("-")){
                    result = a - b;
                }
                else if(tokens[i].equals("*")){
                    result = a * b;
                }
                else if(tokens[i].equals("/")){
                    result = a / b;
                }
                stack.push(result);

            }
            else{
                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            }

        }
        return stack.pop();

    }
}
