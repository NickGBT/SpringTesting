<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<body>
    <h1>${message}</h1>

    <c:url value="/resources/test.txt" var="url"/>
    
    <c:out value="${mappedvalue}"></c:out>

    <p>JSTL URL: ${url}</p>
</body>

</html>