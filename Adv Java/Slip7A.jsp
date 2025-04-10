<% 
String e = request.getParameter("email");
String exp = "^[A-Za-z0-9+_.-]+@(.+)$";
if(e.matches(exp)){
    out.print("Valid Email");
}
else{
    out.print("Invalid Email");
}
%>
