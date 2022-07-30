# JWT_Study
###  [ JWT 기본 학습 ]

#### Spring boot를 이용해서 JWT 인증을 구현하는 튜토리얼



#### DAY - 01

JWT는 RFC 7519 웹 표준으로 지정이 되어있고, JSON 객체를 사용해서 토큰 자체에 정보들을 저장하고 있는 Web Token이라고 정의할 수 있다. 특희, JWT 를 이용하는 방식은 헤비하지 않고 아주 간편하고 쉽게 적용 가능하다.



- 사이드 프로젝트를 진행할때 아주 유용한 방식이다.

- 몇가지 고려 사항만 잘 대응하면 대규보 프로젝트에서도 충분히 사용될 수 있다.



----



#### JWT는 Header, Payload, Signature 3개의 부분으로 수겅되어 있다.



- **Header**
  - Signature를 해싱하기 위항 알고리즘 정보들이 담겨있다.

- **Payload**
  - 서버와 클라이언트가 주고받는, 시스템에서 실제로 사용될 정보에 대한 내용을 담고있다.

- **Signature**
  - 토큰의 유효성 검증을 위한 문자열이다.
  - 문자열을 통해 서버에서는 이 토큰이 유효한 토큰인지 검증할 수 있다.



- **JWT 장점**
  - 중앙의 인증서버, 데이터 스토어에 대한 의존성 없음, 시스템 수평 확장 유리
  - Base64 URL Safe Encoding > URL, Cookie, Header 모두 사용가능
- **JWT 단점**
  - Payload의 정보가 많아지면 네트워크 사용량 증가, 데이터 설계 고려 필요
  - 토큰이 클라이언트에 저장, 서버에서 클라이번트의 토큰을 조작할 수 없음



----

##### [ 설정 ]

Project : Gradle Project

Language : Java

SpringBoot : 2.4.1

Package : Jar

Java : 8

Spring Wed

Spring Security

Spring Data JPA

H2 , Lombok, Validation



---

#### Day - 2

#### [ 오늘의 학습 ]

- 401 unauthorized 해결을 위한 Security 설정
- Datasource, JPA 설정
- Entity 생성
- H2 Console 결과 확인 

