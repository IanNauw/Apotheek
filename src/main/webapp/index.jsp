<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Log In / Home</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<jsp:include page="navigation.jsp"/>
<br>
<br>

<h1>Please Log In</h1>

<form action="/Controller">
    <label for="Email">Email</label>
    <input type="text" id="Email">
    <label for="Password">Paswoord</label>
    <input type="password" id="Password">

    <input type="submit" value="Log In">
</form>
</body>
</html>