<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student" >
			<p>First Name: <form:input path="firstName"/></p>
			<br>
			<p>Last Name: <form:input path="lastName"/></p>
			<br>
			<p>Country:</p>
			 <form:select path="country">
			
				<form:options items="${theCountryOptions}" />
			
				<%-- <form:option value="Brazil" label="Brazil"/>
				<form:option value="France" label="France"/>
				<form:option value="Germany" label="Germany"/>
				<form:option value="India" label="India"/> --%>
			</form:select> 
			<br>
			<p>Favorite Language</p>
			<form:radiobuttons path="favoriteLanguage" items="${thefavoriteLanguage}"/>
			<br>
			<p>Operating System</p>
			<form:checkboxes path="operatingSystems" items="${theListOfSystems}"/>
			<br>
			<input type="submit" value="Submit" />
	</form:form>
</body>
</html>