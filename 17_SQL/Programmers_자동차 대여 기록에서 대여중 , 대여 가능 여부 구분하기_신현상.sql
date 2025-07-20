SELECT A.CAR_ID, NVL2(B.CAR_ID, '대여중', '대여 가능') AS AVAILABILTY
  FROM (
        SELECT CAR_ID
          FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
         GROUP BY CAR_ID
       ) A ,
       (
        SELECT CAR_ID
          FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
         WHERE START_DATE <= TO_DATE('2022-10-16', 'yyyy-mm-dd')
           AND END_DATE >= TO_DATE('2022-10-16', 'yyyy-mm-dd')
       ) B
 WHERE B.CAR_ID (+) = A.CAR_ID
 ORDER BY A.CAR_ID DESC;
