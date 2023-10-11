import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;

public class MajorityElement {
    Map<Integer, Integer> counter = new HashMap<>();

    public int majorityElement(int[] nums) {
        for (int num : nums) {
            if (counter.containsKey(num)) {
                Integer occurrence = counter.get(num);
                counter.put(num, occurrence + 1);
            } else {
                counter.put(num, 1);
            }
        }
        return Collections.max(counter.entrySet(), comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int maxElement = majorityElement.majorityElement(new int[]{3, 2, 3});
        System.out.println(maxElement);
    }
}

