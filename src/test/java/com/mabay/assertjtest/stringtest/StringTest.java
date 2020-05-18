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
package com.mabay.assertjtest.stringtest;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * StringTest
 *
 * @author Murat Can Abay
 * @since 0.18.0
 */
public class StringTest {

    @Test
    public void dummy() {
        String s = "Deneme123";
        assertThat(s)
                .isEqualTo("Deneme123")
                .contains("eme")
                .startsWith("D")
                .endsWith("3")
                .isNotEmpty()
                .isNotNull()
                .containsOnlyOnce("1")
                .doesNotContainAnyWhitespaces()
                .doesNotContain("Baris");
    }
}
