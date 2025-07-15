SELECT     b.category
         , SUM(s.sales) AS total_sales
FROM       book b
INNER JOIN book_sales s ON b.book_id = s.book_id
WHERE      s.sales_date BETWEEN DATE '2022-01-01' AND DATE '2022-01-31'
GROUP BY   b.category
ORDER BY   b.category ASC;
