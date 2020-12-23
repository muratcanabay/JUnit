package com.mabay.yasamdongusu03;

import org.junit.*;

public class YasamDongusu {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test methodu başlamadan önce çağırılır.(BEFORE CLASS)");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test methodu bittikten sonra çağırılır.(AFTER CLASS)");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her test methodu çağırılmadan önce çalıştırılır.(BEFORE)");
    }

    @Test
    public void printTest() {
        System.out.println("Test methodu 1(TEST1)");
    }

    @Test
    public void printTest2() {
        System.out.println("Test methodu 2(TEST2)");
    }

    @After
    public void tearDown() {
        System.out.println("Her test methodu çağırıldıktan sonra çağırılır.(AFTER)");
    }
}
