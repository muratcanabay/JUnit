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
package com.mabay.ruletest;

import com.mabay.mysql.dao.CustomerDao;
import com.mabay.mysql.domain.Customer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

/**
 * RuleTest
 *
 * @author Murat Can Abay
 * @since 0.18.0
 */
public class RuleTest {

    // Test(expected = Exception.class) aynı şey
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void findCustomerTest() throws Exception {
        CustomerDao customerDao = new CustomerDao();
        String customerName = "aBc";

        List<Customer> customerList = customerDao.findCustomerByName(customerName);
        if (customerList.size() < 1) {
            thrown.expect(Exception.class);
            thrown.expectMessage("Bu müşteri veritabanında bulunamadı.");
            throw new Exception("Bu müşteri veritabanında bulunamadı.");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }
    }
}
