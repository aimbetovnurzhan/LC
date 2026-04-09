-- Write your PostgreSQL query statement below
select 
    id
from
(
    select
        *
        , LAG(temperature) over (order by recordDate) as prevTemp
        , LAG(recordDate) over (order by recordDate) as prevDate
    from
        Weather
)
where
    temperature > prevTemp
    and recordDate - prevDate = 1