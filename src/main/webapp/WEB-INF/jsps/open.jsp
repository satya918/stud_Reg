<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create Lead</title>
</head>
<body>
	<form action="save" method="post">
		<pre>
					
			firstName<input type="text" name="firstname"/>
			lastName<input type="text" name="lastname"/>
			emailId<input type="text" name="emailid"/>
			mobile<input type="number" name="mobile"/>
			<input type="submit" value="save"/>
		
		</pre>
		
		</form>
		${msg}

</body>
</html>