# 실습1. 계좌 프로젝트 
## Tools
1. IntelliJ IDEA Community
2. H2 Database

<hr>

## H2 데이터베이스 연결

- 인메모리 방식
  - url: jdbc:h2:mem:test


### 문제점
1. localhost8080/h2-console에 접속 시 WhiteError Pages 출력 됨
2. 포트 문제인가 싶어서 h2 기본 포트인 8082로 접속 시도했지만 이번에는 없는 페이지가 출력 됨
3. h2 버전 문제라는 글을 보고 [build.gradle] -> H2 버전을 h2:2.2.24로 변경했지만 여전히 똑같은 1, 2 문제가 생김
4. 무엇보다도 자바 파일 실행했을 때 콘솔창에 sql문이 나오지 않음

  -> 일단 h2 실행파일 다운 받은게 있어서 yml 수정해서 시도해보아야 할 것 같음


