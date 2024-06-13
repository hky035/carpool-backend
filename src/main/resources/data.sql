INSERT INTO user_details (userId, password, studentNumber, mileage) VALUES ('user1', 'password1', 22000000, 1000);
INSERT INTO user_details (userId, password, studentNumber, mileage) VALUES ('user2', 'password2', 22000001, 1000);
INSERT INTO user_details (userId, password, studentNumber, mileage) VALUES ('user3', 'password3', 22000002, 1000);
INSERT INTO user_details (userId, password, studentNumber, mileage) VALUES ('user4', 'password4', 22000002, 1000);
INSERT INTO user_details (userId, password, studentNumber, mileage) VALUES ('user5', 'password5', 22000002, 1000);
INSERT INTO user_details (userId, password, studentNumber, mileage) VALUES ('user6', 'password6', 22000002, 1000);
INSERT INTO user_details (userId, password, studentNumber, mileage) VALUES ('user7', 'password7', 22000002, 1000);
INSERT INTO user_details (userId, password, studentNumber, mileage) VALUES ('test', 'test', 22012000, 30000);


INSERT INTO post (author_id, title, description) VALUES (1, '카풀 서비스 거리 확대 요청', '카풀 서비스 이용 가능 거리가 확대되었으면 좋겠습니다.');
INSERT INTO post (author_id, title, description) VALUES (2, '마일리지 학업 관련 서비스 추가 요청', '학업 관련 마일리지 서비스가 도입되면 좋겠습니다.');
INSERT INTO post (author_id, title, description) VALUES (3, '마일리지 획득량 변동 요구', '카풀 서비스 이용 시 마일리지가 더 많이 쌓였으면 좋겠습니다.');
INSERT INTO post (author_id, title, description) VALUES (4, '클리커 앱 또는 출결앱 등과 연동 요구', '다른 교내 서비스 플랫폼과 연동이 되었으면 합니다.');
INSERT INTO post (author_id, title, description) VALUES (5, '학식 구매권 범위 확대 요청', '다양한 메뉴에서 학식 구매권 사용이 가능하면 좋겠습니다.');
INSERT INTO post (author_id, title, description) VALUES (6, '예비군 일정 추가 요청', '각 학과 예비군 일정또한 표시해주시면 카풀 서비스 활성화에 도움이 될 것 같습니다.');


INSERT INTO mileage_item (title, description, price) VALUES ('학생식당 식사 구매권', '영남대학교 교내 학생 식당에서 이용가능한 식사 구매권입니다.', '1000');

INSERT INTO mileage_item (title, description, price) VALUES ('도서관 예약권', '중앙도서관 및 과학도서관의 좌석 예약권입니다.', '1500');

INSERT INTO mileage_item (title, description, price) VALUES ('주차할인권', '영남대학교 교내 주차장 할인권입니다.', '2000');

INSERT INTO mileage_item (title, description, price) VALUES ('도서대출 연장권', '영남대학교 도서관 대출 일수 연장권입니다.', '1000');


INSERT INTO carpool (departures, arrivals, provider_id, date) VALUES ('신매역','영남대',1, '6월 11일 09:00');
INSERT INTO carpool (departures, arrivals, provider_id, date) VALUES ('두류역','영남대',2, '6월 15일 10:00');
INSERT INTO carpool (departures, arrivals, provider_id, date) VALUES ('반월당','경산 예비군 훈련장',3, '6월 1일 06:00');
INSERT INTO carpool (departures, arrivals, provider_id, date) VALUES ('경산 예비군 훈련장','영남대',4, '6월 1일 17:00');
INSERT INTO carpool (departures, arrivals, provider_id, date) VALUES ('영남대','동대구역',5, '6월 13일 14:00');
INSERT INTO carpool (departures, arrivals, provider_id, date) VALUES ('영남대','라이온즈파크',6, '6월 3일 15:30');
INSERT INTO carpool (departures, arrivals, provider_id, date) VALUES ('설화명곡역','경산 예비군 훈련장',7, '6월 30일 06:10');
