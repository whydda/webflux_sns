DROP TABLE IF EXISTS USER;
CREATE TABLE USER (
    id bigint unsigned auto_increment primary key,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(50) NOT NULL,
    created_at datetime(3) default CURRENT_TIMESTAMP(3) not null,
    updated_at datetime(3) default CURRENT_TIMESTAMP(3) not null,
    deleted_at datetime(3) default CURRENT_TIMESTAMP(3) not null,
    constraint user_email_name_unq
    unique (email, name)
);

insert into user (id, email, password, name, created_at, updated_at) values (1, 'whydda@naver.com', '1234', '변진환', '2020-10-15 09:08:51.000', '2020-10-15 09:08:51.000');
