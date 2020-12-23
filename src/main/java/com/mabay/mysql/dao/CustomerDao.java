package com.mabay.mysql.dao;

import com.mabay.mysql.domain.Customer;
import com.mabay.mysql.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerDao {

    public Customer saveCustomer(Customer customer) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            customer = (Customer) session.merge(customer);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return customer;
    }

    public void deleteCustomer(Customer customer) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.delete(customer);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public List<Customer> findCustomerById(Long customerId) {
        List<Customer> customerList = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Query query = session.createQuery("select customer " +
                    "From Customer customer " +
                    "Where customer.Id = :id");
            query.setString("id", String.valueOf(customerId));
            customerList = query.list();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return customerList;
    }

    public List<Customer> findCustomerByName(String customerName) {
        List<Customer> customerList = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Query query = session.createQuery("select customer " +
                    "From Customer customer " +
                    "Where customer.name = :name");
            query.setString("name", String.valueOf(customerName));
            customerList = query.list();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return customerList;
    }
}
