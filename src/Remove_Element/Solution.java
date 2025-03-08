package Remove_Element;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for valid elements

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // Place the valid element at position k
                nums[k] = nums[i];
                k++; // Increment the valid element pointer
            }
        }

        return k; // Return the count of valid elements
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        // Call the removeElement method
        int k = removeElement(nums, val);

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