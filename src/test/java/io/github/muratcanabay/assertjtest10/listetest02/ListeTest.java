package io.github.muratcanabay.assertjtest10.listetest02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

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
