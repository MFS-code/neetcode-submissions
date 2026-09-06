class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();

        for (Character x : s.toCharArray()) {
            if (stack.isEmpty()) stack.push(x);
            else {
                if (match(stack.peek(), x)) stack.pop();
                else stack.push(x);
            }
        }

        return stack.isEmpty();
    }

    public boolean match(char x, char y) {
        return ((x == '(' && y == ')') ||
                (x == '{' && y == '}') ||
                (x == '[' && y == ']'));
    }
}
