package ru.kirill98.make3dModels.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Date;

@Table("USERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Column("Username")
    private String username;
    @Column("Password")
    private String password;

    @Column("Firstname")
    private String firstName;
    @Column("Lastname")
    private String lastName;
    @Column("Email")
    private String email;

    @Column("Birth_date")
    private Date birthDate;
    @Column("Reg_date")
    private Date regDate;
}
