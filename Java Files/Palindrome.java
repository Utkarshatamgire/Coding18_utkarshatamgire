import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number to check if it is a palindrome: ");
int number = sc.nextInt();
if(isPalindrome(number))
{
System.out.println(number + "is a palindrome");
}
else
{
System.out.println(number + "is not a palindrome");
}
}

public static boolean isPalindrome(int number)
{
int originalNumber = number;
int reverse = 0;
while(number != 0){
int remainder = number % 10;
reverse = reverse* 10 + remainder;
number /= 10;
}
return originalNumber == reverse;
}
}