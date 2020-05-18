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
package com.mabay.yasamdongusu;

import org.junit.*;

/**
 * YasamDongusu
 *
 * @author Murat Can Abay
 * @since 0.17.0
 */
public class YasamDongusu {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Test methodu başlamadan önce çağırılır.(BEFORE CLASS)");
    }

    @AfterClass
    public static void afterClass() throws Exception {
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
    public void tearDown() throws Exception {
        System.out.println("Her test methodu çağırıldıktan sonra çağırılır.(AFTER)");
    }
}
