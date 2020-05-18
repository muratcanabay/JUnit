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
package com.mabay.suitetest;

import com.mabay.calculationtest.CalculatorTest;
import com.mabay.customertest.CustomerTest;
import com.mabay.yasamdongusu.YasamDongusu;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * SuiteTest
 *
 * @author Murat Can Abay
 * @since 0.18.0
 */

// Test Sınıflarını gruplamaya yarar.
// Verilen test sınıflarını sırayla test eder.
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                YasamDongusu.class,
                CalculatorTest.class,
                CustomerTest.class
        }
)
public class SuiteTest {
}
