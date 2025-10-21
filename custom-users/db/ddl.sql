CREATE TABLE IF NOT EXISTS users (
                       id bigserial primary key,
    email varchar(50) not null,
    pwd varchar(50) not null,
    rol varchar(20) not null
);
