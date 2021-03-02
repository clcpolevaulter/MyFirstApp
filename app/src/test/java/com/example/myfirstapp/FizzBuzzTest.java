package com.example.myfirstapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzFor3() {
        //Arrange or Given
        int givenInput = 3;

        //Act or When
        String returnVal = FizzBuzz.calc(givenInput);

        //Assert or Then
        assertEquals("Fizz", returnVal);
    }
    @Test
    public void shouldReturnBuzzFor5() {
        //Arrange or Given
        int givenInput = 5;

        //Act or When
        String returnVal = FizzBuzz.calc(givenInput);

        //Assert or Then
        assertEquals("Buzz", returnVal);
    }
}