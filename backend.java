create database CampusConnect;
use CampusConnect;
create table Blog(title varchar(25),content LONGTEXT,AuthorName varchar(20),Year varchar(20));
create table Events(name varchar(25),description LONGTEXT,date varchar(20),time varchar(20),year varchar(20));
create table Announcement(title varchar(25),content LONGTEXT,Year varchar(20));
create table Login_Details(name varchar(50),password varchar(20),EmailID LONGTEXT,PhoneNo BIGINT);
create table Lost(description LONGTEXT,location varchar(100),ContactInfo varchar(50));
create table Found(description LONGTEXT,location varchar(100),ContactInfo varchar(50));

show tables;

select * from Login_Details;
select * from announcement;
select * from blog;
select * from events;
select * from lost;
select * from found;
