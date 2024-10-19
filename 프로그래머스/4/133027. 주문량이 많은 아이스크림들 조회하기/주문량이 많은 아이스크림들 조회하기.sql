SELECT h.flavor
FROM 
    (select flavor, sum(total_order) AS sum 
     from first_half group by flavor order by flavor) h,
    (select flavor, sum(total_order) AS sum 
     from july group by flavor order by flavor) j
WHERE h.flavor = j.flavor
ORDER BY h.sum + j.sum DESC
FETCH FIRST 3 ROWS ONLY;