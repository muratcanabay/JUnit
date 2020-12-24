package io.github.muratcanabay.assertjtest10.dosyatest04;

import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.contentOf;

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
