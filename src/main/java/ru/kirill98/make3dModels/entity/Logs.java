package ru.kirill98.make3dModels.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;



@Table("LOGS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Logs {
    @Column("USER_ID")
    private String userId;
    @Column("DATED")
    private String date;
    @Column("LOGGER")
    private String logger;
    @Column("LEVEL")
    private String level;
    @Column("MESSAGE")
    private String message;
}
