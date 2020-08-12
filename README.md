# guess_my_number
Program will guess user's number
Write a program that guesses an integer X in the range 1, . . . , N.
This is an interactive task. When your program starts, the first line of input contains the integer N (1 ≤ N ≤ 109). The value of X is kept secret by the grading system.

Then your program can issue queries by writing them to the output in the form “? P”, where P is an integer (1 ≤ P ≤ N). 
The grading system writes the response in the next line of the input. 
The response is −1 if P < X, 0 if P = X, and 1 if P > X. Your program may issue at most 50 queries in each test case.

When your program wants to guess the number X, it should output “= X” (1 ≤ X ≤ N) and terminate. 
The grading system will not respond to this output and will not accept further queries after that.

To play this game. Construct the class Game and start the game with public startGame() method
