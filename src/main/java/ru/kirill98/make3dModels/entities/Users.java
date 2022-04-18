package ru.kirill98.make3dModels.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Date;

@Table("USERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private String username;
    private String password;

    private String firstName;
    private String lastName;
    private String email;

    private Date birthDate;
    private Date regDate;


}
