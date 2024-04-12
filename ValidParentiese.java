import javax.swing.text.html.HTMLDocument;
import java.util.Stack;

public class ValidParentiese {

    public static void main(String[] args) {
        String s = "[{(({}))}]";
        System.out.println(validParenthiese(s));
      //  System.out.println(isValid(s));
    }

    public static  boolean validParenthiese(String s){
        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c=='(' || c == '{' || c == '['){
                stack.add(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
              char top = stack.peek();
                if((c == ')' && top != '(') || (c=='}' && top != '{') || (c==']' && top !='[')){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();


    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    return false; // More closing parentheses encountered before opening ones
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false; // Mismatched closing parenthesis
                }
            }
        }

        return stack.isEmpty(); // Check if all opening parentheses are matched by closing ones
    }
}
