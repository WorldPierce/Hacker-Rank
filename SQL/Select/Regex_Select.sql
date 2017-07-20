SELECT DISTINCT(CITY)
FROM STATION
WHERE CITY NOT RLIKE '^[AEIOU].*[aeiou]$'
-- ^ checks first letter $ checks last letter