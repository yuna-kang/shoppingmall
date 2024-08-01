<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.registration-form{
		background-color: #fff;
        padding: 20px;
        width: 400px;
        height: 500px;
        margin: 20px auto;	
	}
	.form-group {
        position: relative;
    }  
	 .form-group input,
    .form-group select {
        width: calc(100% - 20px);
        padding: 14px 10px;
        border: 1px solid #ccc;
        /* border-radius: 3px; */
        font-size: 14px;
        /* margin-bottom: 0;  */
    }
    .form-group input[type="radio"] {
        width: auto;
    }
    
     button {
        width: 100%;
        padding: 10px;
        background-color: #d9d9d9;
        color: white;
        border: none;
        border-radius: 3px;
        font-size: 16px;
        cursor: pointer;
        margin-top: 10px; 
    }

    button:hover {
        background-color: #bab6b6;
    }
	

</style>

</head>
<body>
<h2>로그인폼</h2>
	<form class="registration-form">
        <div class="form-group" id="form-id">
            <input type="email" id="email" name="email" placeholder="이메일을 입력해 주세요" >
        </div>
        <div class="form-group" id="form-password">
            <input type="password" id="password" name="password" placeholder="비밀번호를 입력해 주세요" required>
        </div>
        
        <div class="form-group" id="form-username">
            <input type="text" id="username" name="name" placeholder="이름을 입력해 주세요" required>
        </div>
        <div class="form-group" id="form-birth">
            <input type="text" id="birthdate" name="birthdate" maxlength="8" placeholder=" 생년월일을 입력해 주세요"required>
        </div>
        <div class="form-group gender-group">
            <input type="radio" id="male" name="gender" value="male" >
            <label for="male" class="gender-option" id="option-man">남자</label>
            <input type="radio" id="female" name="gender" value="female" >
            <label for="female" class="gender-option" id="option-woman">여자</label>
            <input type="radio" id="none" name="gender" value="none" >
            <label for="none" class="gender-option" id="option-nothing">선택안함</label>
        </div>
        <button type="submit" id="signUpButton">가입하기</button>
	<form/>

</body>
</html>