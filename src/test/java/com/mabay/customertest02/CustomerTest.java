package com.mabay.customertest02;

import com.mabay.mysql.dao.CustomerDao;
import com.mabay.mysql.domain.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CustomerTest {

    private CustomerDao customerDao;

    @Before
    public void createCustomerDao() {
        // Mock object olduğu sürece veritabanına yeni customer eklenmez.
//        customerDao = Mockito.mock(CustomerDao.class);
        customerDao = new CustomerDao();
    }

    @Test
    public void saveCustomerTest() {
        // Veritabanına eklenmez.

//        Customer customer = Mockito.mock(Customer.class);
//        customer.setName("Fırat");
//        customerDao.saveCustomer(customer);
//        Mockito.verify(customer);

        // Eğer dao mock object değilse eklenir.

        Customer customer = new Customer();
        customer.setName("Fırat");
        customerDao.saveCustomer(customer);
    }

    @Test
    public void deleteCustomerTest() {
        Customer customer = new Customer();
        customer.setName("Mock2");

        customer = customerDao.saveCustomer(customer);
        customerDao.deleteCustomer(customer);
    }

    @Test
    public void findCustomerByIdTest() {
        Customer customer = new Customer();
        customer.setName("muratcanabay");

        customer = customerDao.saveCustomer(customer);
        customerDao.findCustomerById(customer.getId());
    }

    @Test(expected = Exception.class)
    public void findCustomerByNameTest() throws Exception {
        List<Customer> customerList = customerDao.findCustomerByName("TEST TEST");
        if (customerList.size() < 1) {
            throw new Exception("Kayıt bulunamadı");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }
    }
}
