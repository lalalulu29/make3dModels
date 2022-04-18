CREATE TABLE IF NOT EXISTS log
   (id          INT(11)        NOT NULL AUTO_INCREMENT,
    user_id     VARCHAR(20)    NOT NULL,
    date        DATETIME       NOT NULL,
    logger      VARCHAR(150)   NOT NULL,
    level       VARCHAR(10)    NOT NULL,
    message     VARCHAR(1000)  NOT NULL,
    PRIMARY KEY (id)
   );

CREATE TABLE IF NOT EXISTS role
    (id         INT(11)     NOT NULL AUTO_INCREMENT,
     name       VARCHAR(50) NOT NULL,
     PRIMARY    KEY         (id)
    );

CREATE TABLE IF NOT EXISTS user
    (id             INT(11)         NOT NULL AUTO_INCREMENT,
     username       VARCHAR(255)    NOT NULL,
     password       VARCHAR(255)    NOT NULL,
     first_name     VARCHAR(255)    DEFAULT NULL,
     last_name      VARCHAR(255)    DEFAULT NULL,
     email          VARCHAR(50)     DEFAULT NULL,
     birth_date     DATE            DEFAULT NULL,
     reg_date       DATETIME        NOT NULL,
     PRIMARY        KEY             (id)
    );

CREATE TABLE IF NOT EXISTS user_role
    (user_id INT(11) NOT NULL,
     role_id INT(11) NOT NULL,
     PRIMARY KEY (user_id, role_id),
     FOREIGN KEY (user_id) REFERENCES user (id),
     FOREIGN KEY (role_id) REFERENCES role (id)
    );

INSERT INTO user(username, password, reg_date)
VALUES
('lalalulu29', '$2a$12$yhruGmrfcFtusVK/VX29nej4FpFx3IJPvjxUgI89V8sCHFwAqB9TS', '2022-04-18 17:13:13');

INSERT INTO role(name)
VALUES
('ROLE_USER'), ('ROLE_ADMIN');

INSERT INTO user_role(user_id, role_id)
VALUES
(1, 2);
