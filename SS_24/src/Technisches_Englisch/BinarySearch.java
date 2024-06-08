package Technisches_Englisch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Print the current step
            System.out.println("Checking element at index " + mid);

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                System.out.println("Target is higher, moving right");
                left = mid + 1;
            } else {
                System.out.println("Target is lower, moving left");
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15};
        int target = 9;
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}


