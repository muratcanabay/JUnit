package io.github.muratcanabay.mockitotest11;

import io.github.muratcanabay.mysql.dao.ArtistDao;
import io.github.muratcanabay.mysql.domain.Artist;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;

public class MockitoTest {

    private Artist artistMock = Mockito.mock(Artist.class);
    private ArtistDao artistDaoMock = Mockito.mock(ArtistDao.class);
    private List<Artist> artistList;

    @Test
    public void verifySaveTest() {

        artistMock.setName("Murat");
        artistMock.setSurname("Abay");

        artistDaoMock.saveArtist(artistMock);

    }

    @Test
    public void verifyDeleteTest() {
        Artist newArtist = new Artist();

        // deleteArtist hiç çağırılmadı ?
        Mockito.verify(artistDaoMock, Mockito.never()).deleteArtist(newArtist);
    }

    @Test(expected = NullPointerException.class)
    public void verifyFindArtistByNameNotFoundTest() {
        Artist newArtist = new Artist();
        newArtist.setName("Deneme");

        newArtist = artistDaoMock.saveArtist(artistMock);
        // Mock nesne olduğundan veritabanına kaydedilmedi bu yüzden bulamaz
        artistList = artistDaoMock.findArtistByName(newArtist.getName());
    }

    @Test
    public void verifyFindArtistByNameTest() {
//        Artist newArtist = new Artist();
//        newArtist.setName("Deneme123");
//        newArtist.setSurname("Test");
//
//        ArtistDao artistDao = new ArtistDao();
//
//        newArtist = artistDao.saveArtist(newArtist);
//        artistList = artistDao.findArtistByName(newArtist.getName());
//        System.out.println(artistList);

        ArtistDao artistDao = new ArtistDao();
        List<Artist> artistList = artistDao.findArtistByName(anyString());
        System.out.println(artistList);
    }

}
