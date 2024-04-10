import java.util.Arrays;
public class Exercise6{
public static void main(String args[]){
int[] array = {1,2,3,2,4,5,3};
System.out.println("original array: " + Arrays.toString(array));
int[] result = removeDuplicates(array);
System.out.println("Array after removing duplicates: "+Arrays.toString(result));
}

public static int[] removeDuplicates(int[] arr)
{
if(arr == null || arr.length == 0){
return arr;
}

Arrays.sort(arr);
int[] result = new int[arr.length];
int previous = arr[0];
result[0] = previous;
int j = 1;
 for(int i = 1; i< arr.length;i++){
if(arr[i] != previous){
result[j]= arr[i];
previous = arr[i];
j++;
}
}
return Arrays.copyOf(result , j);
}
}