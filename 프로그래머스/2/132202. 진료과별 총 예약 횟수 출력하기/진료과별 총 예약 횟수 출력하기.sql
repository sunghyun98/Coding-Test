SELECT MCDP_CD AS "진료과코드"
    , COUNT(*) AS "5월예약건수" --진료과코드 별 예약한 환자 수
FROM APPOINTMENT 
WHERE TO_CHAR(APNT_YMD, 'YYMM') = '2205' --조건1: 2022년 5월에 예약한 환자
GROUP BY MCDP_CD
--진료과별 예약한 환자 수를 기준으로 오름차순 정렬, 예약한 환자 수가 같다면 진료과 코드를 기준으로 오름차순 정렬
ORDER BY COUNT(*), MCDP_CD;