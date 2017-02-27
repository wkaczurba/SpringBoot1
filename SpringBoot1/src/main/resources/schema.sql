create table customers (
	id identity,
	firstName varchar(30) not null,
	lastName varchar(50) not null,
	phoneNumber varchar(13),
	emailAddress varchar(30)
);

insert into customers (firstName, lastName, phoneNumber, emailAddress) values ('John', 'Example', '123456', 'joe.example@thebest.com')

