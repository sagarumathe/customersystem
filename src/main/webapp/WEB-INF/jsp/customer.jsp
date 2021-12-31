<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRM - ADD CUSTOMER </title>
<style>
td, th {
  font-family: arial, sans-serif;
}
</style>
<script type="text/javascript">
    function validate() {
         if (document.forms["customer"]["firstName"].value == "") {
              alert("Please enter first name");
              document.forms["customer"]["firstName"].focus();
              return false;
         }
         if (document.forms["customer"]["lastName"].value == "") {
              alert("Please enter last name");
              document.forms["customer"]["lastName"].focus();
              return false;
         }
         if (document.forms["customer"]["email"].value == "") {
              alert("Please enter email id");
              document.forms["customer"]["email"].focus();
              return false;
         }
         if (document.forms["customer"]["mobile"].value == "") {
             alert("Please enter Mobile no");
             document.forms["customer"]["mobile"].focus();
             return false;
        }
   }
</script>
</head>
<body style="background-color: #FFFFE0;">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Customer <c:out value="${customer.id != null ? 'Update' : 'Registration' }" /></h2></div>
  <form:form method="POST" modelAttribute="customer" action="/home" name="customer">
     <table style="vertical-align: center; margin-left:20%;">
 
        <tr>
            <td><form:hidden path="id" value = ""/></td>
        </tr>
        <tr>
            <td>First Name :</td>
            <td><form:input path="firstName" id="firstName" /></td>
        </tr>
        <tr>
            <td>Last Name :</td>
            <td><form:input path="lastName" id="lastName"/></td>
        </tr>
        <tr>
            <td>Email Id :</td>
            <td><form:input path="email" id="email"/></td>
        </tr>
        <tr>
             <td>Mobile No :</td>
             <td><form:input path="mobile" /></td>
        </tr>
        <tr>
            <td>Address :</td>
            <td><form:input path="address" id="address"/></td>
        </tr>
        <tr>
             <td colspan="2"><input type="submit" value="<c:out value="${customer.id != null ? 'Update' : 'Register' }" />"
             onclick="return validate();">&nbsp;&nbsp; <a href="/list">Employee List</a>&nbsp;
            <c:if test="${customer.id ne null}"><b>|</b>&nbsp;<a href="/registration">Registration</a></c:if>
         </td>
    </tr>
</table>
</form:form>

</body>
</html>