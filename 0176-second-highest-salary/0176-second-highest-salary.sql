# Write your MySQL query statement below
Select MAX(salary) As SecondHighestSalary from Employee where salary<(Select MAX(salary) from Employee);