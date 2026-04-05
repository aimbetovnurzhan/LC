-- Write your PostgreSQL query statement below
/*with d as (
select
    rank() over (partition by email order by id) rnk
    , id 
    , email
from
    Person
)
delete --id, email
from d
where d.rnk = 1*/

delete
from person
where id not in (
SELECT MIN(id) AS id
FROM Person
GROUP BY email)