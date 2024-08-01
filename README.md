# Exception.java

Given two integers A and B.

Write a program to print the result of A divided by B.

Input

The input will be a single line containing two space-separated strings, denoting the values of A and B.

Output

The output should be a single line containing the result of A divided by B. In the case of Arithmetic Exception, print the message "Denominator can't be 0".

In the case of NumberFormatException, print the message "Input should be an integer".

Explanation

For example, if the given A and B are 5 and 0, ArithmeticException will be raised as five cannot be divided by O. So the output should be "Denominator can't be 0".

For example, if the given A and B are 12 and a, NumberFormatException will be raised as the value of B is not an integer. So the output should be "Input should be an integer".

Sample Input 1

50

Sample Output 1

Denominator can't be 0

Sample Input 2

12 a

Sample Output 2

Input should be an integer
