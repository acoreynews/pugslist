<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
  <title>Query Results</title>
  <link rel="stylesheet" type="text/css" href="Pugs.css" />
</head>

<body bgcolor="#F8F8E8" >

  <h2>Query Results</h2>

  <p>
    Cars in your price range:
  </p>
  
  <c:forEach var="pug" items="${results}" >
    <p><a href="CreateNewPugListing.do?car=${pug.TYPE}" >${car.weight} ${car.age} ${car.color}</a></p>
  </c:forEach>

</body>

</html>