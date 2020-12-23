package com.mabay.hamcresttest08;

import com.mabay.calculator.Calculator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

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
