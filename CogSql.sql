-- CREATE TABLE departments (
--     dept_id INT PRIMARY KEY,
--     dept_name VARCHAR(50)
-- );

-- CREATE TABLE employees (
--     id INT PRIMARY KEY,
--     name VARCHAR(50),
--     department_id INT,
--     salary DECIMAL(10, 2),
--     age INT,
--     FOREIGN KEY (department_id) REFERENCES departments(dept_id)
-- );

-- INSERT INTO departments VALUES (1, 'IT'), (2, 'HR');
-- INSERT INTO employees VALUES (5, 'dopa', 2, 1000, 38), (3, 'John', 1, 50000, 35);

-- select department_id  , AVG(salary) AS AVF_SALARY FROM EMPLOYEES
-- GROUP BY department_id
-- having AVG(salary) > 200;

-- select MAX(salary) from employees;

-- SELECT COUNT(*), MAX(salary), AVG(salary) FROM employees;
-- SELECT name, LENGTH(name), UPPER(name) FROM employees;

-- SELECT * FROM employees WHERE name LIKE 'A%';


-- SELECT e.name, d.dept_name 
-- FROM employees e
-- JOIN departments d ON e.department_id = d.dept_id
-- ;


-- select * from employees;
-- select * from departments;


-- SELECT  e.id , e.name , e.department_id , d.dept_name, e.salary , e.age ,AVG(e.salary) AS avg_salary
-- FROM employees e
-- JOIN departments d ON e.department_id = d.dept_id
-- WHERE d.dept_name = 'HR'
-- GROUP BY e.id , e.name , e.department_id , d.dept_name, e.salary , e.age 
-- HAVING AVG(e.salary) * 10 > 20;



-- select d.dept_id , d.dept_name , AVG(e.salary) as avg_sal
-- from employees e
-- join departments d on e.department_id = d.dept_id
-- group by d.dept_id , d.dept_name 


-- select count(e.id) as total_emp , d.dept_name
-- from employees e
-- join departments d on e.department_id = d.dept_id
-- group by d.dept_name


-- select sum(e.salary) as total_salary , d.dept_id , d.dept_name , count(e.id) as total_employees
-- from employees e
-- join departments d on e.department_id = d.dept_id
-- group by d.dept_id , d.dept_name
-- having count(e.id) > 0 limit 1;

-- SELECT d.dept_name, SUM(e.salary) AS total_salary
-- FROM employees e
-- JOIN departments d ON e.department_id = d.dept_id
-- GROUP BY d.dept_name
-- ORDER BY total_salary DESC
-- LIMIT 1 offset 1;


-- CREATE TABLE purchases (
--   id INT,
--   customer_id INT,
--   product_id INT,
--   purchase_date DATE,
--   amount DECIMAL(10,2)
-- );
-- CREATE TABLE customers (
--   customer_id INT PRIMARY KEY,
--   customer_name VARCHAR(100),
--   signup_date DATE
-- );
-- CREATE TABLE products (
--   product_id INT PRIMARY KEY,
--   product_name VARCHAR(100),
--   category VARCHAR(50)
-- );


-- INSERT INTO customers (customer_id, customer_name, signup_date) VALUES
-- (1, 'Alice Johnson', '2023-01-15'),
-- (2, 'Bob Smith', '2023-03-22'),
-- (3, 'Charlie Lee', '2023-06-10'),
-- (4, 'Diana Brown', '2023-08-05'),
-- (5, 'Ethan White', '2023-09-18');



-- INSERT INTO products (product_id, product_name, category) VALUES
-- (101, 'Wireless Mouse', 'Electronics'),
-- (102, 'Water Bottle', 'Home & Kitchen'),
-- (103, 'Notebook', 'Stationery'),
-- (104, 'Headphones', 'Electronics'),
-- (105, 'Yoga Mat', 'Fitness');


-- INSERT INTO purchases (id, customer_id, product_id, purchase_date, amount) VALUES
-- (1, 1, 101, '2023-02-01', 25.99),
-- (2, 2, 103, '2023-03-25', 5.49),
-- (3, 3, 104, '2023-06-15', 79.99),
-- (4, 4, 105, '2023-08-10', 19.99),
-- (5, 5, 102, '2023-09-20', 12.00);







-- SELECT
--   p.id,
--   c.customer_id,
--   c.customer_name,
--   c.signup_date,
--   pr.product_id,
--   pr.product_name,
--   pr.category,
--   p.purchase_date,
--   p.amount
-- FROM purchases p
-- JOIN customers c ON p.customer_id = c.customer_id
-- JOIN products pr ON p.product_id = pr.product_id
-- GROUP BY
--   p.id,
--   c.customer_id,
--   c.customer_name,
--   c.signup_date,
--   pr.product_id,
--   pr.product_name,
--   pr.category,
--   p.purchase_date,
--   p.amount;
--  Customers Who Purchased on Consecutive Days
-- select distinct a.customer_id
-- from purchases a
-- join purchases b on 
-- a.customer_id = b.customer_id
-- and datediff(a.purchase_date , b.purchase_date) ;





-- Q2. Customers Who Bought the Same Product More Than Once
-- SELECT customer_id, product_id
-- FROM purchases
-- GROUP BY customer_id, product_id
-- HAVING COUNT(*) > 1;

-- same day purchase 
-- SELECT DISTINCT a.customer_id, b.customer_id, a.purchase_date
-- FROM purchases a
-- JOIN purchases b 
--   ON a.purchase_date = b.purchase_date
-- and a.customer_id < b.customer_id;  












