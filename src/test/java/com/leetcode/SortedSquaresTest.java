package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortedSquaresTest {
    private final SortedSquares sortedSquares = new SortedSquares();
    @Test
    void given_an_array_sorted_ascending_sort_the_square_of_the_numbers() {
        int[] array = new int[]{-4,-1,0,3,10};
        assertThat(sortedSquares.sortedSquares(array)).isEqualTo(new int[]{0,1,9,16,100});
    }

}