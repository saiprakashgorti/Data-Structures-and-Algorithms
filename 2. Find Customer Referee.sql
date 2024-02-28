/*

584. Find Customer Referee
https://leetcode.com/problems/find-customer-referee/description/?envType=study-plan-v2&envId=top-sql-50 

*/

-- SELECT NAME FROM THE CUSTOMER TABLE
SELECT NAME
FROM CUSTOMER

-- FILTER RECORDS WHERE REFEREE_ID IS NOT EQUAL TO 2 OR REFEREE_ID IS NULL
-- This part of the query filters the records where the REFEREE_ID column is not equal to 2 or is NULL.
WHERE REFEREE_ID != 2 OR REFEREE_ID IS NULL;
