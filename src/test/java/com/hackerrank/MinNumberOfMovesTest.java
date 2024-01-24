package com.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MinNumberOfMovesTest {
    MinNumberOfMoves numberOfMoves = new MinNumberOfMoves();

    @Test
    void see_if_it_works() {
        int moves = MinNumberOfMoves.minimumMoves(List.of(1234, 4567), List.of(2345, 7654));
        Assertions.assertThat(moves).isEqualTo(4);
    }
}