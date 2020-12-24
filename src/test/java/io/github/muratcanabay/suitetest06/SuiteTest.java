package io.github.muratcanabay.suitetest06;

import io.github.muratcanabay.calculationtest01.CalculatorTest;
import io.github.muratcanabay.customertest02.CustomerTest;
import io.github.muratcanabay.yasamdongusu03.YasamDongusu;
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
