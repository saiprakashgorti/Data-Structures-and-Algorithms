/**

595. Big Countries
https://leetcode.com/problems/big-countries/description/?envType=study-plan-v2&envId=top-sql-50

**/

-- SELECT NAME, POPULATION, AND AREA FROM THE WORLD TABLE
SELECT NAME, POPULATION, AREA
FROM WORLD

-- FILTER RECORDS WHERE AREA IS GREATER THAN OR EQUAL TO 3,000,000 OR POPULATION IS GREATER THAN OR EQUAL TO 25,000,000
-- This part of the query filters the records where the AREA column is greater than or equal to 3,000,000 square units or the POPULATION column is greater than or equal to 25,000,000.
WHERE AREA >= 3000000 OR POPULATION >= 25000000;
