-- Write your PostgreSQL query statement below
with d as(
select
    count(*)
    , book_id
from
    borrowing_records
where 
    return_date is null
group by
    book_id)
select 
    b.book_id
    , b.title
    , b.author
    , b.genre
    , b.publication_year
    , d.count as current_borrowers 
from
    library_books b
        left join d on b.book_id = d.book_id
where
    b.total_copies = d.count
order by
    b.total_copies desc, b.title asc 