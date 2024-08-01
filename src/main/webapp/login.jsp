<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>공룡게임</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<style>
/* 구글 폰트 import url */
/* 구글 폰트 CSS rules를 전체 적용 */
@import
	url('https://fonts.googleapis.com/css2?family=Do+Hyeon&family=Gowun+Dodum&display=swap')
	;

@import
	url('https://fonts.googleapis.com/css2?family=Black+Han+Sans&display=swap')
	;

* {
	font-family: "Gowun Dodum", sans-serif;
}

h2 {
	/* font-family: "Black Han Sans", sans-serif; */
	font-weight: 400px;
	font-style: normal;
	margin-bottom: 40px;
}

body {
	background-color: white;
	color: black;
}

.header {
	background-size: cover;
	background-image:
		url('https://i.pinimg.com/originals/26/b8/f1/26b8f1a0d3308bd834ad7152b6062e1a.gif');
	background-position: right;
	height: 826px;
	display: flex;
	flex-direction: column;
}

.header>h1 {
	margin: 0;
	font-size: 40px;
}

.header>div {
	font-size: 18px;
	margin-top: 10px;
}

.form-button {
	width: 150px;
	height: 40px;
	background-color: transparent;
	border: 1px solid tr;
	color: black;
	font-size: 15px;
	margin: 20px 10px 0px 0px;
}

.form-button:hover {
	border: 2px solid black;
}

.info-button {
	margin: 20px 0 0 15px;
	height: 40px;
	font-size: 14px;
}

.post {
	width: 500px;
	margin: 20px 0px 1px 20px;
	padding: 20px;
	box-shadow: 0px 0px 3px 0px transparent;
	background-color: wheat;
}

.form-floating input, .form-floating textarea {
	color: black;
	background-color: white;
}

.button2 {
	display: flex;
	justify-content: flex-end;
	margin-top: 15px;
}

.button2>button {
	margin-right: 10px;
}

.mycards {
	width: 1050px;
	margin: 30px auto;
	flex-direction: row;
	align-items: center;
}

.col {
	margin: 10px auto 0px auto;
}

.card {
	border-radius: 30px;
	background-color: white;
	border: none;
	color: black;
	margin-left: 50px;
	width: 300px;
}

.card-img-top {
	object-fit: cover;
	height: 200px;
	border-radius: 20px;
}

.card-title {
	margin-top: 10px;
	font-size: 18px;
}

.card-body {
	border: blanchedalmond 2px solid;
	border-radius: 20px;
}

.card-text {
	color: black;
}

.comment {
	color: black;
}

.play-button {
	display: flex;
	justify-content: flex-start;
	margin-top: 15px;
}

a.nav-link {
	color: #F17228;
	font-size: large;
}

.icon {
	height: 50px;
	margin-left: -50px;
}

.card-button {
	background-color: orange;
	color: white;
	text-align: center;
	padding: 10px 15px;
	border: none;
	border-radius: 6px;
	cursor: pointer;
}

.card-title {
	font-weight: bold;
}

.card-button>:hover {
	background-color: darkorange;
}

#input-card {
	width: 1299px;
	height: 610px;
	margin: 0px auto;
	padding: 20px;
	background-color: #f9f9f9;
	border-radius: 10px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.form-floating input, .form-floating textarea {
	color: black;
	background-color: #f9f9f9;
	border: 1px solid #ccc;
	border-radius: 5px;
	margin-bottom: 10px;
	padding: 10px;
	width: 100%;
}

.form-floating label {
	color: #333;
}

.input-group button, .input-group select {
	background-color: rgb(168, 161, 161);
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	margin-top: 10px;
}

.input-group button:hover, .input-group select:hover {
	background-color: gray;
}

.button2 {
	text-align: right;
}

.button2 button {
	background-color: #F17228;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

.button2 button:hover {
	background-color: #f3620f;
}

.jumbotron-message {
	margin-left: 150px;
}

.logo-name {
	height: 200px;
}

.text-danger {
	margin-top: 20px;
	margin-bottom: -15px;
	margin-left: -13px;
}

.text-ranking {
	text-align: right;
}

.goRanking {
	margin-right: 9px;
}

#copy {
	copy: #333;
	font-size: 0.85rem;
	margin-top: -225px;
	margin-left: 270px;
}

.registration-form {
	/* background-color: #fff; */
	padding: 20px;
	width: 400px;
	height: 500px;
	margin: 20px auto;
}

.form-group {
	position: relative;
}

.form-group input, .form-group select {
	width: calc(100% - 20px);
	padding: 14px 10px;
	border: 1px solid #ccc;
	/* border-radius: 3px; */
	font-size: 14px;
	margin-bottom: 20px;
}

.form-group input[type="radio"] {
	width: auto;
}

#signUpButton {
	width: calc(100% - 20px);
	padding: 10px;
	background-color: #d9d9d9;
	color: white;
	border: none;
	border-radius: 3px;
	font-size: 16px;
	cursor: pointer;
	margin-top: 10px;
}

#signUpButton:hover {
	background-color: #bab6b6;
}
</style>

</head>
<body>
	<!-- Navbar -->
	<header class="p-3 text-bg-dark">

		<div class="container">
			<div
				class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
				<a href="/"
					class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
					<svg class="bi me-2" width="40" height="32" role="img"
						aria-label="Bootstrap">
                        <use xlink:href="#bootstrap"></use>
                    </svg>
				</a>
				<ul
					class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
					<img
						src="https://static-00.iconduck.com/assets.00/f-letter-icon-2048x2048-1jnqbk05.png"
						class="icon">
					<div id="logo-name">
						<li><strong><a href="#"
								class="nav-link px-2 text-danger">actory Game</a></strong></li>
					</div>
				</ul>

				<div class="text-end">
					<button type="button" class="btn btn-warning goRanking">랭킹보기</button>
					<button type="button" class="btn btn-warning me-2">Login</button>
					<button type="button" class="btn btn-warning">Sign-up</button>
				</div>
			</div>
		</div>

	</header>

	<!-- 점보 트론 적용 jumbotron -->
	<div class="header">
		<div class="p-5 mb-4 bg-body-tertiary rounded-3">
			<div class="container-fluid py-5">
				<div class="jumbotron-message"></div>

				<!-- 부트스트랩 인풋 박스 적용-->
				<div class="post" id="input-card">
					<div class="form-floating mb-3">
						<form class="registration-form" method="post"
							action="../index.do">
							<h2>로그인</h2>
							<div class="form-group" id="form-id">
								<input type="text" id="id" name="id" placeholder="아이디를 입력해 주세요">
							</div>
							<div class="form-group" id="form-password">
								<input type="password" id="password" name="password"
									placeholder="비밀번호를 입력해 주세요" required>
							</div>
							<button type="submit" id="signUpButton">로그인하기</button>
							<form />
					</div>
				</div>

			</div>
		</div>
	</div>

	<div class="container2">
		<footer
			class="row row-cols-1 row-cols-sm-2 row-cols-md-5 py-5 my-5 border-top">
			<div class="col mb-3">
				<a href="/"
					class="d-flex align-items-center mb-3 link-body-emphasis text-decoration-none">
				</a>
			</div>
			<div class="col mb-3"></div>
			<div class="col mb-3">
				<h5>Section</h5>
				<ul class="nav flex-column">
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">Home</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">Features</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">Pricing</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">FAQs</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">About</a></li>
				</ul>
			</div>

			<div class="col mb-3">
				<h5>Section</h5>
				<ul class="nav flex-column">
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">Home</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">Features</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">Pricing</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">FAQs</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">About</a></li>
				</ul>
			</div>

			<div class="col mb-3">
				<h5>Section</h5>
				<ul class="nav flex-column">
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">Home</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">Features</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">Pricing</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">FAQs</a></li>
					<li class="nav-item mb-2"><a href="#"
						class="nav-link p-0 text-body-secondary">About</a></li>
				</ul>
			</div>
			<div id=copy>&copy; 강유나 정기웅 정나실 2024</div>
		</footer>
	</div>

</body>
</html>