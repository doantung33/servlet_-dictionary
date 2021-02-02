<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2/2/2021
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% Map<String ,String> map= new HashMap<>();
%>
<% map.put("hello","Xin Chào");
 map.put("goodbye","Tạm Biệt");
 map.put("dog","Chó");
 map.put("cat","Mèo");

 String search = request.getParameter("txtSearch");

 String result= map.get(search);
 if (result!=null){
     out.println("Word: "+search);
     out.println("Result: "+result);
 }else {
     out.println("Not found");
 }
 %>
</body>
</html>
