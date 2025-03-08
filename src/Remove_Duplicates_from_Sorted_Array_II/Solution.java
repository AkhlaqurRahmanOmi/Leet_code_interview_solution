package Remove_Duplicates_from_Sorted_Array_II;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // Edge case: array has <= 2 elements

        int k = 2; // Pointer for valid elements (start from 2)

        // Iterate through the array
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) { // Check if current element is valid
                nums[k] = nums[i]; // Place the valid element at position k
                k++; // Increment the valid element pointer
            }
        }

        return k; // Return the count of valid elements
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 1, 1, 2, 2, 3};

        // Call the removeDuplicates method
        int k = removeDuplicates(nums);

        // Print the result
        System.out.println("k = " + k); // Output the count of valid elements
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