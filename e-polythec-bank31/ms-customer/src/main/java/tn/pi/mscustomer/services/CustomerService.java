
package tn.pi.mscustomer.services;

import org.springframework.stereotype.Service;
import tn.pi.mscustomer.entities.Customer;
import java.util.List;
import java.util.Optional;
public interface CustomerService {

    List<Customer> getAllCustomers();

    Optional<Customer> getCustomerById(Long id);

    Customer saveCustomer(Customer customer);
    Customer getCustomerByMobile(String mobileNumber);
}
