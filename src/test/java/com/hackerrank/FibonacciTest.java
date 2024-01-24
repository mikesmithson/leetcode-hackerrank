package com.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();
    @Test
    void fiibonacci_1_returns_1() {
        assertThat(fibonacci.calculateFibonacci(1)).isEqualTo(1);
    }

    @Test
    void fiibonacci_0_returns_0() {
        assertThat(fibonacci.calculateFibonacci(0)).isEqualTo(0);
    }

    @Test
    void fiibonacci_2_returns_1() {
        assertThat(fibonacci.calculateFibonacci(2)).isEqualTo(1);
    }
 @Test
    void fiibonacci_3_returns_2() {
        assertThat(fibonacci.calculateFibonacci(3)).isEqualTo(2);
    }

    @Test
    void fiibonacci_19_returns4181() {
        assertThat(fibonacci.calculateFibonacci(19)).isEqualTo(4181);
    }

    @Test
    void see_if_I_can_get_results() {
        assertThat(fibonacci.fibonacci(4)).isEqualTo(List.of(0,1,1,2));
    }
}