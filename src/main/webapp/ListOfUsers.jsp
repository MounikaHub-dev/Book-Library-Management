<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.B55.model.RegisterModel"%>
<!DOCTYPE html>
<html>
<head>
<title>User List</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<h2 class="mb-4">User Details</h2>

		<a href="index.jsp" class="btn btn-success mb-3">Register New User</a>

		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>User ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Password</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<RegisterModel> users = (List<RegisterModel>) request.getAttribute("allusers");
				if (users != null && !users.isEmpty()) {
					for (RegisterModel u : users) {
				%>
				<tr>
					<td><%=u.getId()%></td>
					<td><%=u.getFullname()%></td>
					<td><%=u.getEmail()%></td>
					<td><%=u.getPassword()%></td>
					<td><a href="deleteServlet?id=<%=u.getId()%>"
						onclick="return confirm('Do you want to delete?');"
						class="btn btn-danger">Delete</a> <a
						href="updateServlet?id=<%=u.getId()%>" class="btn btn-success">update</a>
					</td>
				</tr>
				<%
				}
				} else {
				%>
				<tr>
					<td colspan="5" class="text-center text-muted">No users found.</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>
