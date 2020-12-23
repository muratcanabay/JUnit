package com.mabay.assertjtest10.listetest03;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListeTest {

    @Test
    public void listeTest() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "Murat"));
        itemList.add(new Item(2, "Can"));
        itemList.add(new Item(3, "Abay"));

//        assertThat(itemList)
//                .extracting("name")
//                .contains("Zeynep", "Özkan", "Begüm");

        assertThat(itemList)
                .extracting("name")
                .contains("Murat", "Abay", "Can");
    }

    @Data
    @AllArgsConstructor
    static class Item {
        private int id;
        private String name;
    }
}
