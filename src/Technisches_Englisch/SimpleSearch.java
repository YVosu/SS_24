package Technisches_Englisch;

public class SimpleSearch {
    public static int simpleSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            // Print the current step
            System.out.println("Checking element at index " + i);

            if (arr[i] == target) {
                return i; // Return the index if target is found
            } else if (arr[i] > target) {
                System.out.println("Target is lower than element at index " + i);
            } else {
                System.out.println("Target is higher than element at index " + i);
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int target = 8;
        int index = simpleSearch(arr, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}
