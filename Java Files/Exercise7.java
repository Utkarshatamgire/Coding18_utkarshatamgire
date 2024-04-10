import java.util.Arrays;
public class Exercise7{
public static void main(String args[]){
String str1 = "listen";
String str2 = "silent";

boolean isAnagram = checkAnagram(str1 , str2);
if(isAnagram){
System.out.println(str1 + "and" +str2+ "are anagrams");
}else{
System.out.println(str1 + "and" +str2+ "are not anagrams");
}
}

public static boolean checkAnagram(String str1 , String str2){
if(str1 == null || str2 == null|| str1.length() != str2.length())
{
return false;
}

char[] charArray1 = str1.toCharArray();
char[] charArray2 = str2.toCharArray();

Arrays.sort(charArray1);
Arrays.sort(charArray2);

return Arrays.equals(charArray1 , charArray2);
}
}