<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Register</legend>
		<form action="./register" method="post">
			<table>
				
				
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name" maxlength="17"/></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email" /></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" /></td>
				</tr>
				
				<tr>
					<td><input type="reset" value="reset" /></td>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form>
		</fieldset>
		<a href="./login">Click Here to Login</a>

</body>
</html>