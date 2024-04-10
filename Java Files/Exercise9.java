public class Exercise9{
public static void main(String args[])
{
int number = 153;
boolean isArmstrong = checkArmstrong(number);
if(isArmstrong){
System.out.println(number +" is an armstrong number");
}else{
System.out.println(number +"is not an armstrong number");
}
}

public static boolean checkArmstrong(int num){
int originalNumber = num;
int sum = 0;
while(num > 0){
int digit = num % 10;
sum += Math.pow(digit , 3);
num /= 10;
}
return sum == originalNumber;
}
}