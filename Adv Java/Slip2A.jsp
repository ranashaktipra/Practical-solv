<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Perfect Number Check</title>
</head>
<body>
<h2>Perfect Number Check</h2>
    <form action="perfectNumberCheck.jsp" method="post">
Enter a number: <input type="text" name="number"/>
        <input type="submit" value="Check"/>
    </form>
    <%
String numberStr = request.getParameter("number");
        if (numberStr != null && !numberStr.isEmpty()) {
int number = Integer.parseInt(numberStr);
int sum = 1;
            for (int i = 2; i <= number / 2; i++) {
		if (number % i == 0) {
sum += i;
                }
						}
boolean isPerfect = (sum == number && number != 1);
            out.println("<p>The number " + number + " is " + (isPerfect ? "a perfect number." : "not a perfect number.") + "</p>");
		}
		%>
</body>
</html>
