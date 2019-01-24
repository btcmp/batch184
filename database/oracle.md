# Oracle Database

## Selection
```sql
select * from employees;
select * from departments;
```

## Oracle Hello World
```sql
select 'hello world' from dual;
```

## Menampilkan tanggal sekarang
```sql
select current_date from dual;
```

## operasi matematika 
```sql
select 1 + 1 hasil from dual;
select 2 + 2 * 10 from dual;
```

## upper lower
```sql
SELECT UPPER('HAloWodrld') from dual;
SELECT LOWER('HAloWodrld') FROM DUAL;
```

## SELECT COLOMN and ALIAS NAME
```sql
select 
  emp.first_name || '-' || emp.last_name AS full_name,
  emp.first_name nama_depan, 
  emp.last_name as nama_belakang,
  emp.salary "Gaji",
  emp.salary * 2 bonus
from hr.employees emp;
```

## where conditional
```sql
select * 
  from employees 
  where 
  upper(first_name) = upper('alAna') OR 1 = 1 
  and employee_id = 100;
```

## IN condition
```sql
SELECT * FROM employees
where employee_id = 100 OR employee_id = 104 OR employee_id = 105;

SELECT * FROM employees
where employee_id in (100, 104, 105);
```

## LIKE condition 
```sql
select * from employees where first_name like '%a'
select * from employees where first_name like 'A%'
select * from employees where first_name like '%a%'
```

## JOIN
* 1. INNER JOIN
* 2. LEFT OUTER JOIN
* 3. RIGHT OUTER JOIN
* 4. SELF OUTER JOIN
* 5. CROSS JOIN

## INNER JOIN
```sql
SELECT 
  emp.first_name,
  emp.last_name,
  emp.email,
  dept.department_name
FROM  EMPLOYEES emp 
INNER JOIN DEPARTMENTS dept
ON 
emp.department_id = dept.department_id;
```

## OUTER
### LEFT
```sql
SELECT 
 *
FROM  EMPLOYEES emp 
LEFT OUTER JOIN DEPARTMENTS dept
ON 
emp.department_id = dept.department_id;
```

### RIGHT
```sql
SELECT 
  *
FROM  EMPLOYEES emp 
RIGHT OUTER JOIN DEPARTMENTS dept
ON 
emp.department_id = dept.department_id;
```

### SELF OUTER JOIN
```sql
SELECT 
  emp.first_name,
  emp.last_name,
  emp.salary,
  mng.first_name || ' ' || mng.last_name as manager,
  mng.salary
FROM EMPLOYEES emp
INNER JOIN EMPLOYEES mng
ON
emp.manager_id = mng.employee_id
```

### CROSS JOIN
```sql
SELECT * FROM EMPLOYEES
CROSS JOIN DEPARTMENTS;
```

## DISTINCT
```sql
SELECT distinct(job_id) FROM EMPLOYEES;
```

## GROUP FUNCTION
```sql
  SELECT 
    MAX(SALARY), -- UNTUK MENGHITUNG GAJI MAXIMAL
    ROUND(AVG(SALARY), 2), -- RATA RATA
    SUM(SALARY), -- TOTAL JIKA DITAMBAHKAN
    MIN(SALARY), -- GAJI TERKECIL
    COUNT(*)  -- TOTAL ROW
  FROM employees; 
```

## GROUP BY 
```sql
SELECT 
  JOB_ID,
  COUNT(*) TOTAL_PEOPLE,
  MAX(SALARY),
  MIN(SALARY),
  AVG(SALARY)
FROM EMPLOYEES
WHERE FIRST_NAME IS NOT NULL
GROUP BY JOB_ID
HAVING AVG(SALARY) < (SELECT SALARY FROM EMPLOYEES WHERE LAST_NAME = 'Hunold')
ORDER BY TOTAL_PEOPLE ASC;
```

## GROUP BY RELATION TABLE
```sql
CREATE OR REPLACE VIEW emp_view2 AS
SELECT 
  DEPT.DEPARTMENT_NAME DEPARTMENT_NAME,
  COUNT(DEPT.DEPARTMENT_ID) TOTAL,
  AVG(EMP.SALARY) AVG_SALARY,
  MAX(EMP.SALARY) MAX_SALARY
FROM EMPLOYEES EMP
JOIN DEPARTMENTS DEPT
ON EMP.DEPARTMENT_ID = DEPT.DEPARTMENT_ID
GROUP BY DEPT.DEPARTMENT_NAME;

SELECT * FROM EMP_VIEW;

SELECT * FROM EMPLOYEES;
SELECT * FROM DEPARTMENTS;
```
