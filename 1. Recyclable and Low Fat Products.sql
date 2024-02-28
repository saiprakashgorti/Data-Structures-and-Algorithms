/* 
  1757. Recyclable and Low Fat Products
  https://leetcode.com/problems/recyclable-and-low-fat-products/description/?envType=study-plan-v2&envId=top-sql-50
*/

-- SELECT PRODUCT ID FROM THE PRODUCTS TABLE
-- This query selects the product IDs from the PRODUCTS table.
SELECT PRODUCT_ID
FROM PRODUCTS

-- FILTER RECORDS WHERE LOW_FATS IS 'Y' AND RECYCLABLE IS 'Y'
-- This part of the query filters the records where the low_fats column has a value of 'Y' and the recyclable column has a value of 'Y'.
WHERE LOW_FATS = 'Y' AND RECYCLABLE = 'Y';
