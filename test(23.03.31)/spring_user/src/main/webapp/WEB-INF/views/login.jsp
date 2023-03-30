<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
            <h1>로그인</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <label htmlFor="id">이메일</label>
                    <input
                        type="text"
                        id="id"
                    />
                </div>
                <div>
                    <label htmlFor="pw">비밀번호</label>
                    <input
                        type="password"
                        id="pw"
                    />
                </div>
                <button type="submit">로그인</button>
            </form>
            <button onclick="location.href='join'">회원가입</button>
        </div>

</body>
</html>