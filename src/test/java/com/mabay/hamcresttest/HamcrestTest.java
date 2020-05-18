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
package com.mabay.hamcresttest;

import com.mabay.calculator.Calculator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * HamcrestTest
 *
 * @author Murat Can Abay
 * @since 0.18.0
 */

// Hamcrest Yardımcı Bir Kütüphanedir.
public class HamcrestTest {
    @Test
    public void hamcrestTest() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);
        int expected = 5;
        int errorExpected = 6;

        // 2 method da aynı işi yapsa da çıkan hata mesajlarına bak.
        // Hamcrest daha okunaklı bir hata mesajı sunuyor.

//        assertThat(expected, is(equalTo(result)));
//        assertEquals(expected, result);

//        assertThat(errorExpected, is(equalTo(result)));
//        assertEquals(errorExpected, result);

        assertThat(expected, anyOf(is(equalTo(2)), is(equalTo(5))));
    }

    @Test
    public void listeHamcrestTest() {
        List<String> sehirler = new ArrayList(Arrays.asList("Istanbul", "Izmir", "Ankara"));

        // Herhangi bir elemanı "Izmir" mi?
        assertThat(sehirler, hasItem("Izmir"));

        // Herhangi bir elemanı "Ankara" veya "Istanbul" mu?
        assertThat(sehirler, hasItems("Ankara", "Istanbul"));

        // Herhangi bir elemanında "Bursa" yoktur ?
        assertThat(sehirler, not(hasItem("Bursa")));

        // Hiçbir elemanında "Bursa" yoktur ve herhangi bir elemanında "Izmir" vardır.
        assertThat(sehirler, allOf(not(hasItem("Bursa")), hasItem("Izmir")));
    }
}
