<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Username and Password</title>
</head>
<body>
   
    <%
    
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        if(uname.equals(pwd)){
            %>
            <%@ include file="slip16Q1a_Login.html" %>
            <%
        }
        else{
            %>
            <%@ include file="slip16Q1a_Error.html" %>
            <%
        }
        %>
</body>
</html>

