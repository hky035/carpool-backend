# OSS Project - 교내 카풀 서비스

>📌 frontend : https://github.com/hky035/carpool-frontend<br/>
📌 backend : https://github.com/hky035/carpool-backend


## Commit 컨벤션 
| Tag | description |
|---|---|
|feat|새로운 기능 추가, 요구사항에 맞추어 수정|
|chore|패키지 매니저 수정, 그 외 기타 수정|
|design|스타일 수정|
|refactor|코드 리팩터링, 포맷팅 관련 수정|
|docs|README, 문서 수정|

## 실행 방법
1. 해당 리포지토리를 fork하여 자신의 리포지토리로 가져온다.
2. fork 후, 자신의 리포지토리에 접속한다.
3. 우측 상단의 **<> Code**를 클릭한 뒤 HTTPS에서 자신의 리포지토리 url을 복사한다.
![image](https://github.com/hky035/carpool-backend/assets/128910345/36290dff-59bf-4448-9513-0f4b02f981b3)
4. git bash(mac은 terminal)를 열어 해당 리포지토리를 clone한다.
![image](https://github.com/hky035/carpool-backend/assets/128910345/04436cb1-a914-461d-81b9-7dcdb00723b9)
5. 해당 디렉토리에 접속한 뒤 `chmod 755 ./gradlew` 명령어를 입력하여 gradlew를 실행시키기 위한 권한을 변경한다.

6. 권한 변경이 완료되면 `./gradlew build` 명령어를 입력하여 프로젝트를 빌드한다.
![image](https://github.com/hky035/carpool-backend/assets/128910345/1eb843e5-0442-42b1-85ce-65843728e7de)
7. `cd build/libs` 명령어를 입력하여 실행 파일이 있는 디렉토리로 이동한다.
![img](https://github.com/hky035/carpool-backend/assets/128910345/bf1e3e54-a225-46f4-a656-4784b52828ce)
8. `java -jar carpool-0.0.1-SNAPSHOT.jar` 명령어를 입력하여 실행한다.
`java -jar c` 까지만 입력한 뒤 탭을 누르면 `java -jar carpool-0.0.1-SNASHOT`까지는 자동완성된다.
![img](https://github.com/hky035/carpool-backend/assets/128910345/6f77002b-95c4-4060-8b40-4f6a9a010d13)
9. 위와 같이 실행이 정상적으로 되었을 경우 브라우저에서 `http://localhost:3000`으로 접속한다.

## 트러블 슈팅

만약, 실행 후 한글이 깨진 채 나오는 현상이 발생한다면 jar 파일 실행 시 인코딩 방식을 추가한다.

8-a. 실행 시 인코딩 설정 추가 `java -jar -Dfile.encoding=UTF-8 carpool-SNAPSHOT.jar`
![img](https://github.com/hky035/carpool-backend/assets/128910345/b6b7ad9f-4342-46d3-a959-34b350ee45a3)


