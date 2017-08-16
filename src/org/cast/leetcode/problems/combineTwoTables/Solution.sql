Select P.FirstName
     , P.LastName
     , A.City
     , A.State
  From Person P
LEFT JOIN Address A ON A.PersonId = P.PersonId