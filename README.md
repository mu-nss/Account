# 실습1. 계좌 프로젝트

<h2> Tools </h2>

1. IntelliJ IDEA Community
2. H2 Database

## H2 데이터베이스 연결

- 인메모리 방식
  - url: jdbc:h2:mem:test

### 문제점1
1. localhost8080/h2-console에 접속 시 WhiteError Pages 출력 됨
2. 포트 문제인가 싶어서 h2 기본 포트인 8082로 접속 시도했지만 이번에는 없는 페이지가 출력 됨
3. h2 버전 문제라는 글을 보고 [build.gradle] -> H2 버전을 h2:2.2.24로 변경했지만 여전히 똑같은 1, 2 문제가 생김
4. 무엇보다도 자바 파일 실행했을 때 콘솔창에 sql문이 나오지 않음

  -> 일단 h2 실행파일 다운 받은게 있어서 yml 수정해서 시도해보아야 할 것 같음 >> 실패(테이블 생성 안 됨)</br>
  -> 강사님 yml 파일만 붙여넣었는데... 해결됐다.... 이해가 안 된다.. 코드 완전 똑같았는데...</br>
  -> tab 주의하자..</br>


### 문제점2
<p>
  sql 파일에 사용자 데이터 추가 후 account.http 실행했는데 500번이 계속해서 발생되었다.<br>
  처음에는 구글링을 통해서 수정해봤지만 소용이 없었는데 에러 메세지에 constructor 관련 내용을 발견 후<br>
  CreateAccount 클래스에 @NoArgsConstructor 추가하고 실행했더니 정상 작동되는 것을 확인했다.<br>
  <br>
  강사님 코드는 @NoArgsConstructor 붙여주지 않아도 테스트 통과되는데 안 되는 이유를 좀 더 찾아봐야할 것 같다.<br>
  transaction > 잔액 파트 부분에서 어노테이션 안 붙였는데 같은 에러가 나왔음

</p>