<%-- 
Copyright 2012 Will Provost.
All rights reserved by Capstone Courseware, LLC.
--%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>

<head>
  <title>Pug Stats</title>
  <link rel="stylesheet" type="text/css" href="Pugs.css" />
</head>

<body bgcolor="#53777A" >

  <h2>Pug Stats</h2>

  <table>
    <tr>
      <td>Type:</td>
      <td>${pug.TYPE}</td>
    </tr>
    <tr>
      <td>Weight:</td>
      <td>${pug.weight}</td>
    </tr>
    <tr>
      <td>Age:</td>
      <td>${pug.age}</td>
    </tr>
    <tr>
      <td>Color:</td>
      <td>${pug.color}</td>
    </tr>
    <tr>
  </table>

</body>

</html>

