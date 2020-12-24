package io.github.muratcanabay.lomboktest09;

import io.github.muratcanabay.student.Student;
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
