import java.util.Stack;

class Solution {
    public String solution(int[] food) {
        String result = "";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < food.length; i++) {
            int temp = food[i] / 2;
            if (temp > 0) {
                for (int j = 0; j < temp; j++) {
                    result += String.valueOf(i);
                    stack.push(String.valueOf(i));
                }
            }
        }

        result += "0";
        int stackLength = stack.size();
        for (int k = 0; k < stackLength; k++) {
            result += stack.pop();
        }

        return result;
    }
}