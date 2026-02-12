package com.tripplings.dukaan.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime; // Import for timestamp
import java.util.UUID;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID id;

    // Renamed 'name' to 'firstName' and added other name components
    private String firstName;
    private String middleName;
    private String lastName;

    // Email was already present, ensuring it's correctly formatted
    private String email;

    // Note: In a real app, passwords should be hashed and not stored directly.
    private String password;

    private boolean isDeleted;
    private boolean isActive;

    private LocalDateTime createdOn;
    private String createdBy;
    private LocalDateTime modifiedOn;
    private String modifiedBy;
}
