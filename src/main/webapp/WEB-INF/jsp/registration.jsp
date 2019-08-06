<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring Rest Client</title>
</head>
<body>

	<h3>${message}</h3>
	<h2 class="">Send Money</h2>

	<form:form action="action" method="POST" modelAttribute="student">
		<form:label path="firstName">First Name:</form:label>
		<form:input type="text" placeholder="Enter wallet id" path="firstName" />
		<br>
		<form:label path="lastName">Name:</form:label>
		<form:input type="text" placeholder="Wallet Name" path="lastName" />
		<br>
		<form:label path="email">Email:</form:label>
		<form:input type="text" placeholder="Enter Amount" path="email" />
		<br>
		<button type="submit">Registration</button>
	</form:form>

</body>
</html>
