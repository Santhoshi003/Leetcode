/* Write your PL/SQL query statement below */
select score ,
DENSE_RANK()OVER(order by score desc) as rank
from scores
order by rank;
