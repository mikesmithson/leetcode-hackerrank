package com.hackerrank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();
    @Test
    void fiibonacci_1_returns_1() {
        assertThat(fibonacci.fibonacci(1)).isEqualTo(1);
    }

    @Test
    void fiibonacci_0_returns_0() {
        assertThat(fibonacci.fibonacci(0)).isEqualTo(0);
    }

    @Test
    void fiibonacci_2_returns_1() {
        assertThat(fibonacci.fibonacci(2)).isEqualTo(1);
    }
 @Test
    void fiibonacci_3_returns_2() {
        assertThat(fibonacci.fibonacci(3)).isEqualTo(2);
    }

    @Test
    void fiibonacci_19_returns4181() {
        assertThat(fibonacci.fibonacci(19)).isEqualTo(4181);
    }

}