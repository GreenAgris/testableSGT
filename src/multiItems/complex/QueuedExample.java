package multiItems.complex;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class QueuedExample {


    public static void main(String[] args) {
       String input1 = "Was it a car or a cat I saw?";
       String input2 = "Momy!";
       String input3 = "Yo, 2 banana boy!";
        isItPalindrome(input1);
        isItPalindrome(input2);
        isItPalindrome(input3);
    }

    public static void isItPalindrome(String input){
        Queue<Character> myQueue = new LinkedBlockingQueue<>();
        Stack<Character> myStack = new Stack<>();
        System.out.print(input + " ---> ");
        for (Character ch : input.toLowerCase()
            .replaceAll("[^a-z]", "").toCharArray()){
            myQueue.add(ch);
            myStack.add(ch);
        }
        int max = myQueue.size();
        for (int i = 0; i <  max ; i++) {
            if (!myQueue.remove().equals(myStack.pop())){
                System.out.println("Not a palindrome!");
                return;
            }
        }
        System.out.println("It is a palindrome!");
    }
}
