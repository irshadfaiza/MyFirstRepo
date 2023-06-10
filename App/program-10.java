import java.util.*;
import java.util.io;
class PalindromeProgram
{
public static void checkPalindrome(String s)
{

String reverse = new StringBuffer(s).reverse().toString();
 

if (s.equals(reverse))
System.out.println("Yes, it is a palindrome");
 
else
System.out.println("No, it is not a palindrome");
}
 
public static void main (String[] args)
throws java.lang.Exception
{
checkPalindrome("madam");
}
}