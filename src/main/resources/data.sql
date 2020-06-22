
create TABLE if not exists T_USER (
ID INT(5) PRIMARY KEY,
EMP_ID VARCHAR(15),
ACCESS_KEY VARCHAR(20) ,
COUNTRY VARCHAR(8)
);

insert into T_USER  values( 1, 'Miller','TRMILLR', 'SG');
insert into T_USER  values( 2, 'Tessa','TRTSSA', 'SG');
insert into T_USER  values( 3, 'Dosson','TRDSSN', 'HK');
insert into T_USER  values( 4, 'Ricky','TRRCKY', 'SG');
insert into T_USER  values( 5, 'Aaron','TRARON', 'SG');
insert into T_USER  values( 6, 'BOB','TRBOB', 'HJ');

create TABLE if not exists T_TEAM_HIERARCHY (
ID INT(5) PRIMARY KEY,
EMP_ID VARCHAR(15),
MANAGER_ID VARCHAR(20)
);

insert into T_TEAM_HIERARCHY  values( 1, 'Tessa','Miller');
insert into T_TEAM_HIERARCHY  values( 2, 'Doson','Miller');

create TABLE if not exists T_USER_ACCESS (
ID INT(5) PRIMARY KEY,
EMP_ID VARCHAR(15),
ACCESS_KEY VARCHAR(20),
COUNTRY VARCHAR(8),
SUBUSER VARCHAR(20),
SUBUSER_ACCESS_KEY VARCHAR(20),
SUBUSER_COUNTRY VARCHAR(20)
);

insert into T_USER_ACCESS  values( 1, 'Miller','TRMLLR', 'SG', 'Miller', 'TRMLLR','SG');