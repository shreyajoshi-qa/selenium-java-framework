package com.shreya.tests;

import org.testng.annotations.Test;

public class ParallelTest {

    @Test
    public void parallelTestOne() {
        System.out.println("Test One Thread: " + Thread.currentThread().getId());
    }

    @Test
    public void parallelTestTwo() {
        System.out.println("Test Two Thread: " + Thread.currentThread().getId());
    }

    @Test
    public void parallelTestThree() {
        System.out.println("Test Three Thread: " + Thread.currentThread().getId());
    }
}