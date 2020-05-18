package com.mabay.mysql.dao;

import com.mabay.mysql.domain.Artist;
import com.mabay.mysql.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class ArtistDao {
    public Artist saveArtist(Artist artist) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession();) {
            session.getTransaction().begin();
            artist = (Artist) session.merge(artist);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return artist;
    }

    public List<Artist> findAllArtist() {
        List<Artist> artistList = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession();) {
            String hql = "Select artist From Artist artist left join fetch artist.movie movie";
            Query query = session.createQuery(hql);
            artistList = query.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return artistList;
    }

    public List<Artist> findArtistByName(String artistName) {
        List<Artist> artistList = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            String hql = "Select artist From Artist artist where artist.name = :artistName";
            Query query = session.createQuery(hql);
            query.setParameter("artistName", artistName);
            artistList = query.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return artistList;
    }

    public void deleteArtist(Artist artist) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.delete(artist);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}