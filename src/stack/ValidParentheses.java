package stack;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack1 = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack1.push(c);
                continue;
            }
            ;

            if (stack1.empty()) return false;

            char top = stack1.peek();

            if (c == ')' && top == '(' || c == ']' && top == '[' || c == '}' && top == '{') {
                stack1.pop();
            } else {
                return false;
            }

        }


        if (!stack1.empty()) return false;

        return true;

    }


}
