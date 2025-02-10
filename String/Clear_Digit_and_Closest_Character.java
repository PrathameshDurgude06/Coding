package String;

import java.util.Stack;

public class Clear_Digit_and_Closest_Character {
    public static String removeDigits(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Remove the closest non-digit character to the left (if exists)
                if (!stack.isEmpty() && !Character.isDigit(stack.peek())) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        // Convert stack to final string result
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDigits("abc"));   // Output: "abc"
        System.out.println(removeDigits("cb34"));  // Output: ""
        System.out.println(removeDigits("a1b2c3")); // Output: ""
        System.out.println(removeDigits("x9yz8a7")); // Output: "yz"
    }
}
