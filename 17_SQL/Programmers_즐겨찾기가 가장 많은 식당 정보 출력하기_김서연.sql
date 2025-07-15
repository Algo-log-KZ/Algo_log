SELECT FOOD_TYPE
    , REST_ID
    , REST_NAME
    , FAVORITES
FROM REST_INFO
WHERE   (food_type, favorites) IN
            (
            SELECT food_type, MAX(favorites)
            FROM rest_info
            GROUP BY food_type
            )
ORDER BY FOOD_TYPE DESC;
