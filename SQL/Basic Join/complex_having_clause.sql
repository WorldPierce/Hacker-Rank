SELECT H.HACKER_ID, H.NAME, COUNT(C.HACKER_ID) AS TOTAL
FROM HACKERS H
INNER JOIN CHALLENGES C ON H.HACKER_ID = C.HACKER_ID
GROUP BY H.HACKER_ID, H.NAME
HAVING
--only output is equal to max
TOTAL = (SELECT MAX(TMP.CNT)
        FROM (SELECT COUNT(HACKER_ID) AS CNT
             FROM CHALLENGES
             GROUP BY HACKER_ID
             ORDER BY HACKER_ID) TMP)
--or a single distinct number below MAX, NO DOUBLES if less than max
        OR TOTAL IN (SELECT T.CNT
                     FROM(SELECT COUNT(*) AS CNT
                         FROM CHALLENGES
                         GROUP BY HACKER_ID) T
                     GROUP BY T.CNT
                     HAVING COUNT(T.CNT) = 1)


ORDER BY TOTAL DESC, C.HACKER_ID