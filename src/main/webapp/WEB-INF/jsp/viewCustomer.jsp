<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
</head>
<body style="background-color: #FFFFE0;">

<div style="margin-top:50px; margin-left:200px; height:50px;"><h2>Customers List</h2></div>
   <table style="margin-top: 0px;margin-left: 100px; ">
   		<tr>
           <th>CustID</th>
           <th>First Name</th>
           <th>Last Name</th>
           <th>Email Id</th>
           <th>Mobile No.</th>
       </tr>
       <c:forEach items="${customerList}" var="customer">
       <tr>
           <td>${customer.id}</td>
           <td>${customer.firstName}</td>
           <td>${customer.lastName}</td>
           <td>${customer.email}</td>
           <td>${customer.mobile}</td>

    
           <td>
              <a href="/edit?id=${customer.id}" >Edit</a>
           </td>
           <td>
              <form action="/delete?id=${customer.id}" method="post">
                <input type="submit" value="Delete" style="background:none;border:0px;cursor: pointer;"/>
              </form>
           </td>
       </tr>
       </c:forEach>
   </table>
   <div align = "center">
   <form action="/cust" method="get">
                <input type="submit" value="Add Entry" />
              </form>
   </div>
</body>
</html>