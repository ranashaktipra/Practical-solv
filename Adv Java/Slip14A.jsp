<%
    String name = request.getParameter("name");
    int age = Integer.parseInt(request.getParameter("age"));
    if(age>=18){
        out.println(name +" is Eligible for Voting");
    }
    else{
        out.println(name +" is not Eligible for Voting");
    }
%>