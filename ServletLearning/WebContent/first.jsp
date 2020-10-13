<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world</h1>


<%!                  //declaration tag
  int a=50;
  int b=50;
  String name="Amit kumar";
  
  public int doSum(){
	  return a+b;
  }

 public String reverse(){
	 StringBuffer bf = new StringBuffer(name);
	 return bf.reverse().toString();
 }
%>

<%
out.println(a);         //scriptlet tag 
out.println("<br>");
out.println(b);
out.println("<br>");
out.println(doSum());
out.println("<br>");
out.println(reverse());
%>


<h1>sum is : <%=doSum()%></h1>    //expression tag
<h1>name is : <%=name%></h1>
</body>
</html>