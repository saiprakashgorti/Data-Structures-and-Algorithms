/**

1378. Replace Employee ID With The Unique Identifier
https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/description/?envType=study-plan-v2&envId=top-sql-50

**/



-- SELECT UNIQUE_ID RENAMED AS UNIQUE_ID AND NAME FROM THE EMPLOYEES TABLE
SELECT EUNI.UNIQUE_ID AS UNIQUE_ID, E.NAME
FROM EMPLOYEES E

-- LEFT JOIN EMPLOYEEUNI TABLE ON EMPLOYEES.ID EQUALS EMPLOYEEUNI.ID
-- This part of the query performs a LEFT JOIN between the EMPLOYEES table and the EMPLOYEEUNI table based on the ID column.
LEFT JOIN EMPLOYEEUNI EUNI ON E.ID = EUNI.ID;
