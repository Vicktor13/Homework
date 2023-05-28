create table students
(
    id      bigserial primary key,
    name    varchar(255),
    age     int
);

insert into students (name, age)
values ('John', 19),
       ('Jack', 18),
       ('Jimmy', 21),
       ('Jorge', 19),
       ('July', 20),
       ('Jeniffer', 18),
       ('Jessica', 17);