import java.util.Scanner;
import java.util.Stack;

/**
 * poltek17
 */
public class poltek17 {

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.print("Insert sentence : ");
        String sentence = sc17.nextLine();
        
        String reversedSentence = reverseSentence(sentence);
        System.out.println("Result: " + reversedSentence);
    }

    public static String reverseSentence(String sentence) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < sentence.length(); i++) {
            stack.push(sentence.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            }
            return reversed.toString();
    }

}