1번)

select e.employee_id, e.first_name 사원퍼스트네임, department_name, a.first_name 매니저퍼스트네임
from employees e, employees a,departments d
where e.manager_id=a.employee_id and e.department_id=d.department_id
order by 1;


2번)

select e.last_name LAST_NAME, e.salary SALARY
from employees e, employees a
where e.manager_id=a.employee_id and e.salary>a.salary;

3번)

select first_name,last_name,salary
from employees e ,jobs j
where e.job_id=j.job_id and j.job_title = 'Sales Representative' and e.salary between 9000 and 10000;

4번)

select a.employee_id,a.last_name,a.hire_date
from employees a, employees b
where a.manager_id=b.employee_id and a.hire_date<b.hire_date
order by 1;

5번)

select distinct j.job_title , d.department_name
from jobs j,departments d,employees e
where e.job_id=j.job_id and e.department_id=d.department_id
order by 1;

6번)

select distinct(to_char(hire_date,'mm')) as 월 , count(*) as 입사자수
from employees
group by to_char(hire_date,'mm')
order by 1;

7번)

select a.first_name,a.hire_date,b.employee_id,b.first_name
from employees a, employees b
where a.manager_id=b.employee_id and to_char(a.hire_date,'yy')='08';

08번)

select first_name,salary,department_name
from employees e,departments d
where e.department_id = d.department_id and d.department_name='Sales';

09번)

select employee_id,first_name,last_name,nvl2(e.department_id,d.department_name,'<NOT ASSIGNED>') FIRST_NAME_1
from employees e,departments d
where to_char(e.hire_date,'yy')='04' and e.department_id=d.department_id
order by 1;

10번)

select a.first_name,a.hire_date,a.employee_id,nvl2(a.manager_id,b.first_name,'(null)') FIRST_NAME2
from employees a, employees b
where  a.manager_id=b.employee_id(+) and to_char(a.hire_date,'yy')='03';



