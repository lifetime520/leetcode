SELECT C.Id
  FROM Weather AS C
LEFT JOIN Weather AS P ON DATE_ADD(P.Date, INTERVAL 1 DAY) = C.DATE
 WHERE C.Temperature > P.Temperature