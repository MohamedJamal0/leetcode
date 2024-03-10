package arrays_hashing;

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Boolean> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int number = nums[i];
            if (hashmap.containsKey(number)) return true;
            hashmap.put(number, true);

        }


        return false;
    }
}
