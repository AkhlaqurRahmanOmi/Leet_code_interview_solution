package Remove_Duplicate_From_Sorted_Array;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        int k = 1; // Pointer for unique elements (start from 1)

        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check if current element is unique
                nums[k] = nums[i]; // Place the unique element at position k
                k++; // Increment the unique element pointer
            }
        }

        return k; // Return the count of unique elements
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        // Call the removeDuplicates method
        int k = removeDuplicates(nums);

        // Print the result
        System.out.println("k = " + k); // Output the count of unique elements
        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}