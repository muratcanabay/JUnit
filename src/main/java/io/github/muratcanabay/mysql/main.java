package io.github.muratcanabay.mysql;

import io.github.muratcanabay.mysql.dao.ArtistDao;
import io.github.muratcanabay.mysql.dao.MovieArtistDao;
import io.github.muratcanabay.mysql.dao.MovieDao;
import io.github.muratcanabay.mysql.domain.Artist;
import io.github.muratcanabay.mysql.domain.Movie;
import io.github.muratcanabay.mysql.domain.MovieArtist;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setName("TEST TEST");
//
//        CustomerDao customerDao = new CustomerDao();
//        customer = customerDao.saveCustomer(customer);
//        customer = customerDao.saveCustomer(customer);
//        customerDao.deleteCustomer(customer);
//        List<Customer> customerList = customerDao.findCustomerById(customer.getId());

//        List<Customer> customerList = customerDao.findCustomerByName("TEST TEST");
//
//        for (Customer c:customerList) {
//            System.out.println(c.getName());
//        }

        MovieDao movieDao = new MovieDao();
        ArtistDao artistDao = new ArtistDao();
        MovieArtistDao movieArtistDao = new MovieArtistDao();

        Movie movie = new Movie();
        movie.setName("Green Mile");
        movie.setRate(BigDecimal.valueOf(9.1));
        movie = movieDao.saveMovie(movie);

        Artist artist = new Artist();
        artist.setName("Leonardo");
        artist.setSurname("Dicaprio");
        artist = artistDao.saveArtist(artist);

        MovieArtist movieArtist = new MovieArtist();
        movieArtist.setMovie(movie);
        movieArtist.setArtist(artist);
        movieArtistDao.saveMovieArtist(movieArtist);

        artistDao.deleteArtist(artist);
        movieDao.deleteMovie(movie);

    }
}
