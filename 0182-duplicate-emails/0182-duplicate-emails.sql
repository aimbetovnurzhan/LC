-- Write your PostgreSQL query statement below
select
    Email
from
    (select
        email as Email
        , count(id) as cnt
    from
        Person
    group by email)
where
    cnt > 1