package ru.kirill98.make3dModels.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("log")
@Entity
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column("user_id")
    private String userId;
    private String date;
    private String logger;
    private String level;
    private String message;
}
