
<html>

<head>
  <title>Find Pugs</title>
  <link rel="stylesheet" type="text/css" href="Pugs.css" />
</head>

<body bgcolor="#ECD078" >

  <h2>Find Pugs</h2>

  <form action="Query.do" method="post" >
    <table>
      <tr>
        <td>Minimum weight:</td>
        <td><input type="text" name="weightMin" /></td>
      </tr>
      <tr>
        <td>Maximum weight:</td>
        <td><input type="text" name="weightMax" /></td>
      </tr>
    </table>
    <input type="submit" name="query" value="Find Pugs" />
  </form>
  <p><form action="home.jsp" method="get">
		<button type="submit"><strong>BACK TO HOME</strong></button>
	</form></p>
</body>

</html>