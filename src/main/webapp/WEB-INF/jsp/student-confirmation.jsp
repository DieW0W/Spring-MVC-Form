<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	<p>Student is confirmed: ${student.firstName} ${student.lastName} </p>
	<br>
	<p>Country: ${student.country}</p>
	<br>
	<p>Favorite Language: ${student.favoriteLanguage}</p>
	<br>
	<p>Operating System</p>
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>