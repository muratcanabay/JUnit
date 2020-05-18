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
package com.mabay.lomboktest;

/**
 * lombok
 *
 * @author Murat Can Abay
 * @since 0.18.0
 */

import com.mabay.student.Student;
import org.junit.Test;

/**
 * 1- Lombok Plugin Ekle
 * 2- Maven Dependency Ekle
 * Lombok @Getter, @Setter, @ToString gibi anotasyonlarla getter ve setter methodlarını yazmamayı sağlıyor.
 *
 * @Data anotasyonu hepsini bir anda getirir.
 * @AllArgsConstructor sınıfta kullanılan tüm değişkenlerin kullanıldığı constructorları getirir.
 * @NoArgsContructor default constructor ı oluşturur.
 * @Builder builder design pattern yapısı ile sınıfı oluşturur.
 */
public class LombokTest {

    @Test
    public void studentTest() {
        Student student = new Student("Murat Can");

        // Builder design pattern'ına göre
//        Student student = Student.builder().name("Murat Can").build();
        System.out.println(student);
    }
}
