package Easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        boolean temp;
        for (int num : nums){
            temp = set.add(num);
            if (!temp){
                return true;
            }
        }
        return false;
    }
}
