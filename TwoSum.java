import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each number
        for (int i = 0; i < nums.length; i++) {
            // For each number, check all subsequent numbers
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum of nums[i] and nums[j] equals the target, return their indices
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // If no solution is found (which shouldn't happen as per problem statement)
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read input
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();

        int[] nums = new int[n]; // Array to hold the numbers
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println("Enter the target:");
        int target = in.nextInt();

        // Create an instance of Solution and call the twoSum method
        Solution obj = new Solution();
        int[] result = obj.twoSum(nums, target); // Get the result
        
        // Print the result (indices of the two numbers that add up to the target)
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}