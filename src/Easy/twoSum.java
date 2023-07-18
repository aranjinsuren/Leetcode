package Easy;

import java.util.HashMap;
import java.util.Map;

// 1. Two Sum
// https://leetcode.com/problems/two-sum/
public class twoSum {
    public int[] Solution(int[] nums, int target) {
        // Create a hashmap to store the numbers
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Store the numbers in the hashmap
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }
        // Loop through the array and check if the difference is in the hashmap
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (numMap.containsKey(diff) && numMap.get(diff) != i) {
                // Return the indices
                return new int[]{i, numMap.get(diff)};
            }
        }
        // If the loop ends, it means that there are no solutions
        return new int[]{};
    }

    // Runtime - O(n)
    
}
