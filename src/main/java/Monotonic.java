import java.util.HashSet;
import java.util.Set;

public class Monotonic {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false;
            } else if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }
        }
        return !(increasing == true && decreasing == true);
    }
}




