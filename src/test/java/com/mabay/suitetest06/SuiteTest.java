package com.mabay.suitetest06;

import com.mabay.calculationtest01.CalculatorTest;
import com.mabay.customertest02.CustomerTest;
import com.mabay.yasamdongusu03.YasamDongusu;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

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
