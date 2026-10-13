
package tn.pi.msaccount;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.pi.msaccount.entities.Account;
import tn.pi.msaccount.enums.AccountType;
import tn.pi.msaccount.repos.AccountRepository;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class MsAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsAccountApplication.class, args);
        System.out.println("***Account service started successfully***");
    }

    @Bean
    public CommandLineRunner initData(AccountRepository repository) {
        return args -> {
            Account account = new Account();
            account.setAccountId(UUID.randomUUID().toString());
            account.setBalance(Math.random() * 9000);
            account.setCurrency("USD");
            account.setType(AccountType.CURRENT_ACCOUNT);
            account.setCreatedAt(LocalDate.now());
            account.setCustomerId(1L);
            repository.save(account);

            Account account1 = new Account();
            account1.setAccountId(UUID.randomUUID().toString());
            account1.setBalance(Math.random() * 9000);
            account1.setCurrency("DNT");
            account1.setType(AccountType.SAVING_ACCOUNT);
            account1.setCreatedAt(LocalDate.now());
            account1.setCustomerId(2L);
            repository.save(account1);
        };
    }
}
