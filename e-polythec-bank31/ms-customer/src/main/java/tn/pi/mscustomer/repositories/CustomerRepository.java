
package tn.pi.mscustomer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.pi.mscustomer.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
