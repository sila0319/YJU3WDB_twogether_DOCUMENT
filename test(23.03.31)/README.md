spring 기초 설정
 Type : Gradle-Groovy
 packaging : War
 Java Version : 11
 Spring Boot Version : 2.7.10


간단한 회원가입 폼

회원가입 양식은 id, pw 2개로 이루어져있음

(1차) 회원가입

전종찬 - spring 으로 서버를 열고 POST로 오는 방식을 DB에 저장함,

박준홍 - 로그인(비활성화)창과 회원가입 창을 만들고 회원가입을 할때는 post 방식으로 보냄

(2차) 로그인

전종찬 - 로그인 action이 오게되면 id 값을 받아와 JSON형태로 pw를 같이 불러와 줌

박준홍 - JSON형태의 파일을 보고 로그인 성공시 화면, 실패시 화면을 구성해줌
