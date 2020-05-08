package com.mx.java9.features._interface._private._methods;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class CustomCalculator {
    int addEvenNumbers(int... nums) {
        return add(n -> n % 2 == 0, nums);
    }

    int addOddNumbers(int... nums) {
        return add(n -> n % 2 != 0, nums);
    }

    private int add(IntPredicate predicate, int... nums) {
        return IntStream.of(nums)
                .filter(predicate)
                .sum();
    }
}
