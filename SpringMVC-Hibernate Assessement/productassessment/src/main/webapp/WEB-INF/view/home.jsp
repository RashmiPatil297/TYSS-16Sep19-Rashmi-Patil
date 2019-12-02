<%@page import="com.tyss.productassessment.dto.ProductBean"%>
<%@page import="com.tyss.productassessment.dto.Retailer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	Retailer bean = (Retailer) session.getAttribute("bean");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changePassword">Change Password</a>
	<a href="./delete">Delete Profile</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h2>
		Welcome
		<%=bean.getEmail()%></h2>
	<fieldset>
		<legend>Search Product</legend>
		<form action="./search" method="post">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
		ProductBean product = (ProductBean) request.getAttribute("bean");
	%>
	<%
		if (product != null) {
	%>
	<table style="border: solid 1px black">
		<tr style="border: solid 1px black">
			<th>PID</th>
			<th>PName</th>
			<th>Price</th>
		</tr>
		<tr style="border: solid 1px black">
			<td><%=product.getPid()%></td>
			<td><%=product.getPname()%></td>
			<td><%=product.getPrice()%></td>
			<%
}
%>
			<h3>${msg}</h3>
</body>
</html>