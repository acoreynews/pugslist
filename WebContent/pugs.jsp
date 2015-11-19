<%-- 
Copyright 2012 Will Provost.
All rights reserved by Capstone Courseware, LLC.
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
   <title>Pugs</title> 
  <link rel="stylesheet" type="text/css" href="Pugs.css" />
</head>
<body bgcolor="#F8F8E8" >

  <h2>Pugs</h2>
<img src="fBrG5ZE.gif" alt="Mountain View" style="width:304px;height:228px;">
  <p>
    Pugs currently available:
    <table>
    <c:forEach var="p" items="${pugs}">
    <tr>
    <td>${p.TYPE}</td>
    <td>${p.age}</td>
    <td>${p.weight}</td>
    <td>${p.color}</td>
    </tr>
    </c:forEach>
    </table>
  </p>
<p><form action="home.jsp" method="get">
		<button type="submit"><strong>BACK TO HOME</strong></button>
	</form></p>
</body>
</html>