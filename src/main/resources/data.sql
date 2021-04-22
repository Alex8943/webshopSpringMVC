create table product
(
    id long primary key not null,
    name varchar(100) not null,
    price long
);

create table Company
(
    id long primary key not null,
    name varchar(100) not null
);

create table Description(
    id long primary key not null,
    description varchar(200)
);

create table Category(
    id long primary key not null,
    name varchar(100)
);