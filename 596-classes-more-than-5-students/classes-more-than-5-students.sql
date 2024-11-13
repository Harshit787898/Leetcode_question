# Write your MySQL query statement below
select class from Courses GROUP BY CLASS HAVING count(distinct student)>=5;