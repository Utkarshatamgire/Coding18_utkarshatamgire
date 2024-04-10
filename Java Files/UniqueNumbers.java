import java.util.*;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 9, 3, 4};
        System.out.println("Original array: ");
        printArray(array);
        System.out.println("\nUnique numbers: ");
        printUniqueNumbers(array);
    }

    public static void printUniqueNumbers(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        for (int uniqueNum : uniqueSet) {
            System.out.print(uniqueNum + " ");
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
