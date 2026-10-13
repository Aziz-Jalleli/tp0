
package tn.pi.mscustomer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.pi.mscustomer.entities.Customer;
import tn.pi.mscustomer.services.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/mobile/{mobileNumber}")
    public Customer getCustomerByMobile(
            @PathVariable String mobileNumber) {
        return customerService.getCustomerByMobile(mobileNumber);
    }
}
