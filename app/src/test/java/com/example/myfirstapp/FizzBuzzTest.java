package com.example.myfirstapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzFor3() {
        //Arrange or Given
        assertMultipleOfThree(3);
        assertMultipleOfThree(3 * 2);
        assertMultipleOfThree(3 * 3);
        assertMultipleOfThree(3 * 4);
    }

    private void assertMultipleOfThree(int givenInput) {
        //Act or When
        String returnVal = FizzBuzz.calc(givenInput);

        //Assert or Then
        assertEquals("Fizz", returnVal);
    }

    @Test
    public void shouldReturnBuzzFor5() {
        //Arrange or Given
        assertMultipleOfFive(5 * 1);
        assertMultipleOfFive(5 * 2);
//        assertMultipleOfFive(5 * 3);
        assertMultipleOfFive(5 * 4);
    }

    private void assertMultipleOfFive(int givenInput) {
        //Act or When
        String returnVal = FizzBuzz.calc(givenInput);

        //Assert or Then
        assertEquals("Buzz", returnVal);
    }

    @Test
    public void shouldReturnFizzBuzzFor15() {
        //Arrange or Given
        assertMultipleOf3And5(5 * 3 * 1);
    }

    @Test
    public void shouldReturnFizzBuzzFor30() {
        //Arrange or Given
        assertMultipleOf3And5(5 * 3 * 2);
    }

    private void assertMultipleOf3And5(int givenInput) {
        //Act or When
        String returnVal = FizzBuzz.calc(givenInput);

        //Assert or Then
        assertEquals("FizzBuzz", returnVal);
    }

    @Test
    public void shouldReturnInput() {
        //Arrange or Given
        int givenInput = 1;

        //Act or When
        String returnVal = FizzBuzz.calc(givenInput);

        //Assert or Then
        assertEquals("" + givenInput, returnVal);
    }

}