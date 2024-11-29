# 실습1. 계좌 프로젝트
[Spring boot와 Java를 활용하여 Account(계좌관리) 시스템 구현 프로젝트]
- Account(계좌) 시스템은 사용자와 계좌의 정보를 저장하고 있으며, 외부 시스템에서 거래를 요청할 경우
  거래 정보를 받아서 계좌에서 잔액을 거래금액만큼 줄이거나(결제), 거래금액만큼 늘리는(결제 취소) 거래 관리 기능을 제공하는 시스템
- 구현의 편의를 위해 사용자 생성 등의 관리는 API로 제공하지 않고 프로젝트 시작 시 자동으로 데이터가 입력되도록 하며,
  계좌 추가/해지/확인, 거래 생성/거래 취소/거래 확인의 6가지 API를 제공한다.


## 🛠️ Tolls
1. IntelliJ IDEA Community
2. H2 Database

## :boom:기술적 이슈와 해결
### 문제점1
1. localhost8080/h2-console에 접속 시 WhiteError Pages 출력 됨
2. 포트 문제인가 싶어서 h2 기본 포트인 8082로 접속 시도했지만 이번에는 없는 페이지가 출력 됨
3. h2 버전 문제라는 글을 보고 [build.gradle] -> H2 버전을 h2:2.2.24로 변경했지만 여전히 똑같은 1, 2 문제가 생김
4. 무엇보다도 자바 파일 실행했을 때 콘솔창에 sql문이 나오지 않음
### 해결 
강사님의 yml 파일의 코드를 붙여넣었기만 했는데 해결되었다. 내 기본 tab의 수는 4칸인데 이를 고려하지 않아서 생긴 문제인 것 같다.
<br>
<br>
### 문제점2
- sql 파일에 사용자 데이터 추가 후 account.http 실행했는데 500번이 계속해서 발생되었다.
<img src="https://github.com/user-attachments/assets/2a3b404e-c08e-43bf-a6c4-b7f6fbdbd495">

### 해결
- 처음에는 구글링을 통해서 수정해봤지만 소용이 없었는데 에러 메세지에 constructor 관련 내용을 발견 후
  CreateAccount 클래스에 @NoArgsConstructor 추가하고 실행했더니 정상 작동되는 것을 확인했다.
<img src="https://github.com/user-attachments/assets/138caad6-5a59-4a32-b761-1d3d2eb9d7bd">
<img src="https://github.com/user-attachments/assets/b8440203-7f19-40db-8c47-fead7e7ee0a2">

### 돌아보기
- 강사님 코드는 @NoArgsConstructor 붙여주지 않아도 테스트 통과되는데 안 되는 이유를 좀 더 찾아봐야할 것 같다.
  transaction > 잔액 파트 부분에서 어노테이션 안 붙였는데 같은 에러가 나왔음
