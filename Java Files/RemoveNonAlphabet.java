import java.util.Scanner;
public class RemoveNonAlphabet{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string: ");
String input = sc.nextLine();
String result = removeNonAlphabets(input);
System.out.println("String after removing non-alphabetic characters: "+result);
}

public static String removeNonAlphabets(String str)
{
StringBuilder sb=new StringBuilder();
for(int i = 0;i < str.length();i++){
char ch = str.charAt(i);
if(Character.isLetter(ch))
{
sb.append(ch);
}
}
return sb.toString();
}
}