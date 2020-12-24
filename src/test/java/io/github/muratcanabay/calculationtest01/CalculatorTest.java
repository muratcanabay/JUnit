package io.github.muratcanabay.calculationtest01;

import io.github.muratcanabay.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addPositiveIntTest() {
        Calculator calculator = new Calculator();

        int var1 = 10;
        int var2 = 15;

        int result = calculator.add(var1, var2);
        Assert.assertEquals(25, result);
    }

    @Test
    public void substractPositiveIntTest() {
        // Her durum için ayrı test yazılmalı çünkü en üstteki test başarısız olursa diğer testler çalışmaz!
        Calculator calculator = new Calculator();
//        Assert.assertEquals(21, calculator.substract(50,30));
        // Bu method çalışmayacak!
        Assert.assertEquals(20, calculator.substract(50, 30));
    }
}
