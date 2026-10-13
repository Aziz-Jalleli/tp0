
package tn.pi.msaccount.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import tn.pi.msaccount.entities.Customer;
import tn.pi.msaccount.enums.AccountType;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    private String accountId;

    private double balance;

    private LocalDate createdAt;

    private String currency;

    private AccountType type;

    @Transient
    private Customer customer;

    private Long customerId;
}
