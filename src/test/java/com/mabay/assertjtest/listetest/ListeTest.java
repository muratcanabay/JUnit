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
package com.mabay.assertjtest.listetest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ListeTest
 *
 * @author Murat Can Abay
 * @since 0.18.0
 */
public class ListeTest {
    @Test
    public void dummy() {
        List list = new ArrayList();
        list.add("Java");
        list.add("C");
        list.add("Python");
        list.add("Go");
        list.add("Android");

        assertThat(list)
                .contains("Java")
                .doesNotContain("JavaScript")
                .isNotNull()
                .doesNotHaveDuplicates()
                .containsAnyOf("C++", "Python", "C#");

    }

    @Test
    public void listeTest2() {
        List<String> telefonList = new ArrayList<String>(Arrays.asList("Samsung", "Oppo", "Xiaomi", "Apple"));
        List<String> stringList = new ArrayList<String>(Arrays.asList("Samsung", "Oppo", "Xiaomi", "LG"));

        Stream stream = stringList.stream();

        stream.forEach(o -> assertThat(telefonList).contains((String) o));

    }
}
