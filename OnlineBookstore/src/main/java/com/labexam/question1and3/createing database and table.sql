create database bookstoreDB;
use bookstoreDB;
create table tasks (
	id int auto_increment primary key, 
	title varchar(255), 
	author VARCHAR(255), 
	price double
);
