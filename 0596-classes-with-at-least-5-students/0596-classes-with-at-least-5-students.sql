-- Write your PostgreSQL query statement below
with d as(
select
    count(student) as cnt,
    class
from
    Courses
group by class
)
select 
    class
from 
    d
where 
    d.cnt > 4