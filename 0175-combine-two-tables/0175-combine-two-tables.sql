-- Write your PostgreSQL query statement below
select firstName, lastName, city, state
from Person t
    left join Address a
        on t.personID = a.personID