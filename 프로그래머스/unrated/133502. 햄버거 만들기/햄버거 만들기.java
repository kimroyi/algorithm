import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] foodOrder = {1, 2, 3, 1};
        int count = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            int size = stack.size();

            if (size >= 4
                    && stack.get(size-4) == foodOrder[0]
                    && stack.get(size-3) == foodOrder[1]
                    && stack.get(size-2) == foodOrder[2]
                    && stack.get(size-1) == foodOrder[3] ) {

                answer++;

                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();

            }
        }
        return answer;
    }
}