<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
   <s:form action="login">
     <s:textfield name="username" label="User Name" placeholder="type Username"></s:textfield>
     <s:password name="password" label="Password"></s:password>
     <s:textfield name="phoneno" label="Phone Number" placeholder="Add 10 Dig Number"></s:textfield>
     <s:textfield name="email" label="Email" type="email"></s:textfield>
     <s:submit value="Login"></s:submit>
   </s:form>
</body>
</html>