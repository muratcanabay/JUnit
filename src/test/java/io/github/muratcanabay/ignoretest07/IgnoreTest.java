package io.github.muratcanabay.ignoretest07;

import org.junit.Ignore;
import org.junit.Test;

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
