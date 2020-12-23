package com.mabay.parametretest04;

import com.mabay.calculator.Calculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParametreTest {

    private Calculator calculator = new Calculator();

    @Test
    @Parameters({"1,2,3", "1,4,5", "3,3,3"})
    public void arrayTest(int var1, int var2, int result) {
        int sum = calculator.add(var1, var2);
        Assert.assertEquals(result, sum);
    }
}
