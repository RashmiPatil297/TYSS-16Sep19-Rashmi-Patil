<%@page import="com.tyss.productassessment.dto.Retailer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%
    Retailer bean = (Retailer)session.getAttribute("bean");
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
<a href="./logout" style="float:right;">Logout</a>
<h2>Welcome <%=bean.getEmail()%></h2>
<fieldset>
<legend>Search Product</legend>
<form action="./search">
<table>
<tr>
<td>ID:</td>
<td><input type = "number" name="id"></td>
<td><input type= "submit" value="Search"></td>
</tr>
</table>
</form>
</fieldset>
<%
Retailer retailerBean = (Retailer)request.getAttribute("bean");
%>
<%
if(retailerBean != null){
%>
<table>
<tr>
<th>ProductName</th>
</tr>
<tr>
<%-- <td><%=retailerBean.getProductName() %></td> --%>

</tr>
</table>
<%
}
%>
<h3>${msg}</h3>


</body>
</html>