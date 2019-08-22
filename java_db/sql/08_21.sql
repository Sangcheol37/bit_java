--게시판 관련 sql 작성

--system 설정-----------------------------
create user boardsql identified by 1234
default tablespace bit;

grant connect,resource to boardsql;
-----------------------------------------
conn boardsql/1234;

CREATE TABLE Users (
  id   	      VARCHAR2(30) PRIMARY KEY,
  password    NUMBER(10),
  name   	  VARCHAR2(30),
  role  	  VARCHAR2(30) 
);

ALTER TABLE Users MODIFY (role DEFAULT 'USER');

CREATE TABLE Board (
  num      NUMBER PRIMARY KEY,
  title    VARCHAR2(30),
  contents VARCHAR2(300),
  regdate DATE,
  cnt NUMBER,
  id  VARCHAR2(10),
  FOREIGN KEY (id) REFERENCES Users(id) ON DELETE CASCADE
);


--회원등록

INSERT INTO Users values('user1',1234,'홍길동',default);
INSERT INTO Users values('user2',12345,'박길동','USER');
INSERT INTO Users values('user3',1233,'고길동','USER');
INSERT INTO Users values('user4',3355,'이태원','USER');
INSERT INTO Users values('user5',7179,'김태원','USER');
INSERT INTO Users values('admin',9999,'admin','admin');

--회원 정보수정
UPDATE Users SET password='1333' where id='user1';

--로그인
select id
from users
where password='';

--게시판 글 등록 <여기서부터 다시>
CREATE sequence num_seq start with 1 increment by 1;
CREATE sequence cnt_seq start with 1 increment by 1;

INSERT INTO Board (num,title,contents,regdate,cnt,id) values(num_seq.nextval,'SQL','화이팅',TO_DATE('2019-08-11','yyyy-mm-dd'),nvl(cnt,0),'user1');

select cnt_seq
from board
where title='SQL';


