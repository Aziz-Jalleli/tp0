
package tn.pi.mscustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tn.pi.mscustomer.entities.Customer;
import tn.pi.mscustomer.repositories.CustomerRepository;

@SpringBootApplication
public class MsCustomerApplication {

    // faire appel à la couche DAO
    @Autowired
    CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsCustomerApplication.class, args);
        System.out.println("REST API starts successfully");
    }

    @Bean
    public CommandLineRunner initData() {
        return args -> {
            // begin transaction

            customerRepository.save(Customer.builder()
                    .firstName("Mohamed")
                    .lastName("Jallali")
                    .email("mohamed@example.com")
                    .mobileNumber("22123456")
                    .build());

            customerRepository.save(Customer.builder()
                    .firstName("Ahmed")
                    .lastName("Ben Ali")
                    .email("ahmed@example.com")
                    .mobileNumber("55123456")
                    .build());

            customerRepository.save(Customer.builder()
                    .firstName("Sarra")
                    .lastName("Trabelsi")
                    .email("sarra@example.com")
                    .mobileNumber("98123456")
                    .build());

            // end transaction
        };
    }
}
