Enter password: ********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 31
Server version: 9.3.0 MySQL Community Server - GPL

Copyright (c) 2000, 2025, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use anp_d1485;
Database changed
mysql> Create the table
Query OK, 0 rows affected (0.009 sec)

mysql> CREATE TABLE student (
    ->   id INT PRIMARY KEY,
    ->   name VARCHAR(10) NOT NULL,
    ->   address VARCHAR(10) NOT NULL,
    ->   age INT NOT NULL
    -> );
Query OK, 0 rows affected (0.539 sec)

mysql>
mysql> Insert 5 records
Query OK, 0 rows affected (0.003 sec)

mysql> INSERT INTO student (id, name, address, age) VALUES
    ->   (1, 'Alice',   'Delhi',   20),
    ->   (2, 'Bob',     'Mumbai',  22),
    ->   (3, 'Charlie', 'Chennai', 19),
    ->   (4, 'Diana',   'Kolkata', 21),
    ->   (5, 'Ethan',   'Pune',    23);
Query OK, 5 rows affected (0.154 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql>
mysql> Perform aggregate queries on age
Query OK, 0 rows affected (0.004 sec)

mysql> SELECT
    ->   SUM(age)   AS total_age,
    ->   AVG(age)   AS average_age,
    ->   MIN(age)   AS youngest_age,
    ->   MAX(age)   AS oldest_age,
    ->   COUNT(*)   AS total_students
    -> FROM student;
+-----------+-------------+--------------+------------+----------------+
| total_age | average_age | youngest_age | oldest_age | total_students |
+-----------+-------------+--------------+------------+----------------+
|       105 |     21.0000 |           19 |         23 |              5 |
+-----------+-------------+--------------+------------+----------------+
1 row in set (0.057 sec)

mysql>