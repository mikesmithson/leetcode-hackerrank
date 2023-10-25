package com.leetcode;

import com.leetcode.Monotonic;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MonotonicTest {
    private Monotonic monotonic = new Monotonic();

    @Test
    public void given_1_3_2_return_false() {
        int[] nums = new int[]{1,3,2};
        assertThat(monotonic.isMonotonic(nums)).isFalse();
    }


    @Test
    public void given_1_1_1_return_true() {
        int[] nums = new int[]{1,1,1};
        assertThat(monotonic.isMonotonic(nums)).isTrue();
    }
}
