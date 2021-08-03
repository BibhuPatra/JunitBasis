package com.capgemini.lesson14;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public  class CalculatorUnitTest
{
        @Parameterized.Parameters
        public static Collection data()
        {
            return Arrays.asList(new Object[][] {{25,4}, {100,1}, {50, 2}, {10, 10},{5,20}});
        }

        private int input;
        private int expected;

        public CalculatorUnitTest(int input, int expected)
        {
            this.input = input;
            this.expected = expected;
        }

        @Test(expected=ArithmeticException.class)
        public void testMethod()
        {
        	System.out.println("Running parameterized tests");
         //   Assert.assertEquals("Test failed",expected, Calculator.squared(input));
            Assert.assertEquals(expected, Calculator.divide(input));
        }
}