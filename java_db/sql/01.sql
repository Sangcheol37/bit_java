

alter user hr identified by hr account unlock;

sqlplus hr/hr

select * from tab;

-- tablespace 생성
create tablespace bit

datafile  'c:\lib\dib.dbf'
size 30M
autoextend on next 2M maxsize UNLIMITED;

--계정 생성 test01/1234
create user test01 identified by 1234
default tablespace bit;

drop user test01 cascade;

--권한 부여 test01/1234
grant connect to test01;
select * from tab;

--권한 회수 test01/1234
revoke connect from test01;

grant connect,resource,dba to test01;

--계정삭제

drop user test01 cascade;

--계정 생성 
create user SCOTT identified by TIGER
default tablespace bit;

GRANT CONNECT,RESOURCE TO SCOTT IDENTIFIED BY TIGER;

@c:\lib\scott.sql

show linesize;
set linesize 300;

show pagesize;
set pagesize 20;

--oracle 휴지통비우기
purge recyclebin;

select tablespace_name from dba_tablespaces;

