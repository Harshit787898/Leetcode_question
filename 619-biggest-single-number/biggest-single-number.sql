# Write your MySQL query statement below
select max(NUM) as num from ( select num from MyNumbers GROUP BY NUM HAVING count(num)=1) as unique_table;