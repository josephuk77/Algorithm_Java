WITH RECURSIVE GEN AS (
    -- 1세대 (부모 없는 애들)
    SELECT 
        ID,
        PARENT_ID,
        1 AS GENERATION
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL

    UNION ALL

    -- 자식으로 내려가면서 세대 +1
    SELECT
        C.ID,
        C.PARENT_ID,
        G.GENERATION + 1
    FROM ECOLI_DATA C
    JOIN GEN G
        ON C.PARENT_ID = G.ID
)

SELECT ID
FROM GEN
WHERE GENERATION = 3
ORDER BY ID;