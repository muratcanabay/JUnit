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
package com.mabay.mockitotest;

import com.mabay.mysql.dao.ArtistDao;
import com.mabay.mysql.domain.Artist;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.inOrder;

/**
 * SirayiTestEt
 *
 * @author Murat Can Abay
 * @since 0.19.0
 */
public class SirayiTestEt {

    @Test
    public void sirayiTestEt() {
        Artist artist = Mockito.mock(Artist.class);
        artist.setName("Cansu");
        artist.setSurname("Abay");

        ArtistDao artistDao = Mockito.mock(ArtistDao.class);
        artistDao.saveArtist(artist);          //1:save()
        artistDao.findAllArtist();             //2:find()
        artistDao.deleteArtist(artist);        //3:delete()

        InOrder inOrder = inOrder(artistDao);
        inOrder.verify(artistDao).saveArtist(artist);
        inOrder.verify(artistDao).findAllArtist();
        inOrder.verify(artistDao).deleteArtist(artist);

    }
}
