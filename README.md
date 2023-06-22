Task 1
Explanation:
The program starts by creating a Scanner object to read user input.
The main method calls the getValidInput method to get a positive integer from the user.
The getValidInput method repeatedly prompts the user for input until a valid positive integer is entered. It catches NumberFormatException if the input cannot be parsed as an integer.
Once a valid input is obtained, the printFibonacciSequence method is called to generate and print the Fibonacci sequence up to the given number.
The printFibonacciSequence method uses a while loop to generate and print the Fibonacci numbers. It starts with previous set to 0 and current set to 1.
In each iteration of the loop, it prints the current number, calculates the next number by adding previous and current, and updates previous and current accordingly.
The loop continues until the current number exceeds the given input number.
Finally, the program closes the Scanner object.
The program handles invalid input by displaying appropriate error messages and asking the user to enter a valid positive integer. It also ensures modularity by separating the input validation and Fibonacci sequence generation into separate methods

Task 2
