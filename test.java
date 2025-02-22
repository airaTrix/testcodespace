import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("original array: " + Arrays.toString(original));
        
        int[] disabledOdds = disableOddIndices(original);
        System.out.println("After disabling odd indices: " + Arrays.toString(disabledOdds));

        int newElement = 60;
        int[] withNewElement = addElement(disabledOdds, newElement);
        System.out.println("After adding new element: " + Arrays.toString(withNewElement));

        int[] finalArray = keepEvenIndices(withNewElement);
        System.out.println("Final array (even indices only): " + Arrays.toString(finalArray));
    }

    public static int[] disableOddIndices(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 1; i < result.length; i += 2) {
            result[i] = 0;
        }
        return result;
    }

    public static int[] addElement(int[] arr, int element) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1); // Create new array with +1 size
        newArr[arr.length] = element; // Add new element at the end
        return newArr;
    }

    // Keep only even-indexed elements
    public static int[] keepEvenIndices(int[] arr) {
        int newLength = (arr.length + 1) / 2; // Number of even-indexed elements
        int[] result = new int[newLength];
        int resultIndex = 0;
        for (int i = 0; i < arr.length; i += 2) { // Start at 0, step by 2
            result[resultIndex++] = arr[i];
        }
        return result;
    }
}
