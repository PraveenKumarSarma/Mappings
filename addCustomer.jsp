<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<center>

    <h1>Welcome to Add Customer Page </h1>
    <form:form action="/manyToMany/saveCustomer" method="post" modelAttribute="customerModel">
<table>
    <tr>
        <td>Customer Id:</td>
    <td> <form:input path="customerId" type="number" readonly="true" required="true"/></td>
    </tr>
    <tr>
        <td>Customer Name:</td>
    <td> <form:input path="customerName" required="true"/></td>
    </tr>
    <tr>
    <td>Email:</td>
        <td><form:input path="email" required="true"/></td>
    </tr>
    <tr>
    <td><input type="submit" value="submit"/></td>
    </tr>
</table>
</form:form>
</center>