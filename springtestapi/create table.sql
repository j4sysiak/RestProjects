Use springtestapi;
-- drop schema springtestapi;

-- drop table tbl_employee; 
/*
create table tbl_employee 
(
id int not null AUTO_INCREMENT PRIMARY KEY,
name varchar(255)  not null, 
age int not null,
location varchar(255)  not null,
email varchar(255)  not null,
department varchar(255)  not null,
created_at varchar(255)  not null,
updated_at varchar(255)  not null
);

insert into tbl_employee (name, age, location, email, department, created_at, updated_at) values (
"Jacek", 28, "WAW", "jacek@wp.pl", "IT", "2022-04-28 04:21:27.631000", "2022-04-28 04:21:27.631000"
);

insert into tbl_employee (name, age, location, email, department, created_at, updated_at) values (
"Andrzej", 33, "BER", "andrzej@wp.pl", "Księgowość", "2022-04-28 04:21:27.631000", "2022-04-28 04:21:27.631000"
);

insert into tbl_employee (name, age, location, email, department, created_at, updated_at) values (
"Adam", 55, "BER", "adam@wp.pl", "Director", "2022-04-28 04:21:27.631000", "2022-04-28 04:21:27.631000"
);

insert into tbl_employee (name, age, location, email, department, created_at, updated_at) values (
"Wacek", 44, "LON", "andrzej@wp.pl", "Bussiness", "2022-04-28 04:21:27.631000", "2022-04-28 04:21:27.631000"
);
*/
SELECT * FROM springtestapi.tbl_employee;
SELECT * FROM springtestapi.tbl_employee where name = "Andrzej" OR location = "BER";

-- delete from springtestapi.tbl_department;
-- drop table springtestapi.tbl_department;
SELECT * FROM springtestapi.tbl_department;

select 
employee0_.id as id1_1_, 
employee0_.department_id as departme3_1_, 
employee0_.name as name2_1_ 
from tbl_employee employee0_ 
left outer join tbl_department department1_ 
on employee0_.department_id=department1_.id 
where department1_.name="IT"
;



-------------------------------------------------------------------
drop table springtestapi.tbl_product;
CREATE TABLE springtestapi.`tbl_product` (
  `id` bigint NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SELECT * FROM springtestapi.tbl_product;
INSERT INTO `springtestapi`.`tbl_product`
(`id`,
`description`,
`name`,
`price`)
VALUES (
1,
"asdasd",
"kkkkkkkkkk",
100);
commit;

delete from springtestapi.tbl_product where id > 0;
SELECT * FROM springtestapi.tbl_product;
