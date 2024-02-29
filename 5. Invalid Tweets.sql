/**

1683. Invalid Tweets
https://leetcode.com/problems/invalid-tweets/description/?envType=study-plan-v2&envId=top-sql-50

**/

-- SELECT TWEET_ID FROM THE TWEETS TABLE
SELECT TWEET_ID
FROM TWEETS

-- FILTER RECORDS WHERE LENGTH OF CONTENT IS GREATER THAN 15 CHARACTERS
-- This part of the query filters the records where the length of the CONTENT column is greater than 15 characters.
WHERE LENGTH(CONTENT) > 15;
