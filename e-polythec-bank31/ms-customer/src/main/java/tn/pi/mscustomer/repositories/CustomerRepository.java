
package tn.pi.mscustomer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.pi.mscustomer.entities.Customer;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
