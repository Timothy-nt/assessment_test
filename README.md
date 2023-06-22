Assessments Q1

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

Assessments Q2

Explanation:

The function findLargestDifference takes a List<Integer> as input and returns the largest difference between any two numbers in the list.
The function first checks if the list has less than two elements. In such cases, it returns 0 since there are not enough numbers to calculate a difference.
The function initializes min as the first number in the list and maxDiff as the difference between the second number and the first number.
It then iterates through the list starting from the second element.
In each iteration, it calculates the difference between the current number and the minimum number seen so far (diff).
If the calculated difference is greater than the current maximum difference (maxDiff), it updates maxDiff accordingly.
If the current number is less than the current minimum number (min), it updates min to the current number.
After iterating through the entire list, the function returns the maximum difference found.
This implementation has a time complexity of O(n), where n is the size of the input list. It handles lists of any size and accounts for duplicates. It also handles the edge case of a list with less than two elements by returning 0.

Assessments Q3





