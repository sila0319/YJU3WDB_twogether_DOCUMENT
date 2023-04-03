<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method ="post" action="/add">
            <div>
                <label htmlFor="userid">아이디</label>
                <input
                    type="text"
                    name="id"
                    required
                />
            </div>
            <div>
                <label htmlFor="password">비밀번호</label>
                <input
                    type="password"
                    name="pw"
                    required
                />
            </div>
           <!--  <div>
                <label htmlFor="passwordConfirm">비밀번호 확인</label>
                <input
                    type="password"
                    name="passwordConfirm"
                    required
                />
            </div> -->
            <button type="submit">회원가입</button>
        </form>

</body>
</html>