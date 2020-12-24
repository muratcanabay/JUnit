package io.github.muratcanabay.mockitotest11;

import io.github.muratcanabay.mysql.dao.ArtistDao;
import io.github.muratcanabay.mysql.domain.Artist;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.inOrder;

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
