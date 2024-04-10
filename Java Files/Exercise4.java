import java.util.Arrays;
public class Exercise4
{
public static void main(String args[])
{
int[] array = {1,2,3,4,5};
System.out.println("original array: "+Arrays.toString(array));
rotateLeft(array);
System.out.println("Array after left rotation: " + Arrays.toString(array));
}

public static void rotateLeft(int[] arr)
{
if(arr == null || arr.length <= 1)
{
return;
}
int temp = arr[0];
for(int i = 0 ;i < arr.length -1 ; i++){
arr[i] = arr[i+1];
}
arr[arr.length - 1] = temp;
}
}