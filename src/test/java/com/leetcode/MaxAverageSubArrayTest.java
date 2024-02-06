package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxAverageSubArrayTest {
    private MaxAverageSubArray maxAverageSubArray = new MaxAverageSubArray();
    @Test
    void given_an_array_return_correct_max_average() {
        int[] nums = new int[]{1,12,-5,-6,50,3};
        int size = 4;
        double maxAverage = maxAverageSubArray.findMaxAverage(nums, size);
        assertThat(maxAverage).isEqualTo(12.75);
    }
    @Test
    void given_an_array_of_one_gives_correct_max_average() {
        int[] nums = new int[]{5};
        int size = 1;
        double maxAverage = maxAverageSubArray.findMaxAverage(nums, size);
        assertThat(maxAverage).isEqualTo(5.0);
    }

}