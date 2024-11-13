# Write your MySQL query statement below
select distinct user_id,COUNT(user_id) as followers_count from Followers group by user_id order by user_id;