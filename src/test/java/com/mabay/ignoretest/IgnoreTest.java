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
package com.mabay.ignoretest;

import org.junit.Ignore;
import org.junit.Test;

/**
 * IgnoreTest
 *
 * @author Murat Can Abay
 * @since 0.18.0
 */
public class IgnoreTest {

    @Test
    public void soutTest1() {
        System.out.println("Hello World1");
    }

    @Test
    @Ignore("Bu test methodu ignore edildi.")
    // Bu test class'ı çalışmayacak.
    public void soutTest2() {
        System.out.println(getClass().getSimpleName() + " Hello World2");
    }

}
