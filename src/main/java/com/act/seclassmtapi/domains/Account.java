package com.act.seclassmtapi.domains;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Entity(name="Account")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Size(max=15,min=3)
    @Column(nullable = false)
    @NotBlank(message = "First Name cannot be empty")
    private String firstName;

    @Size(max=15,min=3)
    @Column(nullable = false)
    @NotBlank(message = "Middle Name cannot be empty")
    private String middleName;

    @Size(max=15,min=3)
    @Column(nullable = false)
    @NotBlank(message = "Last Name cannot be empty")
    private String lastName;


    private LocalDate  dateOfBirth;

    @Size(max=15,min=3)
    @Column(nullable = false, unique = true)
    @NotBlank(message = "Phone Number cannot be empty")
    private String phoneNumber;

    @Size(max=15,min=3)
    @Column(nullable = false)
    @NotBlank(message = "Email address cannot be empty")
    private String email;

    @Column(nullable = false)
    @NotNull(message = "PIN must be set.")
    private Integer PIN;


    @Max(15)
    @Column(nullable = false)
    private Double Balance=0.0;

    private LocalDate OpenningDate=LocalDate.now();


}
