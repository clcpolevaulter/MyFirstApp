package com.example.myfirstapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzForMultiplesOf3() {
        //Arrange or Given
        assertMultipleOfThree(3 * 1);
        assertMultipleOfThree(3 * 2);
        assertMultipleOfThree(3 * 3);
        assertMultipleOfThree(3 * 4);
    }

    @Test
    public void shouldReturnBuzzForMultiplesOf5() {
        //Arrange or Given
        assertMultipleOfFive(5 * 1);
        assertMultipleOfFive(5 * 2);
//        assertMultipleOfFive(5 * 3);
        assertMultipleOfFive(5 * 4);
    }

    @Test
    public void shouldReturnFizzBuzzForMultiplesOf15() {
        //Arrange or Given
        int leastCommonDenominator = 5 * 3;
        assertMultipleOf3And5(leastCommonDenominator * 1);
        assertMultipleOf3And5(leastCommonDenominator * 2);
    }

    @Test
    public void shouldReturnInputForOtherPrimeNumbers() {
        assertNotMultipleOfThreeOrFive(1);
        assertNotMultipleOfThreeOrFive(2);
        assertNotMultipleOfThreeOrFive(7);
        assertNotMultipleOfThreeOrFive(11);
        assertNotMultipleOfThreeOrFive(13);
        assertNotMultipleOfThreeOrFive(17);
        assertNotMultipleOfThreeOrFive(19);
        assertNotMultipleOfThreeOrFive(23);
        assertNotMultipleOfThreeOrFive(29);
        assertNotMultipleOfThreeOrFive(31);
        assertNotMultipleOfThreeOrFive(37);
    }

    private void assertNotMultipleOfThreeOrFive(int givenInput) {
        //Act or When
        String returnVal = FizzBuzz.calc(givenInput);

        //Assert or Then
        assertEquals("" + givenInput, returnVal);
    }

    private void assertMultipleOfThree(int givenInput) {
        //Act or When
        String returnVal = FizzBuzz.calc(givenInput);

        //Assert or Then
        assertEquals("Fizz", returnVal);
    }

    private void assertMultipleOfFive(int givenInput) {
        //Act or When
        String returnVal = FizzBuzz.calc(givenInput);

        //Assert or Then
        assertEquals("Buzz", returnVal);
    }

    private void assertMultipleOf3And5(int givenInput) {
        //Act or When
        String returnVal = FizzBuzz.calc(givenInput);

        //Assert or Then
        assertEquals("FizzBuzz", returnVal);
    }

}