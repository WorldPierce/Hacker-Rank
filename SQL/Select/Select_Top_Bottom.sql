SELECT MIN(CITY),LENGTH(CITY) 
FROM STATION 
GROUP BY LENGTH(CITY) 
ORDER BY LENGTH(CITY) ASC limit 1; 
SELECT MIN(CITY),LENGTH(CITY) 
FROM STATION 
GROUP BY LENGTH(CITY) 
ORDER BY LENGTH(CITY) DESC limit 1