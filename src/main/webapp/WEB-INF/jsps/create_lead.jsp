<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CreateLead</title>
</head>
<body>
<form action="saveLead" method="post">
<table>
		<tr>
		<td>FirstName:</td>
		<td><input type="text" name="firstName"></td>
		</tr>
		<tr>
		<td>LastName:</td>
		<td><input type="text" name="lastName"></td>
		</tr>
		<tr>
		<td>salary:</td>
		<td><input type="text" name="salary"></td>
		</tr>
		<tr><td><input type="submit" value="save"></td></tr>
</table>
</form>
</body>
</html>