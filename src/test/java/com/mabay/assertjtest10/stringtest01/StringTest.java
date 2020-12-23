package com.mabay.assertjtest10.stringtest01;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
