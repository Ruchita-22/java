create database UserDB;
use UserDB;



CREATE TABLE users (
  userid int(11) NOT NULL AUTO_INCREMENT primary key,
  firstname varchar(45) DEFAULT NULL,
  lastname varchar(45) DEFAULT NULL,
  dob date DEFAULT NULL,
  email varchar(100) DEFAULT NULL
 
);