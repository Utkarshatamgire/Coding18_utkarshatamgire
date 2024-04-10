import java.util.Arrays;
public class Exercise5
{
public static void main(String args[])
{
int[] array = {1,2,3,4,5};
int k = 2;
System.out.println("original array: "+Arrays.toString(array));
System.out.println("rotate by" + k + "positions to the left: ");
rotateLeft(array , k);
System.out.println("Array after left rotation: " + Arrays.toString(array));
}

public static void rotateLeft(int[] arr , int k){
if(arr == null || arr.length <= 1 || k <= 0){
return;
}

int n = arr.length;
k = k % n;
reverseArray(arr,0,k -1);
reverseArray(arr , k ,n-1);
reverseArray(arr , 0 ,n-1);
}

public static void reverseArray(int[] arr , int start ,int end)
{
while(start < end){
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
}
}
}