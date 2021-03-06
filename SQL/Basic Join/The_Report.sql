SELECT CASE WHEN G.GRADE > 7 THEN S.NAME ELSE NULL END, G.GRADE, S.MARKS
FROM STUDENTS S INNER JOIN GRADES G
ON S.MARKS BETWEEN G.MIN_MARK AND G.MAX_MARK
ORDER BY G.GRADE DESC, S.NAME, S.MARKS;