# testableSGT

This is an intro test repo, to show a simple code base. For git commands you can
see : https://education.github.com/git-cheat-sheet-education.pdf

For git security
setup: https://docs.github.com/en/github/authenticating-to-github/keeping-your-account-and-data-secure/creating-a-personal-access-token

This will be a testable code base where some introduction java code will live. Intro code:

* Hello world + input args output initial
* Basic variables intro class
* Primitive variable data type handling
* Initial casting of variable types
* Reference variables
* IF - ELSE conditional statements
* Arrays

<br> 
<b>homework Descriptions:</b>

1) Create a new class (name as you think is the best OR you can also use the ReferenceVariables
   class). This class should hold 3 pre-defined variables that are the values to convert metric to
   imperial measurements. This class should have a constructor(
   s) - generate them using InteliJ IDEA built in actions (right-click in class -> generate ->
   constructor -> select fields for constructor -> ok)
   . Write functions that convert metrics. They should just be public void and print out the
   results, each function receives a numeric value of the value to be converted. In main method
   create the new class object with constructor passing the needed values, call the conversion
   functions. If you want a bigger challenge - you can add more variables and functions conversions.

2) Create a game where the computer selects randomly a number in some range (0-100 for example) and
   you need to guess it. Using only if statements (no loops) create game that allows guessing until
   you manage to find the number. To allow for better guessing experience, let the user know if the
   guess was correct, and if the guess was larger or smaller than the thought of number, in case the
   number was not guessed correctly. For more of a challenge: count how many times the user tried to
   guess the number and show it at the end.
3) Create A bird recognition program, based on previous given util-> Bird class. Using an if-else
   conditional chain determine what kind of bird it might be (4 original birds given are Emu, Swan,
   Stork and Penguin) and create an output. Output creation should be done with another function and
   using switch structure. Print out some interesting bird facts about the detected bird. Add a
   fifth (or more) bird type and see how the detection changes. Check if you can optimise your
   if-else statements.
4) In the created Questions APP : Create an Answers class, with following variables: text,
   creationDateTime, user, likes, dislikes, acceptedAnswer, questionsIdentifier. Generate a
   constructor and a toString method. Add a selection on Main Menu, to show a newly created Answer (
   for now just some default hardcoded values just like the question).
5) In the MainMenu class update the menu to allow for Answer creation, for specified question. Use
   some predefined questions for now.For each question a selection needs to be done, using switch.
   On default (not defined question number) give information to user that the question was not found
   and return to the main menu. Update, if needed, Answer and Question classes with getter/setter
   methods for any internal variables you want to access individually.
6) Within package loops, find the file LoopsExamples. Fill in the logic of the already defined
   functions there, based on their names. To double-check your results you can run the tests of the
   class. They should show green if the function is implemented correctly (based on the names of the
   tests).
7) A word is a palindrome if it can be read the same both forward and backward. Create a function in
   class "LoopsSecondExamples" named isStringPalindrome(String input) that can determine if a String
   is a palindrome. (Test values like "otto" and "palindromeemordnilap")
8) Write a triangular multiplication printing function.
9) Write a "search answers" QuestionApp function, that takes a string values from user input and
   goes through all of the questions and in each answer text checks if the searched string is
   contained. The function then returns an array or a string with the found answer texts (as you
   choose).
10) Write a histogram (vertical) based on the following approach: The incoming data should be
    organized as an array of numbers. Convert the numbers in array to the percentages, by summing
    all the values in the array and for each element in array setting a new value as ({value of
    element} / {total sum of all elements})*100 . Set up a description of what is shown and one of
    the axis as the first line(s).For each element of the input array, print out the index of the
    element and corresponding number of characters representing the percentage value. The output
    values showing percentages are consistent with the first line printed axis values. For
    convinience the percentage numbers should be rounded to whole numbers.

Exercises  :

* Create a function that calculates a Fibonacci number :
  fibonacci 1 = 1 ; fibonacci 2 = 1 ; fibonacci n = fibonacci n − 1 + fibonacci n − 2
* Write a method named isDivisible that takes two integers, n and m, and that returns true if n is
  divisible by m, and false otherwise.
* If you are given three sticks, you may or may not be able to arrange them in a triangle. For
  example, if one of the sticks is 12 cm long and the other two are one cm long, you will not be
  able to get the short sticks to meet in the middle. For any three lengths, there is a simple test
  to see if it is possible to form a triangle:
  <b> If any of the three lengths is greater than the sum of the other two, you cannot form a
  triangle. </b>
  Write a method named isTriangle that takes three integers as arguments and returns either true or
  false, depending on whether you can or cannot form a triangle from sticks with the given lengths.
  The point of this exercise is to use conditional statements to write a value method.
* Update the files in the "notTo" package to make them more understandable. Remember all the
  optimisation options discussed before.
* Create drawings of Venn diagrams (see "BooleanVenn.png" file in images folder for examples) for
  the following boolean expressions:
    * (!B && A) || (C && !A)
    * (A && C && B) || (C && !B)
    * !(B && C) || !A
    * (A && C && !B) || (A && B && !C)
* Using the drawings in image folder (Venn.png) write the corresponding boolean expressions.
* Create a new class that holds a sudoku board. Fill it with a starting position for the game (can
  be just taken from the internet).

<b> Additional information sources </b> <br>

* Explanation of the scanner issue of next string after nextInt:
  https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/