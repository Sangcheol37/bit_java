select * from EMP;

select
from
where
order by

select ename,sal from EMP where deptno=10;

--deptno가 select에 없더라도 sort 가능하다
select ename,sal from EMP order by deptno;

select ename,sal,deptno from EMP order by deptno;

##############################################
join
##############################################

--emp * dept (12*4) 개의 결과가 출력 (카테시안 곱)
select ename,dname
from emp,dept;

--오라클 전용 조인방식
select ename,dname
from emp,dept
where emp.deptno = dept.deptno;

select ename,dname,dept.deptno
from emp,dept
where emp.deptno = dept.deptno;

select ename,dname,d.deptno 부서번호,loc
from emp e,dept d
where e.deptno = d.deptno;

select *
from emp e,dept d
where e.deptno=d.deptno and sal>2500;

##############################################
ANCI join 표준     (, => join) (where => on)
##############################################

select ename,d.deptno,dname,loc
from emp e, dept d
where e.deptno = d.deptno;

오라클 join => 안시 join

select ename, d.deptno,dname,loc
from emp e join dept d
on e.deptno = d.deptno;

--inner가 생략되어있음 , 양쪽에 다 있는 걸 표현할 때 inner join
select ename, d.deptno,dname,loc
from emp e inner join dept d
on e.deptno = d.deptno;

##############################################
outer join
##############################################

select ename, hiredate,sal,dname,loc,e.deptno
from emp e, dept d
where e.deptno=d.deptno;

select * from emp;
select * from dept;

-- + null 쪽에 마킹
select ename,sal,dname,loc,e.deptno
from emp e, dept d
where e.deptno(+)=d.deptno;

select ename,sal,dname,loc,e.deptno
from emp e join dept d
on e.deptno(+)=d.deptno;

##right 쪽이 마스터 즉 dept 테이블이 마스터 테이블이 되어 모두 출력
select ename,sal,dname,loc,e.deptno
from emp e right outer join dept d
on e.deptno=d.deptno;

##left 쪽이 마스터 즉 dept 테이블이 마스터 테이블이 되어 모두 출력
select ename,sal,dname,loc,e.deptno
from emp e left outer join dept d
on e.deptno=d.deptno;

##############################################
non-equi join
##############################################

select * from salgrade;

select ename,sal,grade 
from emp e, salgrade s
where sal between losal and hisal;

==>

select ename,sal,grade
from emp e join salgrade s
on sal between losal and hisal;

##############################################
세계의 테이블 조인
##############################################

select ename, sal, dname, loc,grade,e.deptno
from emp e, dept d, salgrade s
where e.deptno=d.deptno and sal between losal and hisal and e.deptno = 20
order by e.deptno;

==> 안시 조인으로
select ename, sal, dname, loc,grade,e.deptno
from emp e 
	join dept d
	on e.deptno=d.deptno 
	join salgrade
	on sal between losal and hisal
where e.deptno=10
order by e.deptno;


select e.ename as "사원의 이름",g.ename as "상사의 이름"
from emp e, emp g
where e.mgr = g.empno;

select e.empno,e.ename 사원명,e.mgr, m.empno,m.ename 상사명
from emp e, emp m
where e.mgr = m.empno(+);

=> 안시조인으로
select e.empno,e.ename 사원명,e.mgr, m.empno,m.ename 상사명
from emp e inner join emp m
on e.mgr = m.empno;

select e.empno,e.ename 사원명,nvl(m.ename,'CEO') 상사명
from emp e left outer join emp m
on e.mgr = m.empno;

##상사보다 급여가 많은 사원 목록

select e.empno,e.ename 사원명, e.sal 사원급여, m.sal 상사급여,m.ename 상사명
from emp e, emp m
where e.mgr = m.empno and e.sal>m.sal;

=> 안시조인
select e.ename, e.sal,dname,loc, m.ename, m.sal
from emp e
	 join emp m
	 on e.mgr = m.empno
	 join dept
	 on e.deptno=dept.deptno
where e.sal>m.sal;



##############################################
집계함수
##############################################

select ename,round(sal) from emp;

select avg(sal) from emp;


select round(avs(sal)) 평균급여 from emp;

select count(empno),count(comm),count(*),count(mgr),round(avg(sal)) 평균급여
from emp;

select count(distinct job) from emp;

select sum(sal) , count(*),round(avg(sal)),sum(sal)/count(*) 평균급여
from emp;

select round(avg(sal)) 평균급여 from emp;

select round(avg(sal)) 평균급여 from emp where deptno=10;
select round(avg(sal)) 평균급여 from emp where deptno=20;
select round(avg(sal)) 평균급여 from emp where deptno=30;
select round(avg(sal)) 평균급여 from emp where deptno=40;

select * 평균급여 from emp order by deptno;

select round(avg(sal)) 평균급여
from emp
group by deptno;


select deptno, round(avg(sal)) 평균급여
from emp
group by deptno;
--select에 group by에 참여한 절만 있어야 한다

select
from
where
group by
order by

##부서 이름 별 평균 급여
select emp.deptno deptno,dept.dname,round(avg(sal)) 평균급여 
from emp,dept
where emp.deptno=dept.deptno
group by dept.dname,emp.deptno
order by 1;

select max(sal),min(sal),count(*),avg(sal)
from emp;

select deptno, max(sal),min(sal),count(*),avg(sal)
from emp
group by deptno;

select emp.deptno deptno,dept.dname,round(avg(sal)) 평균급여 
from emp join dept
on emp.deptno=dept.deptno
group by dept.dname,emp.deptno
order by 1;

##부서별 평균 급여가 2000이상
--group by 이전에 조건을 수행하려면 having절
select emp.deptno,dname, round(avg(sal)) 평균급여
from emp,dept
where emp.deptno=dept.deptno
group by dname,emp.deptno
having avg(sal)>2000;

select emp.deptno deptno,dept.dname,round(avg(sal)) 평균급여 
from emp join dept
on emp.deptno=dept.deptno
group by dept.dname,emp.deptno
having avg(sal)>2000;


###########################
#   select                #
#   from                  #
#   where                 #
#   group by              #
#   having                #
#   order by              #
###########################

select emp.deptno deptno,dept.dname,round(avg(sal)) 평균급여 
from emp join dept
on emp.deptno=dept.deptno
where sal>1000
group by dept.dname,emp.deptno
having avg(sal)>2000;

## FORD 라는 사원 보다 급여를 많이 받는 사원 리스트

##############################################
Sub Query
##############################################

select ename, sal
from emp
where sal > (select sal from emp where ename='FORD') ;

## 평균급여보다 적게 받는 사원 리스트

select *
from emp
where sal<(select avg(sal) from emp );

## 급여를 가장 적게 받는 사람

select *
from emp
where sal = (select min(sal) from emp );

## 각 부서별로 급여를 가장 적게받는 사람
##################################################
스칼라 = 단일값      벡터 = 다중값
##################################################

select deptno,ename,sal
from emp
where sal IN (select min(sal) from emp group by deptno);


###############################################################
상관관계 서브쿼리 : outer 쿼리의 컬럼중 하나가 inner 쿼리문에서 사용되는 쿼리문
###############################################################

##자신이 속한 부서의 평균 급여보다 적은 사원 리스트

select *
from emp outer
where sal < (select avg(sal) from emp where deptno=outer.deptno);

##################
rownum
##################

select rownum,ename,sal,hiredate
from emp;

select rownum,ename,sal,hiredate
from (select * from emp order by sal desc);

select rownum,ename,sal,hiredate
from (select * from emp order by sal desc)
where rownum<=3;

select rownum,ename,sal,hiredate
from (select * from emp order by sal desc)
where rownum between 1 and 4;
