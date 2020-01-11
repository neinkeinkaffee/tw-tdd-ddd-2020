package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzWhizzTest {
    @Test
    public void shouldReturn1For1() {
        assertEquals("1", FizzBuzzWhizz.fizzBuzz(1));
    }

    @Test
    public void shouldReturn2For2() {
        assertEquals("2", FizzBuzzWhizz.fizzBuzz(2));
    }

    @Test
    public void shouldReturnFizzFor3() {
        assertEquals("Fizz", FizzBuzzWhizz.fizzBuzz(3));
    }

    @Test
    public void shouldReturnFizzForMultipleOf3() {
        assertEquals("Fizz", FizzBuzzWhizz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzzWhizz.fizzBuzz(9));
        assertEquals("Fizz", FizzBuzzWhizz.fizzBuzz(12));
    }

    @Test
    public void shouldReturnBuzzForMultipleOf5() {
        assertEquals("Buzz", FizzBuzzWhizz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzzWhizz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzzWhizz.fizzBuzz(20));
    }

    @Test
    public void shouldReturnWhizzForMultipleOf7() {
        assertEquals("Whizz", FizzBuzzWhizz.fizzBuzz(7));
        assertEquals("Whizz", FizzBuzzWhizz.fizzBuzz(14));
        assertEquals("Whizz", FizzBuzzWhizz.fizzBuzz(28));
    }

    @Test
    public void shouldReturnFizzBuzzForMultipleOf3And5() {
        assertEquals("FizzBuzz", FizzBuzzWhizz.fizzBuzz(60));
    }

    @Test
    public void shouldReturnBuzzWhizzForMultipleOf5And7() {
        assertEquals("BuzzWhizz", FizzBuzzWhizz.fizzBuzz(140));
    }

    @Test
    public void shouldReturnFizzWhizzForMultipleOf3And7() {
        assertEquals("FizzWhizz", FizzBuzzWhizz.fizzBuzz(21));
    }

    @Test
    public void shouldReturnFizzWhizzForMultipleOf3And5And7() {
        assertEquals("FizzBuzzWhizz", FizzBuzzWhizz.fizzBuzz(210));
    }

    @Test
    public void shouldReturnFizzIfNumberContains3() {
        assertEquals("Fizz", FizzBuzzWhizz.fizzBuzz(13));
        assertEquals("Fizz", FizzBuzzWhizz.fizzBuzz(30));
    }

    @Test
    public void shouldReturnBuzzIfNumberContains5() {
        assertEquals("Buzz", FizzBuzzWhizz.fizzBuzz(15));
        assertEquals("Buzz", FizzBuzzWhizz.fizzBuzz(35));
    }

    @Test
    public void shouldReturnWhizzIfNumberContains7() {
        assertEquals("Whizz", FizzBuzzWhizz.fizzBuzz(75));
    }
}