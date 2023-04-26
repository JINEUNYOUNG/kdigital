# 주석입니다.
-- 주석입니다.
# INSERT 
INSERT INTO memo(NAME, PASSWORD, memo) VALUES ('홍길동','1111','good');
INSERT INTO memo(NAME, PASSWORD, memo) VALUES ('임꺽정','2342','morning');
INSERT INTO memo(NAME, PASSWORD, memo) VALUES ('장길산','1342','everyone');
INSERT INTO memo(NAME, PASSWORD, memo) VALUES ('이채연','1123','good for');
INSERT INTO memo(NAME, PASSWORD, memo) VALUES ('조승연','1355','you');

# SELECT 
SELECT * FROM memo;
SELECT NAME FROM memo;

SELECT * FROM memo ORDER BY NAME;
SELECT * FROM memo ORDER BY NAME ASC;
SELECT * FROM memo ORDER BY idx DESC;

SELECT * FROM memo WHERE idx = 20;
SELECT * FROM memo WHERE NAME = '홍길동';

SELECT * FROM memo WHERE idx >= 15 && idx <= 20;
SELECT * FROM memo WHERE idx >= 15 AND idx <= 20;
SELECT * FROM memo WHERE idx BETWEEN 15 AND 20;

SELECT * FROM memo WHERE NAME = '홍길동' OR NAME = '임꺽정';
SELECT * FROM memo WHERE NAME = '홍길동' || NAME = '임꺽정';

SELECT * FROM memo WHERE NAME IN ( '홍길동' ,'임꺽정','조승연');
SELECT * FROM memo WHERE NAME NOT IN ( '홍길동' ,'임꺽정','조승연');

SELECT * FROM memo WHERE NAME LIKE '홍%';
SELECT * FROM memo WHERE NAME LIKE '%연';
SELECT * FROM memo WHERE NAME LIKE '%채%';

SELECT * FROM memo ORDER BY idx DESC LIMIT 10, 10;

SELECT SUM(idx) FROM memo WHERE idx <= 20;
SELECT AVG(idx) FROM memo WHERE idx <= 20;
SELECT MAX(idx) FROM memo WHERE idx <= 20;
SELECT MIN(idx) FROM memo WHERE idx <= 20;
SELECT COUNT(*) FROM memo ;

SELECT COUNT(*) AS '인원수' FROM memo;
SELECT COUNT(*) FROM memo;
SELECT NAME, COUNT(*) AS '인원수' FROM memo GROUP BY NAME;
SELECT NAME, COUNT(*) AS '인원수' FROM memo GROUP BY NAME HAVING NAME LIKE '%길%';

UPDATE memo SET PASSWORD = '7777' WHERE NAME = '홍길동';
UPDATE memo SET PASSWORD = '1234' WHERE NAME = '조승연';
UPDATE memo SET PASSWORD = '1111' WHERE NAME = '이채연';
UPDATE memo SET PASSWORD = '5555' WHERE NAME = '일지매';
UPDATE memo SET PASSWORD = '6666' WHERE NAME = '장길산';
UPDATE memo SET PASSWORD = '8888' WHERE NAME = '임꺽정';

DELETE FROM memo WHERE NAME = '임꺽정';
DELETE FROM memo;
ALTER TABLE memo AUTO_INCREMENT = 1;