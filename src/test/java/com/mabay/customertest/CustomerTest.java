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
package com.mabay.customertest;

import com.mabay.mysql.dao.CustomerDao;
import com.mabay.mysql.domain.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * CustomerTest
 *
 * @author Murat Can Abay
 * @since 0.17.0
 */
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
