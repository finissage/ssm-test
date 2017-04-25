drop database if exists `demo`;

create database if not exists `demo` default character set utf8;

use demo;

create table student(
`stu_id` int (11) not null auto_increment primary key,
`stu_name` varchar (20) not null,
`stu_age` int (11) not null,
`tea_id` int(11)
)engine=innodb default character set utf8;


create table teacher(
`tea_id` int (11) not null auto_increment primary key,
`tea_name` varchar(20) not null,
`tea_age` int(11) not null,
`create_time` timestamp not null
)engine=innodb default character set utf8;

insert into student(stu_name,stu_age,`tea_id`) values
('张三',10,1),
('李四',11,1),
('王五',12,1),
('赵六',10,1),
('田七',13,1);

insert into teacher(`tea_name`,`tea_age`) values
('小白',20),
('校长',32);