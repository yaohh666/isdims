create table store(
store_id integer not null auto_increment primary key,
store_name varchar(50) not null,
region varchar(50) not null,
manager varchar(50) not null,
amount float not null default 0
);
create table commodity(
commodity_id integer not null auto_increment primary key,
commodity_name varchar(50) not null,
category varchar(50) not null,
cost float not null,
price float not null
);
create table sale(
store_id integer not null,
commodity_id integer not null ,
date integer not null,
number integer not null,
foreign key(store_id) references store(store_id),
foreign key(commodity_id) references commodity(commodity_id)
);
insert into commodity(commodity_name,category,cost,price)
values('计算机网络','图书','35.8','59.8');
insert into commodity(commodity_name,category,cost,price)
values('Java EE企业级开发教程','图书','29.2','48.7');
insert into commodity(commodity_name,category,cost,price)
values('山东红富士','水果','17.4','29.9');
insert into store(store_name,region,manager,amount)
values('新华书店','上海','小尧','0');
insert into store(store_name,region,manager)
values('苹果店','山东','小史');
insert into sale
values('1','2','20220815','1');
insert into sale
values('1','2','20221222','1');
update store
set amount=97.4
where store_id=1;
create table user(
id integer not null auto_increment primary key,
username varchar(50) not null,
password varchar(50) not null
);
insert into user(username,password)
values('admin','12345');