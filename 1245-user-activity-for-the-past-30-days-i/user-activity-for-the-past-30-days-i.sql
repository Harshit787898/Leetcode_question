# Write your MySQL query statement below
select activity_date as day,COUNT(DISTINCT USER_ID) as active_users FROM Activity where activity_date>"2019-06-27" and activity_date<="2019-07-27" group by activity_date;