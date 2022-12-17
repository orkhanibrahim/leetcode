/*
* Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?*/

import java.util.Scanner;

public class Palindromechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check if it is palindrome");
        System.out.println(isPalindrome(sc.nextInt()));;
    }
    public static boolean isPalindrome(int x){
        /// int x = 583
        int original = x;
        int remainder;
        int reversed = 0;
        while(x>0){
            remainder = x % 10; //3=>8=>5
            x = x/10; // =>58 =>5=>0
            reversed = reversed * 10 + remainder; //0*10+3=3 =>38=>385
        }
        if(original == reversed){
            return true;
        }
        else {
            return false;
        }
    }
}

