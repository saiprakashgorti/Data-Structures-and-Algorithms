/**

1148. Article Views I
https://leetcode.com/problems/article-views-i/description/?envType=study-plan-v2&envId=top-sql-50

**/

-- SELECT DISTINCT AUTHOR_ID RENAMED AS ID FROM THE VIEWS TABLE
SELECT DISTINCT AUTHOR_ID AS ID
FROM VIEWS

-- FILTER RECORDS WHERE AUTHOR_ID IS EQUAL TO VIEWER_ID
-- This part of the query filters the records where the AUTHOR_ID column is equal to the VIEWER_ID column.
WHERE AUTHOR_ID = VIEWER_ID
-- SORT THE RESULTS IN ASCENDING ORDER BASED ON THE ID
ORDER BY ID ASC;
