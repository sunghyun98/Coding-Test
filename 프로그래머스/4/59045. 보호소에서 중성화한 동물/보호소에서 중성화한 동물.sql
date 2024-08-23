-- 코드를 입력하세요ㅇㅇ
SELECT I.animal_id, I.animal_type, I.name
FROM ANIMAL_OUTS O
JOIN (SELECT * FROM ANIMAL_INS WHERE SEX_UPON_INTAKE LIKE '%Intact%') I
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE O.sex_upon_outcome LIKE '%Spayed%' OR O.sex_upon_outcome LIKE '%Neutered%'
ORDER BY I.ANIMAL_ID