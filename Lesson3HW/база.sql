select * from students;
CREATE USER 'university'@'localhost' IDENTIFIED BY 'university';
GRANT ALL PRIVILEGES ON * . * TO 'university'@'localhost';
drop table students;
create table students (
id int(11) not null auto_increment,
first_name varchar(100) DEFAULT NULL,
last_name varchar(100) default null,
birth_date int (11),
courses varchar(100),
primary key(id)
)engine=InnoDB charset=utf8;

