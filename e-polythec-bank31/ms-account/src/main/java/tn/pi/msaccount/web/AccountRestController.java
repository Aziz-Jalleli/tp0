
package tn.pi.msaccount.web;

import org.springframework.web.bind.annotation.*;
import tn.pi.msaccount.entities.Account;
import tn.pi.msaccount.services.AccountService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
@CrossOrigin("*")
public class AccountRestController {

    private final AccountService accountService;

    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable String id) {
        return accountService.getAccountById(id);
    }

    @PostMapping
    public Account saveAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    @GetMapping("/customer/{customerId}")
    public List<Account> getAccountsByCustomerId(
            @PathVariable Long customerId) {
        return accountService.getAccountsByCustomerId(customerId);
    }
}
