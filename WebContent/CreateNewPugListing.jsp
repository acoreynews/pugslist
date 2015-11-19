<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
  <title>Welcome to Pugslist!</title> 
  <link rel="stylesheet" type="text/css" href="Pugs.css" />
</head>

 <body bgcolor="#F8F8E8" >

  <h2>New Pug Listing</h2>

  <form action="CreateNewPugListing.do" method="POST" >
    <table>
      <tr>
        <td>TYPE:</td>
        <td><input path="TYPE" name="TYPE" /></td>
      </tr>
      <tr>
        <td>Age:</td>
        <td><input path="age" name="age"/></td>
      </tr>
      <tr>
        <td>Weight:</td>
        <td><input path="weight" name="weight" /></td>
      </tr>
      <tr>
        <td>Color:</td>
        <td><input path="color" name="color" /></td>
      </tr>
    </table>
    <input type="submit" name="addPug" value="Add to Pugslist" />
  </form>
  <p><form action="home.jsp" method="get">
		<button type="submit"><strong>BACK TO HOME</strong></button>
	</form></p>
</body>

</html>
