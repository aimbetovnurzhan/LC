CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
    N := N - 1;
    RETURN QUERY (
        -- Write your PostgreSQL query statement below.
        select
            distinct(e.salary)
        from 
            Employee e
        order by e.salary desc 
        limit (N >= 0)::int offset GREATEST(N, 0)
    );
END;
$$ LANGUAGE plpgsql;