package io.github.muratcanabay.exceptiontest05;

import io.github.muratcanabay.mysql.dao.CustomerDao;
import io.github.muratcanabay.mysql.domain.Customer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

public class ExceptionTest {

    // Test(expected = Exception.class) aynı şey
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void findCustomerTest() throws Exception {
        CustomerDao customerDao = new CustomerDao();
        String customerName = "aBc";

        List<Customer> customerList = customerDao.findCustomerByName(customerName);
        if (customerList.size() < 1) {
            thrown.expect(java.lang.Exception.class);
            thrown.expectMessage("Bu müşteri veritabanında bulunamadı.");
            throw new java.lang.Exception("Bu müşteri veritabanında bulunamadı.");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }
    }
}
