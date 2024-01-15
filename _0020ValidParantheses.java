import java.util.Stack;

class _0020ValidParantheses {

    public static void main(String[] args) {
        System.out.println("()[]{} is valid: " + isValid("()[]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            if (stack.empty()) {
                stack.push(character);
                continue;
            }

            Character lastCharacter = stack.peek();
            if ((lastCharacter == '(' && character == ')') ||
                    (lastCharacter == '[' && character == ']') ||
                    (lastCharacter == '{' && character == '}')) stack.pop();
            else stack.push(character);
        }

        return stack.empty();
    }
}