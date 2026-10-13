package tn.pi.msaccount.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    private Long customerId;

    private String firstName;

    private String lastName;

    private String email;

    private String mobileNumber;
}
