<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create Lead</title>
</head>
<body>
	<form action="updatecust" method="post">
		<pre>
					<input type="hidden" name="id" value="${del.id }"/>
			firstName<input type="text" name="firstname" value="${del.firstname}"/>
			lastName<input type="text" name="lastname" value="${del.lastname}"/>
			emailId<input type="text" name="email" value="${del.email}"/>
			mobile<input type="number" name="mobile" value="${del.mobile}"/>
						Dob<input type="date" name="dob" value="${del.dob}"/>
						GENDER<input type="text" name="gender" value="${del.gender}"/>
						Qualification<input type="text" name="qualification" value="${del.qualification}"/>
			
			<input type="submit" value="Update"/>
		
		</pre>
		
		</form>
		${msg}

</body>
</html>