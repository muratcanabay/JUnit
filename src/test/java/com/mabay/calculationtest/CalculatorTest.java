/*
 * Copyright 2020 Universal Bilgi Teknolojileri.
 *
 * UKL 1.1 lisansı ile lisanslanmıştır. Bu dosyanın lisans koşullarına uygun
 * olmayan şekilde kullanımı yasaklanmıştır. Lisansın bir kopyasını aşağıdaki
 * linkten edinebilirsiniz.
 *
 * http://www.uni-yaz.com/lisans/ukl_1_1.pdf
 *
 * Yasalar aksini söylemediği veya yazılı bir sözleşme ile aksi belirtilmediği sürece,
 * bu yazılım mevcut hali ile hiç bir garanti vermeden veya herhangi bir şart ileri
 * sürmeden dağıtılır. Bu yazılımın edinim izinleri ve limitler konusunda lisans
 * sözleşmesine bakınız.
 *
 */
package com.mabay.calculationtest;

import com.mabay.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test
 *
 * @author Murat Can Abay
 * @since 0.17.0
 */
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
