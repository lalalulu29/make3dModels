CREATE TABLE IF NOT EXISTS LOGS
   (USER_ID VARCHAR(20)    NOT NULL,
    DATED   DATETIME       NOT NULL,
    LOGGER  VARCHAR(50)    NOT NULL,
    LEVEL   VARCHAR(10)    NOT NULL,
    MESSAGE VARCHAR(1000)  NOT NULL
   );



CREATE TABLE IF NOT EXISTS ROLES
    (Uuid       INT(11)     NOT NULL AUTO_INCREMENT,
     Name       VARCHAR(50) NOT NULL,
     PRIMARY    KEY         (Uuid)
    );

CREATE TABLE IF NOT EXISTS USERS
    (Username   VARCHAR(255)    NOT NULL,
     Password   VARCHAR(255)    NOT NULL,
     Firstname  VARCHAR(255)    DEFAULT NULL,
     Lastname   VARCHAR(255)    DEFAULT NULL,
     Email      VARCHAR(50)     DEFAULT NULL,
     Birth_date DATE            DEFAULT NULL,
     Reg_date   DATE            NOT NULL,
     PRIMARY    KEY             (Username)
    );