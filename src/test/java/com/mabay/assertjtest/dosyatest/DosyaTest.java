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
package com.mabay.assertjtest.dosyatest;

import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.contentOf;

/**
 * DosyaTest
 *
 * @author Murat Can Abay
 * @since 0.18.0
 */
public class DosyaTest {

    @Test
    public void dosyaTest() {
        File file = new File(getClass().getClassLoader().getResource("deneme123.txt").getFile());

//        assertThat(file)
//                .canRead()
//                .canWrite()
//                .hasExtension("txt");

        assertThat(contentOf(file))
                .startsWith("Mur")
                .endsWith("ay");

    }
}
