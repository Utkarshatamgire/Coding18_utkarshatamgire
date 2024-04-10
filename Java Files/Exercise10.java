public class Exercise10{
public static void main(String args[]){
String str = "Hello world";
int[] counts = countVowelsAndConsonants(str.toLowerCase());
int vowelsCount = counts[0];
int consonantCount = counts[1];

System.out.println("Number of vowels: " +vowelsCount);
System.out.println("Number of consonants: " +consonantCount);
}

public static int[] countVowelsAndConsonants(String str){
int[] counts = new int[2];
for(int i = 0;i < str.length();i++){
char ch = str.charAt(i);
if(Character.isLetter(ch)){
if(isVowel(ch)){
counts[0]++;
}else{
counts[1]++;
}
}
}
return counts;
}
public static boolean isVowel(char ch){
ch = Character.toLowerCase(ch);
return ch == 'a' || ch == 'e'  || ch == 'i' || ch == 'o' || ch == 'u';
}
}

