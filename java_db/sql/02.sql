select * from emp;
select * from dept;
select ename,hiredate from emp;
select ENAME,HIREDATE from EMP;
SELECT ENAME,HIREDATE FROM EMP;

select ename,sal,comm from emp;

select ename,sal,sal*12,comm from emp;
select ename,sal,sal*12 as 연봉,comm from emp;

--유일하게 오라클에서 " " 쓰는 경우
select ename,sal,sal*12 as "연   봉",comm from emp;
--오라클에서 as 생략 가능
select ename,sal,sal*12 "연   봉",comm from emp;

desc dept;

select dname, loc from dept;

conn hr/hr
select * from employees;
select first_name,job_id,department_id from employees;

conn SCOTT/TIGER
select empno, ename,sal,comm from emp;
select empno, ename,sal,comm,sal+comm 월급여 from emp;
select empno, ename,sal,comm,sal+comm from emp;

select empno, ename,sal,comm,nvl(comm,0) from emp;
--nvl(comm,0) => comm이 null 이 아니라면 comm 값을 넣고, null 이라면 0 값을 넣음. 괄호 안의 값은 데이터타입이 일치 해야함(정수이거나 실수)
select empno, ename,sal,comm,nvl(comm,0), nvl(sal+comm,sal) 월급여 from emp;
select empno, ename,sal,comm,nvl(comm,0), sal+nvl(comm,0) 월급여 from emp;

select empno, ename,sal,comm,nvl(comm,0), sal+nvl(comm,0) 월급여, 12*(sal+nvl(comm,0)) 연봉 from emp;

select empno, ename,mgr,deptno from emp;
select empno, ename,nvl(mgr,'CEO'),deptno from emp;   X
select empno, ename,nvl(to_char(mgr),'CEO')MGR ,deptno from emp;  


select empno , ename,sal ||'원' from emp;

## dual 가상의 테이블
select 10*24*24 from dept;
select 10*24*24 from dual;

select sysdate from dual;

## 중복제거 (distinct)

select job from emp;
select distinct job from emp;

select deptno from emp;
select distinct deptno from emp;


##row 제한 where 절 사용 (where 절에서는 별칭 (as) 사용 불가 !!!)
select *
from emp
where deptno = 20;

## 대소문자 구분하지 않고 검색 가능 하도록 합니다.
--항상 비교할때는 똑같이 해주고 해야함
select *
from emp
where UPPER(job) = UPPER('MANAGER');

select *
from emp
where LOWER(job) = LOWER('MANAGER');

select *
from emp
where hiredate = '81/09/28';

select *
from emp
where hiredate > '81/09/28';

-- <> 는 != 랑 똑같이 작용
select *
from emp
where hiredate <> '81/09/28';


select *
from emp
where hiredate != '81/09/28';

select *
from emp
where sal > 3000;

select *
from emp
where sal >= 3000 and sal <= 5000;

-- Between A and B : 반드시 앞에가 작은 값 뒤에가 큰 값
select *
from emp
where sal between 3000 and 5000;

select *
from emp
where sal not between 3000 and 5000;

select * 
from emp 
where deptno = 20;

select * 
from emp 
where deptno = 10 or deptno=20;

## 집합연산자 IN
--or 연산자를 썼을 때와 결과가 동일
select * 
from emp 
where deptno IN(10,20);

select * 
from emp 
where deptno not IN(10,20);

select * 
from dept
where (deptno,loc) IN((10,'DALLAS'),(30,'CHICAGO'));
--deptno가 10이면서 loc가 DALLAS  !!이거나!! deptno가 30이면서 CHICAGO 인 목록 

##like 연산자
select *
from emp
where ename = 'ALLEN';

select *
from emp
where ename like 'ALLEN';

select *
from emp
where ename like '%S';

select *
from emp
where ename like '%M_T%';

## 81년도에 입사한 사원 목록 추출
select *
from emp
where hiredate like '81%';

select *
from emp
where hiredate not like '81%';

##이름이 A B C d 로 시작하는 사원의 목록
select *
from emp
where ename like 'A%'or ename like'B%'or ename like'C%'or ename like'd%';

##정규식 사용 
select *
from emp
where regexp_like(ename,'A|B|C|D');

-- ^ 시작을 의미
select *
from emp
where regexp_like(ename,'^[A-D]');

--A~D 중에 문자로 끝나는 사원
select *
from emp
where regexp_like(ename,'[A-D]$');

## null
--null 비교는 is null
select *
from emp
where comm = null;

select *
from emp
where comm is null;

select *
from emp
where comm is not null;

##row 제한 where 절 사용 (where 절에서는 별칭 (as) 사용 불가 !!!)

select ename, sal, comm, sal+nvl(comm,0) total
from emp
where sal+nvl(comm,0)>3000;

select ename,sal,comm,sal+nvl(comm,0) total
from emp
where deptno=20;

## 정렬 order by 기본 오름차순 ,

select ename, sal,comm,sal+nvl(comm,0) total,deptno
from emp
order by deptno;

select ename, sal,comm,sal+nvl(comm,0) total,deptno
from emp
order by deptno DESC;

select ename, sal,comm,sal+nvl(comm,0) total,deptno
from emp
order by total;

-- order by 칼럼인데스 (두번째 칼럼을 오름차순으로 정렬)
select ename, sal,comm,sal+nvl(comm,0) total,deptno
from emp
order by 2;

select ename, sal,comm,sal+nvl(comm,0) total,deptno
from emp
order by deptno desc, total;

select *
from emp
where deptno = 30
order by sal;

select *
from emp
where deptno in (20,30);

select *
from emp
where deptno = any(20,30)
order by sal;

select *
from emp
where deptno != all(20,30)
order by sal;

select *
from emp
where deptno <> all(20,30)
order by sal;

select *
from emp
where dep
tno <> all(20,30)
order by sal;

##내장함수 p204 single row function

select * from dept;
select dname,loc from dept;
select dname,lower(dname),loc,lower(loc) from dept;

select round(45.5678,3), trunc(45.5678) from dual;

select sysdate , sysdate+1 from dual;

select ename, hiredate from emp;
select ename, hiredate,SUBSTR(hiredate,1,2) 입사연도 from emp;

select sysdate, to_char(sysdate,'YYYY') from dual;
select sysdate, to_char(sysdate,'YY') from dual;
select sysdate, to_char(sysdate,'day') from dual;

select sysdate, to_char(sysdate,'ss') from dual;


## emp 테이블에서 사원들의 입사월을 출력해보세요.
select ename, hiredate, to_char(hiredate,'mm') 입사월 from emp;

select sysdate, TO_DATE('2019/08/14') from dual;

select sysdate, TO_DATE('08/04/19') from dual;
select sysdate, TO_DATE('08/04/19','mm/dd/yy') from dual;

##nvl(a,b) 함수
select ename, mgr, nvl(to_char(comm),'_') from emp;
select ename, mgr, nvl(comm,0) from emp;

##nvl2(a,b,c) 함수
select ename, nvl2(mgr,'O','X'), nvl(comm,0) from emp;

##decode 함수

select ename, sal, deptno, decode(deptno, 10 , sal *1,
										  20 , sal *2,
										  30 , sal *3,
										  sal) 계산 from emp;
										  
										  

