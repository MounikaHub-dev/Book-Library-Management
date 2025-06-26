<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.B55.model.RegisterModel" %> 
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Update Page</title>
<!-- Bootstrap CSS CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
body {
    background: linear-gradient(135deg, #6a11cb, #2575fc);
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    height: 100vh;
    display: flex;
    align-items: center;
    justify-content: center;
}
.card {
    border-radius: 20px;
    box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
    padding: 30px;
}
.form-control {
    border-radius: 10px;
}
.btn-primary {
    border-radius: 10px;
    background: linear-gradient(to right, #667eea, #764ba2);
    border: none;
}
.btn-primary:hover {
    background: linear-gradient(to right, #5a67d8, #6b46c1);
}
</style>
</head>
<body>

<% RegisterModel c = (RegisterModel) request.getAttribute("rm"); %>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6 col-lg-5">
            <div class="card">
                <h3 class="text-center mb-4 text-primary">Update</h3>
                <form action="updateServlet" method="post">
                    <div class="mb-3">
                        <label for="id" class="form-label">User ID:</label>
                        <input type="text" class="form-control" id="id" name="id" value="<%= c.getId() %>" readonly>
                    </div>
                    <div class="mb-3">
                        <label for="cname" class="form-label"> User Name: </label>
                        <input type="text" class="form-control" id="cname" name="fullname" value="<%= c.getFullname() %>" placeholder="Enter your name" required>
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email Address:</label>
                        <input type="email" class="form-control" id="email" name="email" value="<%= c.getEmail() %>" placeholder="Enter your email" required>
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password:</label>
                        <input type="password" class="form-control" id="password" name="password" value="<%= c.getPassword() %>" placeholder="Enter your password" required>
                    </div>
                    <button type="submit" class="btn btn-primary w-100">Update</button>
                </form>
               
            </div>
        </div>
    </div>
</div>

</body>
</html>
