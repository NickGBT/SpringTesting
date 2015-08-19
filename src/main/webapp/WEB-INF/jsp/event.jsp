<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<body>
	<h1>${name}</h1>

	<c:url value="/resources/test.txt" var="url" />

	<p>JSTL URL: ${url}</p>
	
<br/>

	<c:out value="${mappedvariable}"></c:out>

<br/>

	<c:out value="${ifstatement}"></c:out>

<br/>

	<c:forEach items="${arraylisttest}" var="listValue">
		<tr>
			<td><c:out value="${listValue}"></c:out></td>
		</tr>
	</c:forEach>

<br/>

	<c:forEach items="${arraylisteventtest}" var="event">
		<tr>
			<td><c:out value="${event.eventId}"></c:out></td>
			<td><c:out value="${event.eventName}"></c:out></td>
		</tr>
	</c:forEach>

<br/>

	<c:forEach items="${tokenlist}" var="listvalue">
		<tr>
			<td><c:out value="${listvalue}"></c:out></td>
		</tr>
	</c:forEach>

<br/>

	<c:forEach items="${eventlist}" var="event">
		<tr>
			<td><c:out value="${event.eventId}"></c:out></td>
			<br/>
			<td><c:out value="${event.eventName}"></c:out></td>
		</tr>
	</c:forEach>
</body>

</html>