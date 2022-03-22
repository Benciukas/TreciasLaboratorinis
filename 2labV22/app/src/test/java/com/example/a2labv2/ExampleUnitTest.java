package com.example.a2labv2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void givenResult_EmptyText_CalcElementCount() {
        String givenText = "";
        int expectedValue = 0;
        int actualValue = calcWordorChar.getCharsCount(givenText);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void givenResult_EmptyText_CalcWordCount() {
        String givenText = "";
        int expectedValue = 1;
        int actualValue = calcWordorChar2.getCharsCount2(givenText);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void givenResult_BasicText_CalcElementCount() {
        String givenText = "NormalTextTest";
        int expectedValue = 14;
        int actualValue = calcWordorChar.getCharsCount(givenText);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void givenResult_BasicText_CalcWordCount() {
        String givenText = "NormalTextTest";
        int expectedValue = 1;
        int actualValue = calcWordorChar2.getCharsCount2(givenText);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void givenResult_SpaceText_CalcElementCount() {
        String givenText = "Normal Text With Space";
        int expectedValue = 22;
        int actualValue = calcWordorChar.getCharsCount(givenText);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void givenResult_SpaceText_CalcWordCount() {
        String givenText = "Normal Text With Space";
        int expectedValue = 4;
        int actualValue = calcWordorChar2.getCharsCount2(givenText);
        assertEquals(expectedValue,actualValue);
    }
}}
