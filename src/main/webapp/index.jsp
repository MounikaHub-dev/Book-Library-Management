<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
		<div class="col-md-3">
		</div>
		<div class="col-md-6">
    <h1>Library Registration</h1>
    <form name="registration" method="post" action="register">
        
        <input type="text" id="fullname" name="fullname" placeholder="FULL NAME">

        
        <input type="email" id="email" name="email" placeholder="EMAIL">

 
        <input type="password" id="password" name="password" placeholder="PASSWORD">

        <button type="submit" > SUBMIT </button>
    </form>
    </div>
    <div class="col-md-3"></div>
     <p class="text-center mt-3 text-muted">Already have an account? 
                    <a href="login.jsp" class="text-decoration-none">Login</a>
                </p>
    </div>

</div>
</body>
</html>