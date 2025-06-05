package Stacks;

import java.util.*;

public class StackLeetcode {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>(
                Map.of(
                        ')', '(',
                        '}', '{',
                        ']', '['));
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    System.out.println("Not balanced");
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int maxDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                maxDepth = Math.max(maxDepth, stack.size());
            } else if (c == ')') {
                stack.pop();
            }
        }
        return maxDepth;
    }

    public static int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>(
                Map.of(
                        ')', '(',
                        '}', '{',
                        ']', '['));
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }

    public static int[] maxDepthAfterSplit(String seq) {
        Stack<Integer> stack = new Stack<>();
        int dept = 0;
        for (char c : seq.toCharArray()) {
            if (c == '(') {
                dept += 1;
                stack.push(dept % 2);
            } else {
                stack.push(dept % 2);
                dept -= 1;
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {

        // System.out.println(isValid("()"));
        // System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        // System.out.println(minAddToMakeValid("(()))))"));
        System.out.println(Arrays.toString(maxDepthAfterSplit("(()())")));
    }
}
