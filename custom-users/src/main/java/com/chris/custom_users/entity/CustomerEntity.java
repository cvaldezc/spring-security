package com.chris.custom_users.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
public class CustomerEntity implements Serializable {

    @Id
    private Long id;

    private String email;
    @Column(name = "pwd")
    private String password;
    @Column(name = "rol")
    private String role;
}
