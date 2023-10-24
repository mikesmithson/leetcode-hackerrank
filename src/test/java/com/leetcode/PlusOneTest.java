package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PlusOneTest {

    private PlusOne plusOne = new PlusOne();

    @Test
    void number_that_doesnt_end_in_9_returns_correct_result() {
        assertThat(plusOne.plusOne(new int[]{1,2,3,4})).isEqualTo(new int[]{1,2,3,5});
    }

    @Test
    void number_49_gives_correct_result_no_resize_needed() {
        assertThat(plusOne.plusOne(new int[]{4,9})).isEqualTo(new int[]{5,0});
    }

    @Test
    void number_99_gives_correct_result_resize_needed() {
        assertThat(plusOne.plusOne(new int[]{9,9})).isEqualTo(new int[]{1,0,0});
    }

}