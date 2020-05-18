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
package com.mabay.parametretest;

import com.mabay.calculator.Calculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * ParametreTest
 *
 * @author Murat Can Abay
 * @since 0.17.0
 */
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
