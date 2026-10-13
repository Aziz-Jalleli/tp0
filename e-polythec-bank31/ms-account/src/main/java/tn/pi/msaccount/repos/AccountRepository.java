
package tn.pi.msaccount.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.pi.msaccount.entities.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
}
