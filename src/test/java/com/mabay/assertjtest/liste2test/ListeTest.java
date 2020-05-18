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
package com.mabay.assertjtest.liste2test;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ListeTest
 *
 * @author Murat Can Abay
 * @since 0.18.0
 */
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
