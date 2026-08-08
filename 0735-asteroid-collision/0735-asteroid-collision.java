class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int x : asteroids) {

            boolean alive = true;

            while (alive && x < 0 && !stack.isEmpty() && stack.peek() > 0) {

                int top = stack.peek();

                if (top < -x) {
                    stack.pop();
                }
                else if (top == -x) {
                    stack.pop();
                    alive = false;
                }
                else {
                    alive = false;
                }
            }

            if (alive) {
                stack.push(x);
            }
        }

        int[] result = new int[stack.size()];
        int i = result.length - 1;

        while (!stack.isEmpty()) {
            result[i--] = stack.pop();
        }

        return result;
    }
}