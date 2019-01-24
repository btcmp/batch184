# ORACLE INTRO SQL SAMPLE SCRIPT

```sql
-- DML 
-- CRUD
-- 1. create => Insert 
-- 2. read => Select
-- 3. update => Update
-- 4. delete => Delete
-- show data
select * from employees;
select * from departments;

-- hello world
select 'hello oracle db' from dual;

-- Math Operation
select 1+1 from dual;
select 2+5*2 from dual;

-- now
select current_date from dual;

-- function internal
-- upper
select upper('Xsis Mitra Utama') from dual;
-- lower
select lower('Xsis MItra Utama') from dual;

-- Access Table
select 
  FIRST_NAME nama_depan,
  LAST_NAME as nama_belakang,
  EMAIL "email peserta"
from employees;

-- kolom, field
select 
  FIRST_NAME nama_depan,
  LAST_NAME as nama_belakang,
  EMAIL "email peserta",
  'hello text' as MY_TEXT,
  FIRST_NAME || ' ' || LAST_NAME as FULL_NAME
from employees;

-- WHERE Conditional
select * from employees;
-- single data result
  select * from employees where employee_id = '100';
-- multiple data results
  select * from employees 
  where 
  upper(FIRST_NAME) = upper('steven') 
    OR upper(FIRST_NAME) = upper('lex')
    or 1 = 1;

-- IN keyword condition
select * from employees where 
  employee_id = '100' or employee_id = '104';
  
select * from employees where 
  employee_id in ('100', '104');

-- LIKE 
select * from employees where
  upper(first_name) like upper('%lex%');
  
-- JOIN
--- 1. INNER
--- 2. OUTER JOIN
---     * LEFT OUTER JOIN
---     * RIGHT OUTER JOIN
--- 3. CROSS JOIN
--- 4. SELF JOIN

--- #INNER JOIN
select * from employees;
select * from departments where department_id = 60;

select 
  first_name, 
  emp.department_id, 
  dept.DEPARTMENT_NAME 
from employees emp
inner join DEPARTMENTS dept
on emp.department_id = dept.DEPARTMENT_ID;

-- OUTER LEFT
select 
  first_name, 
  emp.department_id, 
  dept.DEPARTMENT_NAME 
from employees emp
left outer join DEPARTMENTS dept
on emp.department_id = dept.DEPARTMENT_ID;

-- OUTER RIGHT
select 
  first_name, 
  emp.department_id, 
  dept.DEPARTMENT_NAME 
from DEPARTMENTS dept
left outer join employees emp
on emp.department_id = dept.DEPARTMENT_ID;

-- Cross 
select 
  first_name, 
  emp.department_id, 
  dept.DEPARTMENT_NAME 
from employees emp
cross join DEPARTMENTS dept
on emp.department_id = dept.DEPARTMENT_ID;

-- SELF JOIN
select 
  emp.first_name, 
  --emp.manager_id,
  emp_manager.first_name as manager_name
  from employees emp 
  join employees emp_manager
  on
    emp.manager_id = emp_manager.employee_id
    
-- Distinct
select distinct(job_id) from employees;

-- Group Function
-- 1. max
-- 2. min
-- 3. sum
-- 4. avg
-- 5. count

-- SIngle Function
select upper(first_name) from employees;
select upper('hallo data') from dual;

-- group function
select max(salary) from employees;
select min(salary) from employees;
select sum(salary) from employees;
select round(avg(salary),2) from employees;
select count(*) from employees
select * from employees where salary = 2100

-- GROUP BY
select 
  job_id, 
  count(*) as jumlah,
  sum(salary) as totalSalary,
  avg(salary) as rata2,
  min(salary) as minSalary,
  max(salary) as maxSalary
from employees 
group by job_id 
having count(*) < 5

-- Menampilkan data employee job_id diatas rata rata
select 
  job_id, 
  count(*) as jumlah,
  sum(salary) as totalSalary,
  avg(salary) as rata2,
  min(salary) as minSalary,
  max(salary) as maxSalary
from employees 
group by job_id 
having avg(salary) < (select avg(salary) from employees)

select 
  dept.department_name, 
  count(*) as jumlah,
  sum(salary) as totalSalary,
  avg(salary) as rata2,
  min(salary) as minSalary,
  max(salary) as maxSalary
from employees emp
join departments dept
on emp.department_id = dept.department_id
group by dept.department_name 
having avg(salary) > (select avg(salary) from employees) --subquery
```