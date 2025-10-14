public class LinearSearch {

    public static int search(int[] arr, int target) {
        // Iterate through the array from the beginning
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the target, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // If the target element is not found after checking all elements, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 25, 5, 40, 15, 30 };
        int target1 = 15;
        int target2 = 50;

        int index1 = search(numbers, target1);
        if (index1 != -1) {
            System.out.println("Element " + target1 + " found at index: " + index1);
        } else {
            System.out.println("Element " + target1 + " not found in the array.");
        }

        int index2 = search(numbers, target2);
        if (index2 != -1) {
            System.out.println("Element " + target2 + " found at index: " + index2);
        } else {
            System.out.println("Element " + target2 + " not found in the array.");
        }
    }
}