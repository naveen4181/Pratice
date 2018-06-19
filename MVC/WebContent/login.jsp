<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<script>

function d()
{
window.history.forward();
alert("fuck off");

	}

</script>

<body onload="d();">
<center>
<form name="data" action ="controller" method="post">
Name:<input type="text" name="name">
Password:<input type="password" name="pass">
<input type="submit">
</form>s
</center>

</body>
</html>