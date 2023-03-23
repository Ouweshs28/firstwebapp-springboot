<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Update Todo Page</title>
    <link href="webjars\bootstrap\5.2.3\css\bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <hr>
    <h1>
        Update Todo Details
    </h1>
    <form:form method="post" modelAttribute="todo">
        Description: <form:input type="text" name="description" required="required" path="description"/>
        <form:errors path="description" cssClass="text-warning"/>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="targetReached"/>
        <input type="submit" class="btn btn-success">
    </form:form>
</div>
<script src="webjars\bootstrap\5.2.3\js\bootstrap.min.js"></script>
<script src="webjars\jquery\3.6.4\jquery.min.js"></script>
</body>
</html>