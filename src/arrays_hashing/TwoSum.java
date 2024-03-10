package arrays_hashing;

import java.sql.Array;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];

            if (map1.containsKey(target - currentNumber)) {

                result[0] = map1.get(target - currentNumber);
                result[1] = i;

            }

            map1.put(currentNumber, i);

        }

        return result;


    }
}
