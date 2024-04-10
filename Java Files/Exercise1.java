import java.util.*;
public class Exercise1
{
public static void main(String args[])
{
int[] nums = {5,7,2,4,9};
int ctr_even = 0 , ctr_odd = 0;
System.out.println("OriginalArray: " + Arrays.toString(nums));
for(int i = 0; i<nums.length;i++){
if(nums[i]%2==0){
ctr_even++;
}else{
ctr_odd++;
}
}

System.out.println("Number of even elements in the array: " + ctr_even);
System.out.println("Number of odd elements in the array: " + ctr_odd);
System.out.print("\n");
}
}