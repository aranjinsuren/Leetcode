package Easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Create a set to store the numbers
        Set<Integer> set = new HashSet<Integer>();
        boolean temp;
        for (int num : nums){
            temp = set.add(num);
            // If temp is false, it means that the number is already in the set
            if (!temp){
                return true;
            }
        }
        // If the loop ends, it means that there are no duplicates
        return false;
    }
}
