<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sum of First and Last Digit</title>
    <style>
        .result {
            color: red;
            font-size: 18px;
        }
    </style>
</head>
<body>
<%
    // Function to calculate the sum of the first and last digit of a number
    int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }

    // Example number
    int number = 12345;

    // Calculate the sum
    int sum = sumFirstAndLastDigit(number);
%>

<h1>Sum of the first and last digit of <%= number %> is:</h1>
<div class="result"><%= sum %></div>

</body>
</html>
