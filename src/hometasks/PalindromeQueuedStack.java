package hometasks;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class PalindromeQueuedStack {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedBlockingQueue<>();

        myQueue.add(4);
        myQueue.add(2);
        myQueue.add(-1);
        myQueue.add(8);

        System.out.println(myQueue.remove());

        Stack<Character> myStack = new Stack<>();
        myStack.add((char) 27);
        myStack.add('a');
        myStack.add('&');

        System.out.println(myStack.pop());

        isPalindrome("Abba");
        isPalindrome("Red apple");
        isPalindrome("Eva, can I see bees in a cave?");
    }

    public static void isPalindrome(String input) {
        System.out.println("Word to check out:" + input);
        Queue<Character> myQueue = new LinkedBlockingQueue<>();
        Stack<Character> myStack = new Stack<>();
        for ( Character character :  input.toLowerCase().replaceAll("[^a-z]", "").toCharArray()){
            myQueue.add(character);
            myStack.add(character);
        }
        for ( int i= 0; i < input.length()/2 ;i ++ ){
            if (!myQueue.remove().equals(myStack.pop())){
                System.out.println("Not a palindrome!");
                return;}}
        System.out.println("It is a palindrome!");
    }

}


