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
package com.mabay.mysql;

import com.mabay.mysql.dao.ArtistDao;
import com.mabay.mysql.dao.MovieArtistDao;
import com.mabay.mysql.dao.MovieDao;
import com.mabay.mysql.domain.Artist;
import com.mabay.mysql.domain.Movie;
import com.mabay.mysql.domain.MovieArtist;

import java.math.BigDecimal;

/**
 * @author Murat Can Abay
 * @since 0.17.0
 */
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
