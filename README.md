# customersystem
VASYERP practical round


Application starts at http://localhost:8080/list

/cust for adding a new entry
/list for diaplaying all entries

while in list view: There are 2 buttons in front of each entry namely Edit and Delete

delete button removes the entry from database

edit button will take you to the create page with all the data prefilled, update the required details and submit



**This application is configured with MySQL database** and the credentials needs to be configured accordingly.

Change db username and password in application.properties



Schema: 
  database : create database Customers;
  Table    : create table customers(id int PRIMARY KEY NOT NULL AUTO_INCREMENT,firstname varchar(30),lastname varchar(30),mobile varchar(10),email varchar(30));
