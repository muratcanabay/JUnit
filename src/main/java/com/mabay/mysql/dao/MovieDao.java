package com.mabay.mysql.dao;

import com.mabay.mysql.domain.Movie;
import com.mabay.mysql.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class MovieDao {
    public Movie saveMovie(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession();) {
            session.getTransaction().begin();
            movie = (Movie) session.merge(movie);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return movie;
    }

    public List<Movie> findAllMovie() {
        List<Movie> movieList = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession();) {
            String hql = "Select movie From Movie movie left join fetch movie.artist artist";
            Query query = session.createQuery(hql);
            movieList = query.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return movieList;
    }

    public List<Movie> findAllMovieOrderByRate() {
        List<Movie> movieList = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession();) {
            String hql = "from Movie as movie order by movie.rate desc";
            Query query = session.createQuery(hql);
            movieList = query.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return movieList;
    }

    public void deleteMovie(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.delete(movie);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}