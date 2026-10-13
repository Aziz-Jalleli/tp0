
package tn.pi.msaccount.services;

import tn.pi.msaccount.entities.Account;
import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<Account> getAllAccounts();

    Optional<Account> getAccountById(String id);

    Account saveAccount(Account account);

    List<Account> getAccountsByCustomerId(Long customerId);
}
