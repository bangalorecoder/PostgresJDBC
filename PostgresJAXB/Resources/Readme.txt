

This project achieves the following:

 * Demonstrating how to use  JDBC to connect to postgresQL db and fetch the records.
 * Query, Retive, Iterate and Store the DB records in a HashMap.


**************************************DATABASE CHANGES***********************************************************

 (1) We are using PostgresQL default database.

CREATE DATABASE postgres
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United States.1252'
       LC_CTYPE = 'English_United States.1252'
       CONNECTION LIMIT = -1;

COMMENT ON DATABASE postgres  IS 'default administrative connection database';
  
  (2)  Create a table and insert couple of rows.
  

CREATE TABLE COMPANY(
   ID INT PRIMARY KEY     NOT NULL,
   NAME           TEXT    NOT NULL,
   AGE            INT     NOT NULL,
   ADDRESS        CHAR(50),
   SALARY         REAL,
   JOIN_DATE	  DATE
);

INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY,JOIN_DATE) VALUES (1, 'Paul', 32, 'California', 20000.00,'2001-07-13');

INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,JOIN_DATE) VALUES (2, 'Allen', 25, 'Texas', '2007-12-13');

SELECT * FROM COMPANY


**********************************************JAVA CLASSES***************************************************
(0) Add postgresql jar to lib in eclipse.
(1) JDBCPostgres.java
(2) Company.java
Note: Code is intensionally kept in the single class without refatored methods for fast reference. 
Please design and refactor the code based on your requirements. 



 
 